grammar nottex;


markup_text : element+
            ;

element : function_call
        | tag_use
        | text
        ;

function_call : FUNCTION_MARKER functionName=NOTHING_TO_SEE_HERE ws LPAREN ws func_args? ws RPAREN
              ;

tag_use : TAG_MARKER tag_idens ws LBRACE markup_text? RBRACE
        ;

tag_idens : NOTHING_TO_SEE_HERE (ws COMMA ws NOTHING_TO_SEE_HERE)*
     ;

text : (NOTHING_TO_SEE_HERE|COMMA|COLON|QUOTE|LPAREN|RPAREN|LBRACE|RBRACE|WS)+
     ;

func_args : func_arg (ws COMMA ws func_arg)*
              ;

func_arg : string
         | function_call
         ;

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

