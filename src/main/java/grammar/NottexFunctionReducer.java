package grammar;

import evaluation.Evaluator;
import nottex_ast.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NottexFunctionReducer {

    public static NottexNode reduceFunctions(NottexNode node) {
        if (node instanceof BlockNode) {
            return new BlockNode(
                    ((BlockNode) node).getChildren()
                            .stream()
                            .map(NottexFunctionReducer::reduceFunctions)
                            .collect(Collectors.toList())
            );

        } else if (node instanceof TagUseNode) {
            return new TagUseNode(
                    ((TagUseNode) node).getChildren()
                            .stream()
                            .map(NottexFunctionReducer::reduceFunctions)
                            .collect(Collectors.toList()),
                    ((TagUseNode) node).getNames()
            );

        } else if (node instanceof TextNode) {
            return new TextNode(((TextNode) node).getParagraphs());

        } else if (node instanceof FunctionCallNode) {
            return evaluate((FunctionCallNode) node);

        } else {
            throw new AssertionError();
        }
    }

    private static NottexNode evaluate(FunctionCallNode node) {

        Object[] evaldArgs = node.getArguments()
                .stream()
                .map(NottexFunctionReducer::evaluateArgument)
                .collect(Collectors.toSet()).toArray();

        String functionName = node.getName();
        List<Method> methods = Arrays.asList(Evaluator.class.getDeclaredMethods());

        List<Method> potentialMethods = methods.stream()
                .filter(m -> m.getName().equals(functionName))
                .filter(m -> m.getParameterCount() == node.getArgCount())
                .filter(m -> Arrays.asList(m.getGenericParameterTypes())
                        .stream()
                        .map(Type::getTypeName)
                        .collect(Collectors.toList())
                        .equals(
                                node.getArguments()
                                        .stream()
                                        .map(argNode -> argNode.isFunctionCall() ? FunctionCallNode.class.getName() : StringNode.class.getName())
                                        .collect(Collectors.toList())
                        )
                )
                .collect(Collectors.toList());

        if (potentialMethods.size() != 1)
            throw new AssertionError();

        Method method = potentialMethods.get(0);

        try {
            return (NottexNode) method.invoke(null, evaldArgs);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private static NottexNode evaluateArgument(FunctionArgNode argument) {
        return argument.isFunctionCall() ?
                evaluate(argument.getFunArg()) : new StringNode(argument.getStringArg().getValue());
    }

}
