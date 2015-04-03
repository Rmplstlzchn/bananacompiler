grammar BananaCompiler ;

prog: 			expression ;

expression: 	expression NEWLINE expression #Multi
				| lval=VARIABLE '=' mathoperation #Init
                | 'print' lval=VARIABLE #Print
                ;

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
