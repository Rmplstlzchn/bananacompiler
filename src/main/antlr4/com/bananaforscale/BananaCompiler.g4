grammar BananaCompiler;

prog: expression ;

expression: 	declaration #declare
                | definition #define
                | mathoperation #calc
                ;

declaration:	'#' VARIABLE ;

definition:	    '#'? lval=VARIABLE '=' rval=NUMBER ;

mathoperation:	operand
                | midoperation
                ;

midoperation:   lval=operand midop=midoperator rval=operand;

midoperator:    '+' #Plus
                | '-' #Minus
                | '*' #Times
                | '/' #Through
                ;

operand:	    VARIABLE #var
                | NUMBER #num
                | CONSTANT #const
                ;

CONSTANT:   	'PI'
                | 'E'
                | 'BFS'
                ;

NUMBER:		    [0-9]+ ;

VARIABLE:	    [a-zA-Z_][a-zA-Z0-9_]* ;

WHITESPACE:     [ \t\n\r]+ -> skip;
