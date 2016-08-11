package post_processing.functions;

import nottexast.*;
import nottexast.literals.LiteralAstNode;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionReducer {

    /**
     * Evaluate
     * <p>
     * Method replaces FunctionCallNodes with their evaluated values.
     *
     * @param node - tree that will reduced
     * @return new instance of the input with evaluated nodes (type NottexAstNode)
     */
    public static NottexAstNode reduceFunctions(NottexAstNode node) {
        if (node instanceof BlockAstNode) {
            return new BlockAstNode(
                    ((BlockAstNode) node).getChildren()
                            .stream()
                            .map(FunctionReducer::reduceFunctions)
                            .collect(Collectors.toList())
            );

        } else if (node instanceof TagUseAstNode) {
            return new TagUseAstNode(
                    ((TagUseAstNode) node).getChildren()
                            .stream()
                            .map(FunctionReducer::reduceFunctions)
                            .collect(Collectors.toList()),
                    ((TagUseAstNode) node).getNames()
            );

        } else if (node instanceof TextAstNode) {
            return new TextAstNode(((TextAstNode) node).getContent());

        } else if (node instanceof FunctionCallAstNode) {
            return evaluate((FunctionCallAstNode) node);

        } else {
            throw new AssertionError("Expected {BlockAstNode, TagUseAstNode, TextAstNode, FunctionCallAstNode} but got: "
                    + node.getClass().getName());
        }
    }

    private static NottexAstNode evaluate(FunctionCallAstNode node) {

        List<NottexAstNode> evaldArgs = node.getArguments()
                .stream()
                .map(FunctionReducer::evaluateArgument)
                .collect(Collectors.toList());

        String functionName = node.getName();
        List<Method> methods = Arrays.asList(FunctionEvaluation.class.getDeclaredMethods());

        List<Method> potentialMethods = methods.stream()
                .filter(m -> m.getName().equals(functionName))
                .filter(m -> m.getParameterCount() == node.getArgCount())
                .filter(m -> Arrays.asList(m.getGenericParameterTypes())
                        .stream()
                        .map(Type::getTypeName)
                        .collect(Collectors.toList())
                        .equals(
                                evaldArgs
                                        .stream()
                                        .map(argNode -> argNode.getClass().getName())
                                        .collect(Collectors.toList())
                        )
                )
                .collect(Collectors.toList());

        if (potentialMethods.size() != 1)
            throw new AssertionError("Found wrong number of methods: " + potentialMethods.size());

        Method method = potentialMethods.get(0);

        try {
            return (NottexAstNode) method.invoke(null, evaldArgs.toArray());
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private static NottexAstNode evaluateArgument(FunctionArgAstNode argument) {
        return argument.isFunctionCall() ?
                evaluate(argument.getFunArg()) : LiteralAstNode.copy(argument.getLiteralArg());
    }

}
