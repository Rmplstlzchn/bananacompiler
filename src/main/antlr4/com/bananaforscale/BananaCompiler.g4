grammar BananaCompiler ;

prog: 			expression ;

expression: 	(init|print) NEWLINE expression #Multi
                | init #initialization
                | print #output
                ;

print:          'print' lval=VARIABLE;

init:           lval=VARIABLE '=' op=mathoperation;

mathoperation:	loperand=mathoperation midop=MIDOPERATOR roperand=mathoperation #Calc
				| '(' mathoperation ')' #Parenthesis
				| NUMBER #Num
				| VARIABLE #Var
                ;

NUMBER:		    [0-9]+ ('.'([0-9])*)? ;
VARIABLE:	    [a-zA-Z_][a-zA-Z0-9_]* ;
MIDOPERATOR:	'+'
				| '-'
				| '*'
				| '/'
				;
WHITESPACE:     [ \t\r]+ -> skip ;
NEWLINE:		'\n'+ ;
