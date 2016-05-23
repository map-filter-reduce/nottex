import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Assert;
import org.junit.Test;


@SuppressWarnings("Duplicates")
public class NoTTeXTestGrammarTest {
    public static String lastTestDescription = null;
    public static String successMessage = null;


    @Test
    public void tags_Basic() {
        legal(",,tag{testin}");
        legal(",,tag{test,in}");
        legal(",,tag{t,e,s,t,i,n}");
        illegal(",, tag{testin} 423ge");
        illegal(", , tag{testin} 423ge");
        illegal(",,t ag{testiin} 423ge");
        illegal(",,tag{testiin 423ge");
        illegal(",,tag{");
        illegal(",tag{");
    }

    @Test
    public void tags_spaces() {
        legal(",,tag { t e s t i n}");
        illegal(",, tag{testin}");
        illegal(", , tag{testin}");
    }

    @Test
    public void tags_line_separators() {
        legal(",,tag \n { \n t \n\ne s t i n\n}");
        illegal(",,tag \n { \n t \n\ne s t i n\n} \n ");
    }

    @Test
    public void multiple_tags() {
        legal(",,tag,tag3,tag4{testin}");
    }

    @Test
    public void tags_multiple_ws() {
        legal(",,tag , tag3, tag4{tes t in}");
        legal(",,tag , tag3, tag4 {tes ti n}");
        legal(",,tag , \n tag3,\t tag4 {\ntestin}");
        illegal(",, tag , tag3, tag4 {testin}");
        illegal(", , tag , tag3, tag4 {testin}");
    }

    @Test
    public void tag_inside() {
        legal(",,tag{,,tag2{test}}");
        legal(",,tag{,,tag2{t e s t}}");
        legal(",,tag{,,tag2{t e s t} f,erwf}");
        legal(",,tag{,,tag2{t e s t} ferwf , , , fekw}");
        legal(",,tag{,,tag2{t e s t},,tag{testin},,tag{testin}}");
        legal(",,tag{,,tag2{t \ne s t} ferwf fekw}");
        legal(",,tag{,,tag2,tag3{t \ne s t} ferwf fekw}");
        illegal(",,tag{,,tag2,tag3{t \ne s t} ferwf fekw");
    }


    @Test
    public void functions_basic() {
        legal(",,tag{::fun()}");
        legal(",,tag{::fun\n()}");
        illegal(",,tag{:: fun()}");
        illegal(",,tag{::f un()}");
        illegal(",,tag{::fun(}");
        illegal(",,tag{::fun(,)}");
        illegal(",,tag{::fun(arg1)}");
        illegal(",,tag{::fun(arg1,arg2)}");

    }

    @Test
    public void functions_string_arg() {
        legal(",,tag{::fun()}");
        legal(",,tag{::fun1(\"arg1\")}");
        legal(",,tag{::fun1(\"arg1\",\"arg2\")}");
        legal(",,tag{  ::fun1(\n\"arg1\"\n,\n\"arg2\"\n)}");
        illegal(",,tag{::fun1(  \"arg1\"  ,   \"arg2\"    ");
    }


    @Test
    public void functions_args() {
        legal(",,tag{::fun()}");
        legal(",,tag{::fun1(::fun(\"arg1\"),::fun2())}");
        legal(",,tag{::fun1( ::fun(\"arg1\") \n)}");
        legal(",,tag{::fun1(\"::fun))\",\"arg2\")}");
        illegal(",,tag{::fun1(::fun(\"d\"f),\"arg2\")}");
        illegal(",,tag{::fun1(::fun(f),\"arg2\")}");
        illegal(",,tag{::fun(,,tag1{3})}");
    }


    @Test
    public void parentheses() {
        legal(",,tag{{}{}testin}");
        legal(",,tag{{}{()}testin}");
        legal(",,tag{  }testin}");
        legal(",,tag{  }  testin}");
        legal(",,tag{  (  testin}");
        legal(",,tag{  ){  testin}");
        legal(",,tag{  fkp){  tes\ntin}");
        legal(",,tag{  fkp)}  ((((((\n(((((((((((((((testin)}");
        illegal(",,tag{  fkp)}  testin");
    }


    @Test
    public void limited_symbols() {
        legal(",,tag{, : ( { ) } }");
    }


    @Test
    public void utf_symbols() {
        legal(",,tag{#¤%&/?!+-_.<>}");
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
