grammar BananaCompiler;

prog: EXPRESSION ;

EXPRESSION: 	DECLARATION
                | DEFINITION
                | MATHOPERATION
                ;

DECLARATION:	('new') VARIABLE ;

DEFINITION:	    ('new')? VARIABLE '=' NUMBER ;

MATHOPERATION:	OPERAND
                | OPERAND BASICOPERATION OPERAND
                ;

BASICOPERATION:	'+'
                | '-'
                | '*'
                | '/'
                ;

OPERAND:	    VARIABLE
                | NUMBER
                | CONSTANT
                ;

CONSTANT:   	'PI'
                | 'E'
                | 'BFS'
                ;

NUMBER:		    [0-9]+ ;

VARIABLE:	    [a-zA-Z_][a-zA-Z0-9_]* ;
