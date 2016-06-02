package grammar;

import evaluation.FunctionEvaluation;
import nottexast.*;
import nottexast.literals.LiteralNode;

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
     * @param node - tree that will
     * @return new instance of the input with evaluated nodes (type NottexNode)
     */
    public static NottexNode reduceFunctions(NottexNode node) {
        if (node instanceof BlockNode) {
            return new BlockNode(
                    ((BlockNode) node).getChildren()
                            .stream()
                            .map(FunctionReducer::reduceFunctions)
                            .collect(Collectors.toList())
            );

        } else if (node instanceof TagUseNode) {
            return new TagUseNode(
                    ((TagUseNode) node).getChildren()
                            .stream()
                            .map(FunctionReducer::reduceFunctions)
                            .collect(Collectors.toList()),
                    ((TagUseNode) node).getNames()
            );

        } else if (node instanceof TextNode) {
            return new TextNode(((TextNode) node).getParagraphs());

        } else if (node instanceof FunctionCallNode) {
            return evaluate((FunctionCallNode) node);

        } else {
            throw new AssertionError("Expected {BlockNode, TagUseNode, TextNode, FunctionCallNode} but got: "
                    + node.getClass().getName());
        }
    }

    private static NottexNode evaluate(FunctionCallNode node) {

        List<NottexNode> evaldArgs = node.getArguments()
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
            return (NottexNode) method.invoke(null, evaldArgs.toArray());
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private static NottexNode evaluateArgument(FunctionArgNode argument) {
        return argument.isFunctionCall() ?
                evaluate(argument.getFunArg()) : LiteralNode.copy(argument.getLiteralArg());
    }

}
