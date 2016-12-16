grammar gramatica_Basica;

//Tipos de datos    bytes
//booleano            1
//entero              4
//caracter            1
//real                4
//doble               8
//largo               8
//vacío               0

auxiliar
    : parse
    ;

parse
    : declaration+EOF
    ;

declaration//Que pueda como tipos de datos pero solo darle valor
    :   tipoDato
    |   reservadas_operadores
    |   comando_selectivo
    |   comando_recursivo
    |   asignarValor
    |   operaciones
    ;
tipoDato
  :  (booleano
  |  caracter
  |  string
  |  entero
  |  flotante)+
  ;
reservadas_operadores
  :  (reservadas
  |  operadorL
  |  operadorN)+
  ;

operaciones
  : ((NUMERO|FLOTANTE) '+' (NUMERO|FLOTANTE)) ('+'|'-'|'*'|'/') +? '\n'
  | (NUMERO|FLOTANTE) '/' (NUMERO|FLOTANTE) '\n'
  | (NUMERO|FLOTANTE) '*' (NUMERO|FLOTANTE) '\n'
  | (NUMERO|FLOTANTE) '-' (NUMERO|FLOTANTE) '\n'
  ;

comando_selectivo
  :  (comando_si)+
  ;
comando_recursivo
  :  (comando_while)+
  ;

reservadas : RESERVADAS;
operadorL : OPERADORES_LOGICOS;
operadorN : OPERADOR_NEGACION;

asignarValor
    :IDENTIFICADOR ('=' 'true'|'=' 'false')? '\n' //bool
    |IDENTIFICADOR ('=' IDENTIFICADOR)? '\n'
    |IDENTIFICADOR ('=' CARACTER)? '\n'           //char
    |IDENTIFICADOR ('=' COMENTARIO)? '\n'         //string
    |IDENTIFICADOR ('=' NUMERO)? '\n'             //entero
    |IDENTIFICADOR ('=' FLOTANTE)? '\n'
    |IDENTIFICADOR ('=' operaciones) '\n'
    ;

booleano
    :'bool' IDENTIFICADOR ('=' 'true'|'=' 'false')? '\n'
    ;
caracter
    : 'char' IDENTIFICADOR ('=' CARACTER)? '\n'
    ;
string
    :'string' IDENTIFICADOR ('=' COMENTARIO)? '\n'//El ? indica que no es necesario para que se cumpla. Si hay un = debe de ahaber algo de texto
    ;
entero
    :'entero' IDENTIFICADOR ('=' NUMERO)? '\n'
    ;
flotante
    :'flotante' IDENTIFICADOR ('=' FLOTANTE)? '\n' //0.9
    ;
comando_si
    :'si' '(' (NUMERO|FLOTANTE|IDENTIFICADOR) COMPARADORES (NUMERO|FLOTANTE|IDENTIFICADOR) ')' ('\n')? 'entonces' ('\n')? ('rompe' '\n'+)? (declaration+)? ('\n')? ('rompe' '\n')? ('sino' ('\n')? ('rompe' '\n')? (declaration+)? ('\n')? ('rompe' '\n')?)? ('rompe' '\n')? ('si' 'entonces' ('\n')? (declaration+)?)? ('\n')? ('rompe' '\n')? 'terminasi' ('\n')?
    //|'si' '(' (NUMERO|FLOTANTE|IDENTIFICADOR) COMPARADORES (NUMERO|FLOTANTE|IDENTIFICADOR) ')' ('\n')? 'entonces' ('\n')? ('rompe' '\n' | '\n')? declaration+ ('sino' ('\n')? ('rompe' '\n' | '\n')? declaration+ ('rompe' '\n' | '\n')?)? ('rompe' '\n' | '\n')? ('si' ('\n')? declaration+)? ('rompe' '\n' | '\n')? 'terminasi' ('\n')?
    |'si' '(' IDENTIFICADOR COMPARADORES IDENTIFICADOR OPERADORES_LOGICOS IDENTIFICADOR COMPARADORES IDENTIFICADOR ')' ('rompe' '\n' | '\n')? 'entonces' ('rompe' '\n' | '\n')? declaration+ ('rompe' '\n' | '\n') ('sino' ('rompe' '\n' | '\n')? declaration+)? ('rompe' '\n' | '\n')? ('si' declaration+)? ('rompe' '\n' | '\n')? 'terminasi' ('\n')?
    |'si' '(' (NUMERO | FLOTANTE|IDENTIFICADOR) COMPARADORES (NUMERO | FLOTANTE|IDENTIFICADOR) OPERADORES_LOGICOS (NUMERO | FLOTANTE) COMPARADORES (NUMERO | FLOTANTE) ')' 'entonces' ('rompe' '\n' | '\n')? declaration+ ('rompe' '\n' | '\n')? ('sino' ('rompe' '\n' | '\n')? declaration+)? ('rompe' '\n' | '\n')? ('si' ('rompe' '\n' | '\n')? declaration+)? 'terminasi' ('\n')?
    ;
