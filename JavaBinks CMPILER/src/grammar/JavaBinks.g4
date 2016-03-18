grammar JavaBinks;

// FORMAT:
// fragment: (syntax: fragment [Name] : [definition] ;)
// token: (syntax: [Name] : [definition] ;)
// rule: (syntax: [name] : [definition] ;)

// LEXER TOKENS
// Keywords

//ABSTRACT      : 'abstract';
//ASSERT        : 'assert';
//BYTE          : 'byte';
//CATCH         : 'catch';
//CLASS         : 'class';
//CONST         : 'const';
//CONTINUE      : 'continue';
//ENUM          : 'enum';
//EXTENDS       : 'extends';
//FINAL         : 'final';
//FINALLY       : 'finally';
//GOTO          : 'goto';
//IMPLEMENTS    : 'implements';
//IMPORT        : 'import';
//INSTANCEOF    : 'instanceof';
//INTERFACE     : 'interface';
//NATIVE        : 'native';
//NEW           : 'new';
//PACKAGE       : 'package';
//PRIVATE       : 'private';
//PROTECTED     : 'protected';
//PUBLIC        : 'public';
//SHORT         : 'short';
//STATIC        : 'static';
//STRICTFP      : 'strictfp';
//SUPER         : 'super';
//SYNCHRONIZED  : 'synchronized';
//THIS          : 'this';
//THROW         : 'throw';
//THROWS        : 'throws';
//TRANSIENT     : 'transient';
//TRY           : 'try';
//VOLATILE      : 'volatile';

BREAK         : 'fett';
CASE          : 'clone';
DEFAULT       : 'kaminoans';
DO            : 'iloveyou';
ELSE          : 'storm';
FOR           : 'force';
IF            : 'trooper';
SWITCH        : 'kamino';
WHILE         : 'iknow';
RETURN        : 'jedi';

// Datatypes
// ARRAY??
// ARRAYLIST??
BOOLEAN       : 'boolean';
CHAR          : 'char';
//DOUBLE        : 'double';
FLOAT         : 'float';
INT           : 'int';
//LONG          : 'long';
STRING        : 'String';
VOID          : 'void';

// Array Literal

// ArrayList Literal

// Boolean Literal
BooleanLiteral
    :   BooleanDigit
    |   BooleanWord
    ;

// Char Literal
CharLiteral
    :   '\'' Letter '\''
    |   '\'' Space '\''
    ;

// Float Literal
FloatLiteral
    :   NegativeSign? Digits '.' Digits?
    |   '.' Digits?
    ;

// Integer Literal
IntegerLiteral
    :   NegativeSign? Digits
    ;

// String Literal
StringLiteral
    :   '"' StringCharacters '"'
    ;

// Null Literal
NullLiteral
    :   'null'
    ;

// Fragments: Number related
fragment
Digits
    :   Digit+
    ;

fragment
Digit
    :   [0-9]
    ;

fragment
NegativeSign
    :   '-'
    ;

fragment
BooleanDigit
    :   [01]
    ;

fragment
BooleanWord
    :   ('true' | 'false')
    ;

// Fragments: Letters/Word related
fragment
Letters
    :   Letter+
    ;

fragment
Space
    :   ' '
    ;

fragment
Letter
    :   [A-Za-z]
    ;

fragment
StringCharacters
    :   [A-Za-z0-9 .!?_+\-,@#$%^&*();\\\/|<>"']*
    ;

// Operators
ADD         : '+';
SUB         : '-';
MUL         : '*';
DIV         : '/';
MOD         : '%';

INCR        : '++';     // increment
DECR        : '--';     // decrement

NOT         : '!';
AND         : '&&';
OR          : '||';

ASSIGN      : '=';
GT          : '>';      // greater than
LT          : '<';      // less than
EQUAL       : '==';
GE          : '>=';     // greater than or equal
LE          : '<=';     // less than or equal
NOTEQUAL    : '!=';     // not equal

ADD_ASSIGN  : '+=';
SUB_ASSIGN  : '-=';
MUL_ASSIGN  : '*=';
DIV_ASSIGN  : '/=';
MOD_ASSIGN  : '%=';

// Separators
LPAREN      : '(';
RPAREN      : ')';
LBRACE      : '{';
RBRACE      : '}';
LBRACK      : '[';
RBRACK      : ']';
SEMI        : ';';
COMMA       : ',';
DOT         : '.';

// Whitespace and comments
COMMENT
    :   'meesa ' .*? ' yousa' -> skip
    ;

WS  :  [ \t\r\n\u000C]+ -> skip
    ;