grammar nottex;



markupText : (functionCall
        | tagUse
        | text)+
        ;

functionCall : FUNCTION_MARKER name=NOTHING_TO_SEE_HERE ws LPAREN ws argumentsNode=funcArgs? ws RPAREN
             ;

tagUse : TAG_MARKER namesNode=tagIdens ws LBRACE content=markupText? RBRACE
       ;

tagIdens : names+=NOTHING_TO_SEE_HERE (ws COMMA ws names+=NOTHING_TO_SEE_HERE)*
         ;

text : (NOTHING_TO_SEE_HERE|COMMA|COLON|QUOTE|LPAREN|RPAREN|LBRACE|RBRACE|WS)+
     ;

funcArgs : argumentNodes+=funcArg (ws COMMA ws argumentNodes+=funcArg)*
         ;

funcArg : string
         | functionCall
         ;

// TODO: add escaping
string : QUOTE (NOTHING_TO_SEE_HERE|TAG_MARKER|COMMA|FUNCTION_MARKER|COLON|LPAREN|RPAREN|LBRACE|RBRACE|WS)* QUOTE
       ;

ws : WS*
   ;

TAG_MARKER : ',,';
COMMA : ',';
FUNCTION_MARKER : '::';
COLON : ':';    // This is needed because ELSE can't match a single colon; this must be matched separately
LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
QUOTE : '"';
WS : [ \n\r\t];
NOTHING_TO_SEE_HERE : ~(','|':'|'('|')'|'{'|'}'|'"'|' '|'\n'|'\r'|'\t')+;