comando_while
    :'mientras' '(' IDENTIFICADOR COMPARADORES IDENTIFICADOR ')' ('\n')? ('rompe' '\n')? (declaration ('\n')? | 'rompe' '\n')+ ('rompe' '\n')? 'terminamientras' ('\n')?
    |'mientras' '(' (NUMERO|FLOTANTE|IDENTIFICADOR) COMPARADORES (NUMERO|FLOTANTE|IDENTIFICADOR) ')' ('\n')? ('rompe' '\n')? (declaration | 'rompe' '\n')+? ('rompe' '\n')? 'terminamientras' ('\n')?
    |'mientras' '(' IDENTIFICADOR COMPARADORES IDENTIFICADOR OPERADORES_LOGICOS IDENTIFICADOR COMPARADORES IDENTIFICADOR ')' ('\n')? ('rompe' '\n')? (declaration | 'rompe' '\n')+ ('rompe' '\n')? 'terminamientras' ('\n')?
    |'mientras' '(' (NUMERO | FLOTANTE|IDENTIFICADOR) COMPARADORES (NUMERO | FLOTANTE|IDENTIFICADOR) OPERADORES_LOGICOS (NUMERO | FLOTANTE) COMPARADORES (NUMERO | FLOTANTE) ')' ('\n')? ('rompe' '\n')? (declaration | 'rompe' '\n')+ ('rompe' '\n')? 'terminamientras' ('\n')?
    ;

RESERVADAS : 'clase' | 'terminacaso' | 'encaso' | 'caso' | 'para' | 'terminaen' | 'terminap' | 'publico' | 'privado' | 'repite' | 'hastaque' | 'defecto' | 'terminafuncion' | 'principal' | 'regresa' | 'importa' | 'define' | 'leer' | 'escribir';
OPERADORES_LOGICOS : 'y' | 'o';
OPERADOR_NEGACION : 'no';                         //Separador                                           //Separador                                                                                             //Separador
CONDICION :  IDENTIFICADOR COMPARADORES IDENTIFICADOR | (NUMERO | FLOTANTE) COMPARADORES (NUMERO | FLOTANTE) | IDENTIFICADOR COMPARADORES IDENTIFICADOR OPERADORES_LOGICOS IDENTIFICADOR COMPARADORES IDENTIFICADOR | (NUMERO | FLOTANTE) COMPARADORES (NUMERO | FLOTANTE) OPERADORES_LOGICOS (NUMERO | FLOTANTE) COMPARADORES (NUMERO | FLOTANTE); //Compara identificadores o identificadores, así como tambien si hay un operador lógico

COMPARADORES : '>' | '>=' | '<' | '<=' | '==' | '<>';
CARACTER : '"'LETRA'"';
LETRA : [aA-zZ];
COMENTARIO : '"'LETRA+'"';
IDENTIFICADOR : [A-Z][aA-zZ0-9]+;
NUMERO : [0-9]+;
FLOTANTE: NUMERO'.'NUMERO;
TIPO_DATO: 'entero' | 'booleano' | 'flotante' | 'string';
WS  : [ \t\r]+ -> skip ;