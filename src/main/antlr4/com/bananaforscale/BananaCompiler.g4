grammar BananaCompiler ;

prog: expression ;

expression: 	expression NEWLINE expression
				| lval=VARIABLE '=' mathoperation
                | 'print' lval=VARIABLE
                ;

mathoperation:	mathoperation midop=MIDOPERATOR mathoperation
				| '(' mathoperation ')'
				| NUMBER
				| VARIABLE
                ;

NUMBER:		    [0-9]+ ('.'([0-9])*)? ;
VARIABLE:	    [a-zA-Z_][a-zA-Z0-9_]* ;
MIDOPERATOR:	[+-*/] ;
WHITESPACE:     [ \t\r]+ -> skip ;
NEWLINE:		'\n'+ ;
