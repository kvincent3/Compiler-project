grammar base;

prog :  'do'  (declaration)*   (instruction)+   'end';
declaration:	 dec_var | dec_func | dec_proc;	
dec_var : type    IDF (','   IDF)* ; 
type : ('integer'|'int')  | 'boolean'  |  array ;
dec_func : ent_func  (declaration )*  ( instruction)+ 'end' ;
dec_proc: ent_proc  (declaration )*  ( instruction)+ 'end' ;
ent_func: 'function'    type   IDF   param  ;
ent_proc : 'procedure'   IDF  param ;
array : 'array' '[' bounds']' ;
bounds : CST_ENT '..' CST_ENT (','  CST_ENT '..'  CST_ENT )*;

param:  '(' (formal   (',' formal   )*)? ')';

formal: ('adr') ?   IDF   ':'   type   ;
instruction:  affectation  |
	bloc  |
	 iteration  |
	condition  |
	return |
	read |
	write ;
bloc:  'begin'  (declaration)*   (instruction)+   'end' ;
affectation:  IDF   '='   exp  ;
iteration:  'for'   IDF   'in'   exp   '..'   exp   'do'   ( instruction )+   'end'  ;
condition: 'if'   exp   'then'   ( instruction )+ ('else'   (instruction)+) ?   'fi' ;
return:  'return' '('   exp    ')' ;
read:'read'    IDF ;
write:  'write'   (exp  |
           CSTE_CHAINE );
 exp:  '('   exp   ')' 
            |  IDF  
            //|CST_ENT 
            | 'true' 
            |'false'  
            |IDF    '(' (exp  (','   exp  )* )?    ')' 
            | '-' exp
            |r1;
  
r1: r2 (CST_ENT|)|;
r2: CST_ENT oper r1 ;            
    
 
oper : '+'|'-' |'*'|'<'| '<=' |'>' |'>=' | '==' | '!=';
CST_ENT:('0'..'9')+;
CSTE_CHAINE:'"'('a'..'z' | 'A'..'Z')'"' ;
IDF: ('a'..'z'|'A'..'Z'| '0'..'9')+ ;
WS  :   (' '|'\t')+ {$channel=HIDDEN;} ;