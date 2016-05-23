grammar NoTTeX;


// Everything user writes in NoTTeX is in the tag: ,,tag{}
tag:  TAG_IDENT LBRACE WS* content* WS* RBRACE;

// Tag may consist of another tag or function or text
content: tag                                                    # ContentAsTag
       | function                                               # ContentAsFunction
       | text                                                   # ContentAsText
       ;

// ::function(arg1;;arg2)
function: FUN_IDENT LPAREN WS* function_args WS* RPAREN;


function_args: function_arg? (ARG_SEPARATOR function_arg)*;


function_arg: tag                                               # ArgTag
            | function                                           # ArgFunction
            | (','|';'|':')* WORD+ (','|';'|':')* function_arg*                                              # ArgText
            ;

text: string+;



string:  (WORD|limited)+
      ;

limited: LPAREN|RPAREN|','|';'|':';

TAG: ',,';
FUN: '::';
LBRACE: '{';
RBRACE: '}';
LPAREN: '(';
RPAREN: WS*')';
ARG_SEPARATOR: WS* ';;' WS*;

FUN_IDENT:FUN [a-zA-Z0-9_]+ (WS* ',' WS*[a-zA-Z0-9_]+)* WS*;
TAG_IDENT: TAG [a-zA-Z0-9_]+ (WS* ',' WS*[a-zA-Z0-9_]+)* WS*;
WORD:  ~[,;:(){}]+;


WS: [ \t\r\n]+ -> skip;