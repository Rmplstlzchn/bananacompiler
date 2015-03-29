grammar BananaCompiler;

prog: programmpart;

programmpart:   expression ;

expression: 	declaration #Declare
                | definition #Define
                | mathoperation #Calc
                ;

declaration:	'#' lval=VARIABLE ;

definition:	    declr='#'? lval=VARIABLE '=' rval=NUMBER ;

mathoperation:	operand
                | midoperation
                ;

midoperation:   lval=operand midop=midoperator rval=operand;

midoperator:    '+' #Plus
                | '-' #Minus
                | '*' #Times
                | '/' #Through
                ;

operand:	    VARIABLE #Var
                | NUMBER #Num
                ;

NUMBER:		    [0-9]+ ;
VARIABLE:	    [a-zA-Z_][a-zA-Z0-9_]* ;
WHITESPACE:     [ \t\n\r]+ -> skip;
