grammar comp;

options{
output=AST;
ASTLabelType=CommonTree;  
}
tokens{
VAR;
FONCTION='function';
PROCEDURE='procedure';
AFFECTATION='affectation';
DECLARATION='declaration';
INSTRUCTION='instruction';
BLOC;
ITERATION; 
CONDITION; 
RETOUR='retour'; 
READ='read'; 
WRITE='write';	      
APPEL='Appel'      ;
CALL;
PARAM;
LISTPARAM;
DEC_VAR;
ARRAY;
INTERVAL;
BOUNDS;
CASE;
VAL;
TABLEAU;
}
prog 	    :  'do'  (declaration)*   (instruction)*   'end' -> ^('do' ^(DECLARATION ((declaration)* )?) ^(INSTRUCTION (instruction)*) 'end') 
                ;
declaration :  dec_var //-> dec_var
		| dec_func ->dec_func
		| dec_proc ->dec_proc
;	
dec_var     :  type    IDF (','   IDF)*->^(VAR type IDF+)
; 
type        : 		'integer'->^('integer')  
                        | 'boolean'->^('boolean')  
                        |  array ->^(array);
dec_func    :  ent_func  (declaration )*  ( instruction)* 'end' ->^(ent_func ^(BLOC ^(DECLARATION ( declaration)*) ^(INSTRUCTION (instruction)+)) 'end')
//^(ent_func (declaration)* (instruction)+ 'end)
;
dec_proc    :  ent_proc  (declaration )*  ( instruction)* 'end' ->^(ent_proc ^(BLOC  ^(DECLARATION ( declaration)*) ^(INSTRUCTION (instruction)+)) 'end')
;
ent_func    : 'function'    type   IDF   param -> ^(FONCTION IDF type  param)
;
ent_proc    : 'procedure'   IDF  param ->^(PROCEDURE IDF param)
;
array 	    : 'array' '[' bounds']' -> ^(ARRAY bounds)
;
bounds      :  CST_ENT '..' CST_ENT (','  CST_ENT '..'  CST_ENT )*->^(INTERVAL ^(BOUNDS CST_ENT CST_ENT)+);
param       :  '(' (formal   (',' formal   )*)? ')'->^(LISTPARAM formal*)/*^(PARAM formal)**/
;

formal      : ('adr')? IDF   ':'   type   ->^(PARAM 'adr'? IDF type);
instruction :   affectation ->affectation
	      | bloc  ->bloc
	      | iteration ->iteration
	      | condition ->condition
	      | retour ->retour
	      | read ->read
	      | write ->write
	      |appel->appel;
appel      :   IDF '(' ( exp( ','exp)* )? ')' -> ^(APPEL IDF exp*);	
bloc	   :   'begin'  (declaration)*   (instruction)+   'end';
affectation:    IDF   '='   exp -> ^('=' IDF exp)
                | IDF '[' exp4 (',' exp4 )* ']' '=' exp ->^('=' IDF  ^(CASE exp4+ ) ^(VAL exp) );
exp4      
	:	exp;
iteration  :   'for'   IDF   'in'   exp   '..'   exp   'do'   ( instruction )+   'end'->^('for' IDF  exp  exp  ^(INSTRUCTION instruction*))   ;
condition  :   'if'   exp   'then'   ( instruction )+ ('else'   (instruction)+) ?   'fi' ->^('if' exp ^('then' instruction) ^('else' (instruction)+)?);
retour     :   'return' '('   exp    ')'->^(RETOUR exp) ;
read       :   'read'    IDF ->^(READ IDF);
write	   :   'write' exp->^(WRITE exp)
	      | 'write' CSTE_CHAINE ->^(WRITE CSTE_CHAINE)
	       ;
 exp	   :    plus (('+'|'-')^ plus)*
 	       | 'true'
 	       | 'false'
 	       | exp2;
exp2      :     IDF '(' (exp (',' exp)* )? ')'->^(APPEL IDF exp*)
               | IDF '[' exp (',' exp )* ']'->^(TABLEAU IDF ^(CASE exp+))
                ;
plus       :   fois ( ('*'|'/')^ fois)*;
fois       :   atom (  ('=='^ | '!='^ | '<='^ | '>='^ | '<'^ | '>'^ )  atom)* ;
atom       :   CST_ENT 
		| IDF 
		| '(' exp ')' -> exp
		| '-' atom ->^( '-' atom)
		;	
CST_ENT    :   ('0'..'9')+;
CSTE_CHAINE:   ('"'(~'"')* '"');
IDF        :  ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'| '0'..'9')* ;
WS         :   ('/*'.*'*/'|' '|'\t'|'\n')+ {$channel=HIDDEN;} ;