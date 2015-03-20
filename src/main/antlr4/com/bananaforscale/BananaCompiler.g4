grammar BananaCompiler;

start: ausdruck;
ausdruck: ausdruck '-' ausdruck
	| '(' ausdruck ')'
	| ZAHL
	;
	
ZAHL: [1-9][0-9]* | [0];
WHITE: [\r\n\t]+ -> skip;