grammar NoTTeX;


// Everything user writes in NoTTeX is in the tag: ,,tag{}
tag:  TAG_IDENT LBRACE content* RBRACE;

// Tag may consist of another tag or function or text
content: tag                                                    # ContentAsTag
       | function                                               # ContentAsFunction
       | text                                                   # ContentAsText
       ;

// ::function(arg1;;arg2)
function: FUN_IDENT LPAREN function_args RPAREN;


function_args: function_arg? (ARG_SEPARATOR function_arg)*;


function_arg: tag                                               # ArgTag
            |function                                           # ArgFunction
            |text                                               # ArgText
            ;

text: number+
     |string+;

number:NUMBER;

string: LETTER+;


TAG: ',,';
FUN: '::';
LBRACE: '{';
RBRACE: '}';
LPAREN: '(';
RPAREN: WS*')';
ARG_SEPARATOR: WS* ';;' WS*;

FUN_IDENT:FUN [a-zA-Z0-9_]+ (WS* ',' WS*[a-zA-Z0-9_]+)* WS*;
TAG_IDENT: TAG [a-zA-Z0-9_]+ (WS* ',' WS*[a-zA-Z0-9_]+)* WS*;
NUMBER: (([0-9]+'.'[0-9]+)|[0-9]|[1-9][0-9]+);
LETTER:  .;//~[,;:];


WS: [ \t\r\n]+ -> skip;