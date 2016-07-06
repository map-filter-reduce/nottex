grammar Nottex;



markupText : (functionCall
        | tagUse
        | text)+
        ;

functionCall : FUNCTION_MARKER name+=ALPHA(ALPHA|NUMBER)* ws LPAREN ws argumentsNode=funcArgs? ws RPAREN
             ;

tagUse : TAG_MARKER namesNode=tagIdens ws LBRACE content=markupText? RBRACE
       ;

tagIdens : names+=ALPHA(ALPHA|NUMBER)* (ws COMMA ws names+=ALPHA(ALPHA|NUMBER)*)*
         ;

text : content+=(ALPHA|NUMBER|COMMA|COLON|QUOTE|LPAREN|RPAREN|LBRACE|RBRACE|PLUS|MINUS|MULTIP|DIVIS|ESCAPED_QUOTE|BACKSLASH|ESCAPED_BACKSLASH|WS)+
     ;

funcArgs : argumentNodes+=funcArg (ws COMMA ws argumentNodes+=funcArg)*
         ;

funcArg : string        # StringArg
        | expr          # ExpressionArg
        | functionCall  # FunctionCallArg
        ;

expr : left=expr PLUS right=sub             # ExprAdd
     | left=expr MINUS right=sub            # ExprSubtract
     | sub                                  # SubExpr
     ;

sub : left=sub MULTIP right=factor              # ExprMultip
        | left=sub DIVIS right=factor           # ExprDivis
        | minuses+=MINUS+ expression=factor     # ExprMinus
        | factor                                # SubSubExpr
        ;

factor : LPAREN expression=expr RPAREN  # ExprParens
         | NUMBER                       # ExprNumber
         ;

string : QUOTE content+=(ALPHA|NUMBER|TAG_MARKER|COMMA|FUNCTION_MARKER|COLON|LPAREN|RPAREN|LBRACE|RBRACE|PLUS|MINUS|MULTIP|DIVIS|ESCAPED_QUOTE|WS|ESCAPED_BACKSLASH)* QUOTE
       ;

ws : WS*
   ;

TAG_MARKER : ',,';
COMMA : ',';
FUNCTION_MARKER : '::';
COLON : ':';    // This is needed because ALPHA can't match a single colon; this must be matched separately
LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
ESCAPED_QUOTE : '\\"';
ESCAPED_BACKSLASH : '\\\\';
BACKSLASH : '\\';
QUOTE : '"';
PLUS : '+';
MINUS : '-';
MULTIP : '*';
DIVIS : '/';
WS : [ \n\r\t];
NUMBER : ('0'|[1-9][0-9]*)('.'[0-9]+)?;
ALPHA : ~(','|':'|'('|')'|'{'|'}'|'"'|' '|'+'|'-'|'*'|'/'|'\n'|'\r'|'\t'|'\\')+;

