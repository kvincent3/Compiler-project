grammar Compile;

options{
output=AST;
}
prog 	    :  'do'  (declaration)*   (instruction)+   'end';
declaration :  dec_var | dec_func | dec_proc;	
dec_var     :  type    IDF (','   IDF)* ; 
type        : ('integer'|'int')  
                        | 'boolean'  
                        |  array ;
dec_func    :  ent_func  (declaration )*  ( instruction)+ 'end' ;
dec_proc    :  ent_proc  (declaration )*  ( instruction)+ 'end' ;
ent_func    : 'function'    type   IDF   param  ;
ent_proc    : 'procedure'   IDF  param ;
array 	    : 'array' '[' bounds']' ;
bounds      :  CST_ENT '..' CST_ENT (','  CST_ENT '..'  CST_ENT )*;
param       :  '(' (formal   (',' formal   )*)? ')';

formal      : ('adr')? IDF   ':'   type   ;
instruction :   affectation 
	      | bloc  
	      | iteration 
	      | condition 
	      | return 
	      | read 
	      | write 
	      |appel;
appel      :   IDF '(' ( exp( ','exp)* )? ')';	
bloc	   :   'begin'  (declaration)*   (instruction)+   'end';
affectation:    IDF   '='   exp  
                | IDF '[' exp (',' exp )* ']' '=' exp ;
iteration  :   'for'   IDF   'in'   exp   '..'   exp   'do'   ( instruction )+   'end'  ;
condition  :   'if'   exp   'then'   ( instruction )+ ('else'   (instruction)+) ?   'fi' ;
return     :   'return' '('   exp    ')' ;
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
atom       :   CST_ENT | IDF | '(' exp ')' | '-' atom;	
CST_ENT    :   ('0'..'9')+;
CSTE_CHAINE:   ('"'('a'..'z' | 'A'..'Z'| ' ' | '\'' )+'"');
IDF        :  ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'| '0'..'9')* ;
WS         :   ('/*'.*'*/'|' '|'\t')+ {$channel=HIDDEN;} ;