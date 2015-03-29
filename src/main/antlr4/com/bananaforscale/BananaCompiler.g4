grammar BananaCompiler;

prog: expression ;

expression: 	declaration
                | definition
                | mathoperation
                ;

declaration:	('new') VARIABLE ;

definition:	    ('new')? lval=VARIABLE '=' rval=NUMBER ;

mathoperation:	operand
                | lval=operand basicoperand rval=operand
                ;

basicoperand:	'+'
                | '-'
                | '*'
                | '/'
                ;

operand:	    VARIABLE
                | NUMBER
                | CONSTANT
                ;

CONSTANT:   	'PI'
                | 'E'
                | 'BFS'
                ;

NUMBER:		    [0-9]+ ;

VARIABLE:	    [a-zA-Z_][a-zA-Z0-9_]* ;
