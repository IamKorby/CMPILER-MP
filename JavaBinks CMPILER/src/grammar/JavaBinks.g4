grammar JavaBinks;

// FORMAT:
// fragment: (syntax: fragment [Name] : [definition] ;)
// token: (syntax: [Name] : [definition] ;)
// rule: (syntax: [name] : [definition] ;)

r   :   declaration ;

// RULES

datatype
    :   BOOLEAN
    |   CHAR
    |   FLOAT
    |   INT
    |   STRING
    ;

returntype
    :   BOOLEAN
    |   CHAR
    |   FLOAT
    |   INT
    |   STRING
    |   VOID
    ;

operator
    :   ADD
    |   SUB
    |   MUL
    |   DIV
    |   MOD
    ;

specialOperator
    :   INCR        // increment
    |   DECR        // decrement
    |   ADD_ASSIGN
    |   SUB_ASSIGN
    |   MUL_ASSIGN
    |   DIV_ASSIGN
    |   MOD_ASSIGN
    ;

logicalOperator
    :   NOT
    |   AND
    |   OR
    |   GT          // Greater than
    |   LT          // Less than
    |   EQUAL       // this is ==
    |   GE          // Greater than or equal
    |   LE          // Less than or equal
    |   NOTEQUAL
    ;

value
    :   BooleanLiteral
    |   CharLiteral
    |   FloatLiteral
    |   IntegerLiteral
    |   StringLiteral
    ;

specialValue
    :   value
    |   VariableFuncName
    // TODO: Add expression
    |   functionCallNoTerminator
    ;


// 1) Variable Declaration/Initialization
declaration
    :   datatype singleDec SEMI
    |   datatype multiDec SEMI
    ;
multiDec
    :   singleDec COMMA multiDec
    |   singleDec
    ;
singleDec
    :   VariableFuncName
    |   VariableFuncName ASSIGN specialValue
    ;

// 2) Assignment Statement
assignment
    :   VariableFuncName ASSIGN specialValue SEMI
    ;

// 3) Conditional Statement
conditionalStatement
    :   IF LPAREN conditionalExpression RPAREN LBRACE codeBlock RBRACE
    |   ELSEIF LPAREN conditionalExpression RPAREN LBRACE codeBlock RBRACE
    |   ELSE LBRACE codeBlock RBRACE
    |   SWITCH LPAREN conditionalExpression RPAREN LBRACE switchBlock RBRACE
    ;
conditionalExpression
    :   specialValue logicalOperator specialValue
    |   specialValue
    ;
switchBlock
    :   CASE value ':' LBRACE codeBlock RBRACE
    |   CASE value ':' LBRACE codeBlock RBRACE BREAK SEMI
    |   DEFAULT ':' LBRACE codeBlock RBRACE
    ;

// 4) Loop/Iterative Statement
// TODO: Fix the for loop syntax
loopStatement
    :   WHILE LPAREN conditionalExpression RPAREN LBRACE codeBlock RBRACE
    |   DO LBRACE codeBlock RBRACE WHILE LPAREN conditionalExpression RPAREN SEMI
    |   FOR LPAREN declaration conditionalExpression SEMI VariableFuncName operator RPAREN LBRACE codeBlock RBRACE
    ;

// TODO: 5) Expressions
expression
    :
    ;

// 6) Function Declaration/Definition
functionDeclaration
    :   datatype VariableFuncName LPAREN declarationParameter RPAREN LBRACE codeBlock RBRACE
    |   VOID VariableFuncName LPAREN declarationParameter RPAREN LBRACE codeBlock returnStatement RBRACE
    ;
declarationParameter
    :   datatype VariableFuncName multiDeclarationParameter
    |   singleDeclarationParameter
    ;
multiDeclarationParameter
    :   COMMA declarationParameter
    ;
singleDeclarationParameter
    :   datatype VariableFuncName
    ;
returnStatement
    :   RETURN specialValue
    ;

// 7) Function Call
functionCall
    :   VariableFuncName LPAREN callParameter RPAREN SEMI
    ;
functionCallNoTerminator
    :   VariableFuncName LPAREN callParameter RPAREN SEMI
    ;
callParameter
    :   specialValue COMMA callParameter
    |   specialValue
    ;

// 8) Arrays
array
    :   datatype arrayAssignment
    ;
arrayAssignment
    :   VariableFuncName LBRACK Digits RBRACK
    |   VariableFuncName LBRACK RBRACK ASSIGN LBRACE list RBRACE
    ;
list
    :   boolList
    |   charList
    |   floatList
    |   integerList
    |   stringList
    ;
boolList
    :   BooleanLiteral COMMA boolList
    |   BooleanLiteral
    ;
charList
    :   CharLiteral COMMA charList
    |   CharLiteral
    ;
floatList
    :   FloatLiteral COMMA floatList
    |   FloatLiteral
    ;
integerList
    :   IntegerLiteral COMMA integerList
    |   IntegerLiteral
    ;
stringList
    :   StringLiteral COMMA stringList
    |   StringLiteral
    ;

// 9) Code Block
// TODO: Add expression
codeBlock
    :   declaration codeBlock
    |   assignment codeBlock
    |   conditionalStatement codeBlock
    |   loopStatement codeBlock
    |   functionDeclaration codeBlock
    |   array codeBlock
    // TODO: |   expression codeBlock
    |   // empty
    ;

// 10) Main
main
    :   INT 'main' LPAREN RPAREN LBRACE codeBlock RETURN IntegerLiteral SEMI RBRACE
    ;

// LEXER TOKENS
// Keywords
BREAK         : 'fett';
CASE          : 'clone';
DEFAULT       : 'kaminoans';
DO            : 'iloveyou';
ELSE          : 'storm';
ELSEIF        : 'stormtrooper';
FOR           : 'force';
IF            : 'trooper';
SWITCH        : 'kamino';
WHILE         : 'iknow';
RETURN        : 'jedi';

// Datatypes
BOOLEAN       : 'boolean';
CHAR          : 'char';
FLOAT         : 'float';
INT           : 'int';
STRING        : 'String';
VOID          : 'void';     // return type

// Since Variable Name & Function Name are the same
// COMBINE THEM ANYWAY
VariableFuncName
    :   Letters Digit*
    ;

// Boolean Literal
BooleanLiteral
    :   BooleanDigit
    |   BooleanWord
    ;

// Char Literal
CharLiteral
    :   '\'' Letter '\''
    |   '\'' Space '\''
    |   '\'' Digit '\''
    ;

// Float Literal
FloatLiteral
    :   NegativeSign? Digits '.' Digits?
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

Digits
    :   Digit+
    ;


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
    :   [A-Za-z0-9 .!?_+\-,@#$%^&*();\\\/|<>"' ]*
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