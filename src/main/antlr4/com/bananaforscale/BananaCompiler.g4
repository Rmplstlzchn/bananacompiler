grammar BananaCompiler ;

prog: expression ;

expression: 	expression NEWLINE expression
				| declaration #Declare
                | definition #Define
                | mathoperation #Calc
                ;

declaration:	'#' lval=VARIABLE ;

definition:	    declr='#'? lval=VARIABLE '=' rval=NUMBER 
				| declr='#'? lval=VARIABLE '=' mathoperation
				;

mathoperation:	operand
                | midoperation
				| '(' mathoperation ')'
                ;

midoperation:   lval=operand midop=midoperator rval=operand 
				| mathoperation midop=midoperator rval=operand
				| lval=operand midop=midoperator mathoperation
				| mathoperation midop=midoperator mathoperation
				;

midoperator:    '+' #Plus
                | '-' #Minus
                | '*' #Times
                | '/' #Through
                ;

operand:	    VARIABLE #Var
                | NUMBER #Num
                ;

NUMBER:		    [0-9]+ ('.'([0-9])*)? ;
VARIABLE:	    [a-zA-Z_][a-zA-Z0-9_]* ;
WHITESPACE:     [ \t\r]+ -> skip ;
NEWLINE:		'\n'+ ;
