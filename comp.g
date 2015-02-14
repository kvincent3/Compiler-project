grammar comp;

options{
output=AST;
}
tokens{
VAR;
FONCTION='function';
PROCEDURE='procedure';
AFFECTATION='affectation';
BLOC;
ITERATION; 
CONDITION; 
RETOUR='retour'; 
READ='read'; 
WRITE='write';	      
APPEL	      ;
}
prog 	    :  'do'  (declaration)*   (instruction)+   'end' -> ^('do' ((declaration)*)? (instruction)+ 'end') 
;
declaration :  dec_var -> dec_var
		| dec_func ->dec_func
		| dec_proc ->dec_proc
;	
dec_var     :  type    IDF (','   IDF)* ->^(VAR IDF)
; 
type        : 'integer'->^('integer')  
                        | 'boolean'->^('boolean')  
                        |  'array' ->^('array');
dec_func    :  ent_func  (declaration )*  ( instruction)+ 'end' ->^(FONCTION)
//^(ent_func (declaration)* (instruction)+ 'end)
;
dec_proc    :  ent_proc  (declaration )*  ( instruction)+ 'end' ->^(PROCEDURE)
;
ent_func    : 'function'    type   IDF   param -> ^('function' ^(type IDF param))
;
ent_proc    : 'procedure'   IDF  param ->^('procedure' ^(IDF param))
;
array 	    : 'array' '[' bounds']' -> ^('array' ^(bounds))
;
bounds      :  CST_ENT '..' CST_ENT (','  CST_ENT '..'  CST_ENT )*;
param       :  '(' (formal   (',' formal   )*)? ')';

formal      : ('adr')? IDF   ':'   type   ;
instruction :   affectation ->affectation
	      | bloc  ->bloc
	      | iteration ->iteration
	      | condition ->condition
	      | retour ->retour
	      | read ->read
	      | write ->write
	      |appel->appel;
appel      :   IDF '(' ( exp( ','exp)* )? ')';	
bloc	   :   'begin'  (declaration)*   (instruction)+   'end';
affectation:    IDF   '='   exp -> ^('=' IDF exp)
                | IDF '[' exp (',' exp )* ']' '=' exp ;
iteration  :   'for'   IDF   'in'   exp   '..'   exp   'do'   ( instruction )+   'end'->^('for' IDF 'in' exp '..' exp 'do' ^( instruction))   ;
condition  :   'if'   exp   'then'   ( instruction )+ ('else'   (instruction)+) ?   'fi' ->^('if' exp ^('then' instruction) ('else' (instruction)+)?);
retour     :   'retour' '('   exp    ')' ;
read       :   'read'    IDF ;
write	   :   'write' (exp
	       | CSTE_CHAINE);
 exp	   :    plus (('+'|'-') plus)*
 	       | 'true'
 	       | 'false'
 	       | exp2;
exp2      :     IDF '(' (exp (',' exp)* )? ')'
               | IDF '[' exp (',' exp )* ']' ;
plus       :   fois ( ('*'|'/') fois)*;
fois       :   atom (  ('=='^ | '!='^ | '<='^ | '>='^ | '<'^ | '>'^ )  atom)* ; 
atom       :   CST_ENT 
		| IDF 
		| '(' exp ')' -> exp
		| '-' atom ->^(VAR)
		;	
CST_ENT    :   ('0'..'9')+;
CSTE_CHAINE:   ('"'('a'..'z' | 'A'..'Z'| ' ' | '\'' )+'"');
IDF        :  ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'| '0'..'9')* ;
WS         :   ('/*'.*'*/'|' '|'\t')+ {$channel=HIDDEN;} ;