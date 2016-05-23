import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Assert;
import org.junit.Test;


@SuppressWarnings("Duplicates")
public class NoTTeXTestGrammarTest {
    public static String lastTestDescription = null;
    public static String successMessage = null;




    @Test
    public void test_tags() {
        legal(",,tag{testin tagi}");
        legal(",,tag{testin tagi,,tag{testin tagi,,tag{testin tagi,,tag{testin tagi,,tag{testin tagi}}}}}");
        legal(",,tag{  testin  tagi   ,,tag{    tes ti   n tagi,,tag{testin tagi,,tag{testin tagi,,tag{testin tagi}}}}}");
        legal(",,tag{ %%&//\\ \n  testin : tagi   ,,tag{    tes ti   n tagi,,tag{testin tagi,,tag{testin tagi,,tag{testin tagi}}}}}");
        legal(",,tag,tag4,rag{ %%&//\\ \n  testin : tagi   ,,tag{    tes ti   n tagi,,tag{testin tagi,,tag{testin tagi,,tag{testin tagi}}}}}");
        legal(",,tag, tag4 , rag{ %%&//\\ \n  testin : tagi   ,,tag{    tes ti   n tagi,,tag{testin tagi,,tag{testin tagi,,tag{testin tagi}}}}}");
        legal(",,tag{ %%&//\\ \n  testin : tagi   ,,tag\n{    tes ti   n tagi,,tag{testin tagi,,tag{testin tagi,,tag{testin tagi}}}}}");
        illegal(",,tag{  testin  tagi   ,,tag{    tes ti   n tagi,,tag{testin tagi,,tag{testin tagi,,tag{testin tagi}}}}");
        illegal(",,tag  testin  tagi   ,,tag{    tes ti   n tagi,,tag{testin tagi,,tag{testin tagi,,tag{testin tagi}}}}");
    }

    @Test
    public void test_functions() {
        legal(",,tag{testin tagi ::d()}");
        legal(",,tag{testin tagi ::d(::d())}");
        legal(",,tag{testin tagi ::d(::d();;fwefew)}");
        legal(",,tag{testin 234234.234 32432,423 tagi ::d(       ::d() \n     ;; fwefew             )}");
        legal(",,tag{testin tagi ::d(       ::d() \n     ;; fwefew   ;; ,,tag{ %%&//\\ \n" +
                "  testin : tagi   ,,tag{    tes ti   n tagi,,tag{testin tagi,,tag{testin tagi,,tag{testin tagi}}}}}          )}");

    }

    @Test
    public void test_symbols() {
        legal(",,tag{testin ta,:g:i, .%¤£ ::d( testin ta,:g:i, .%¤£ )}");
    }


    @Test
    public void test_illegals() {
        illegal(",, tag{}");
        illegal("dedfwe ,,tag{}");
        illegal("::d(),,tag{}");
        illegal(",,tag{::}");
        illegal(",,tag{}::d()");
    }


    @Test
    public void test_code1() {
        legal(",,document{\n" +
                "\n" +
                "    ,,code{\n" +
                "        if some:\n" +
                "            print(\"some\")\n" +
                "        elif 1 % 2:\n" +
                "            pass;\n" +
                "    }\n" +
                "\n" +
                "}");
    }

    @Test
    public void test_symbols() {
        legal(",,tag{testin ta,:g:i, .%¤£ ::d( testin ta,:g:i, .%¤£ )}");
    }




    private void legal(String program) {
        check(program, true);
    }

    private void illegal(String program) {
        check(program, false);
    }

    private void check(String program, boolean legal) {
        try {
            System.err.close();
        } catch (Throwable t) {

        }


        boolean parses = true;
        try {
            parseWithExceptions(program);
        } catch (Throwable e) {
            parses = false;
        }

        lastTestDescription = "Katsetan sellise "
                + (legal ? "legaalse" : "mittelegaalse")
                + " programmiga:\n\n>"
                + program.replaceAll("\n", "\n>");


        successMessage = "";

        if (legal) {
            if (!parses) {
                Assert.fail("sinu grammatika ei aktsepteerinud seda");
            } else {
                successMessage = "sinu grammatika aktsepteeris seda";
            }
        } else if (!legal) {
            if (parses) {
                Assert.fail("sinu grammatika aktsepteeris seda");
            } else {
                successMessage = "sinu grammatika ei aktsepteerinud seda";
            }
        }
    }

    private static ParseTree parseWithExceptions(String program) {
        ANTLRInputStream input = new ANTLRInputStream(program);
        NoTTeXLexer lexer = new NoTTeXLexer(input);
        lexer.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
                                    int charPositionInLine, String msg, RecognitionException e) {
                throw e;
            }
        });

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        NoTTeXParser parser = new NoTTeXParser(tokens);

        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
                                    int charPositionInLine, String msg, RecognitionException e) {
                throw e;
            }
        });

        ParseTree parseTree = parser.tag();
        if (parseTree == null
                || parseTree.getChildCount() == 0
                || parser.getNumberOfSyntaxErrors() != 0
                ) {
            throw new RuntimeException("Problem with parsing");
        }

        if (tokens.LA(1) != -1) {
            throw new RuntimeException("Some tokens left after parsing");
        }

        return parseTree;
    }
}
