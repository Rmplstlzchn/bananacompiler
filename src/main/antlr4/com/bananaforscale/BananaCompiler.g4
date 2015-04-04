grammar BananaCompiler ;

prog: 			expression ;

expression: 	(mathoperation|init) NEWLINE expression #Multi
                | init
                | 'print' lval=VARIABLE #Print
                ;

init:           lval=VARIABLE '=' mathoperation

mathoperation:	mathoperation midop=MIDOPERATOR mathoperation #Calc
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
