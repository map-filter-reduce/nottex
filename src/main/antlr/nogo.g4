grammar nogo;



markup_text : word (' '+ word)*
            ;

word : tag_use
     | function_call
     | plain
     ;

function_call : ';;' 'iden' '(' markup_text ')'
              ;

tag_use : ',,' 'iden' '{' markup_text '}'
        ;


plain : 'a'+?
      ;












