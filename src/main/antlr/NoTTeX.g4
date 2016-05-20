grammar NoTTeX;

tag:  TAG_NAME '{'(function|tag|text_line|forbiden_symbols)*'}';



function: FUNCTION_NAME '(' WS* function_arg? WS* (';;' WS* function_arg WS*)* ')';
function_arg: tag | function | text_line;

text_line: forbiden_symbols? TEXT forbiden_symbols? ;

forbiden_symbols: (','|' '|'('|')'|'{'|'}'|':'|';')+;

TAG_NAME: ',,'[a-zA-Z0-9_]+ ;
FUNCTION_NAME: '::'[a-zA-Z0-9_]+;
TEXT: ~[,{}:();]+;

WS : (' '| '\t' | '\r' | '\n')
   ;