grammar lex;



markup_text : element+
            ;

element : function_call
        ;

function_call : DOUBLE_COLON ELSE ws LPAREN ws args? ws RPAREN
              ;

args : arg (ws COMMA ws arg)*;

arg : string
    | function_call
    ;

string : QUOTE (ELSE|DOUBLE_COMMA|COMMA|DOUBLE_COLON|COLON|LPAREN|RPAREN|LBRACE|RBRACE|WS)* QUOTE
       ;

ws : WS*
   ;

DOUBLE_COMMA : ',,';
COMMA : ',';
DOUBLE_COLON : '::';
COLON : ':';    // This is needed because ELSE can't match a single colon; this must be matched separately
LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
QUOTE : '"';
WS : [ \n\r\t];
ELSE : ~(','|':'|'('|')'|'{'|'}'|'"'|' '|'\n'|'\r'|'\t')+;




