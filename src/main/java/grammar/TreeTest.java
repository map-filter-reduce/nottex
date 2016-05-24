package grammar;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;



public class TreeTest {

    private static TreeNode traverseTree(String code) {

        ANTLRInputStream antlrInput = new ANTLRInputStream(code);


        nottexLexer nottexLexer = new nottexLexer(antlrInput);
        CommonTokenStream tokens = new CommonTokenStream(nottexLexer);
        nottexParser parser = new nottexParser(tokens);
        ParseTree tree = parser.markupText();
        return traverseTree(tree);
    }

    private static TreeNode traverseTree(ParseTree node) {


        return null;
    }

    public static void main(String[] args) {
        traverseTree("::suvaline(\"\", ::suv())");
    }
}
