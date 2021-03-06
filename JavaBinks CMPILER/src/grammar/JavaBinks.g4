grammar JavaBinks;

// FORMAT:
// fragment: (syntax: fragment [Name] : [definition] ;)
// token: (syntax: [Name] : [definition] ;)
// rule: (syntax: [name] : [definition] ;)

start
    :   main functionDeclaration? EOF
    ;
//r
//    :   functionDeclaration r
//    |   // empty
//    ;

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
    :   ADD_ASSIGN
    |   SUB_ASSIGN
    |   MUL_ASSIGN
    |   DIV_ASSIGN
    |   MOD_ASSIGN
    ;

special2Operator
    :   INCR        // increment
    |   DECR        // decrement
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
    :   booleanLiteral
    |   CharLiteral
    |   FloatLiteral
    |   IntegerLiteral
    |   NegativeIntegerLiteral
    |   StringLiteral
    ;

specialValue
//    :   value
//    :   VariableFuncName
    :   expression
//    |   functionCallNoTerminator
    ;


// 1) Variable Declaration/Initialization
declaration
    :   datatype multiDec SEMI
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
    |   VariableFuncName specialOperator specialValue SEMI
    ;

// 3) Conditional Statement
conditionalStatement
    :   ifBlock
    |   switchBlock
    ;
ifBlock
    :   ifCondition elseIfBlock?
//    |   ifCondition elseIfBlock
    ;
elseIfBlock
    :   elseIf elseIfBlock?
//    |   elseIf
    |   elseCondition
    ;
ifCondition
    :   IF LPAREN conditionalExpression RPAREN LBRACE codeBlock? RBRACE
    ;
elseCondition
    :   ELSE LBRACE codeBlock? RBRACE
    ;
elseIf
    :   ELSEIF LPAREN conditionalExpression RPAREN LBRACE codeBlock? RBRACE
    ;
switchBlock
    :   SWITCH LPAREN conditionalExpression RPAREN LBRACE switchCase RBRACE
    ;
switchCase
    :   caseBlock switchCase
    |   caseBlock
    |   defaultBlock
    ;
caseBlock
    :   caseCondition caseBlock
    |   caseCondition
    ;
caseCondition
    :   CASE value ':' LBRACE codeBlock? RBRACE
    |   CASE value ':' LBRACE codeBlock? RBRACE BREAK SEMI
    ;
defaultBlock
    :   DEFAULT ':' LBRACE codeBlock? RBRACE
    |   DEFAULT ':' LBRACE codeBlock? RBRACE BREAK SEMI
    ;
conditionalExpression
    :   specialValue conditionalExpression2?
// (logicalOperator specialValue)?
    ;
conditionalExpression2
    :   logicalOperator specialValue
    ;

// 4) Loop/Iterative Statement
loopStatement
    :   whileBlock
    |   doWhileBlock
    |   forBlock
    ;
whileBlock
    :   WHILE LPAREN conditionalExpression RPAREN LBRACE codeBlock? RBRACE
    ;
doWhileBlock
    :   DO LBRACE codeBlock? RBRACE WHILE LPAREN conditionalExpression RPAREN SEMI
    ;
forBlock
    :   FOR LPAREN decValue SEMI conditionalExpression SEMI step RPAREN LBRACE codeBlock? RBRACE
    ;
decValue
    :   INT VariableFuncName ASSIGN initValue
    |   VariableFuncName ASSIGN initValue
    ;
initValue
    :   IntegerLiteral
    |   NegativeIntegerLiteral
    |   VariableFuncName
    ;
step
    :   VariableFuncName special2Operator
    |   VariableFuncName specialOperator (IntegerLiteral | NegativeIntegerLiteral)
    ;

// 5) Expressions
expression
    :   expr
    ;
expr
    :   value
    |   VariableFuncName
    |   functionCallNoTerminator
    |   expr operator expr
    |   LPAREN expr RPAREN
    |   VariableFuncName special2Operator SEMI?
    ;

//expr
//    :   value
//    |   VariableFuncName
//    |   functionCallNoTerminator
//    |   expr expr2
//    |   LPAREN expr RPAREN
//    |   VariableFuncName special2Operator SEMI?
//    ;
//expr2
//    :   operator expr
//    ;


// 6) Function Declaration/Definition
functionDeclaration
    :   datatype VariableFuncName LPAREN declarationParameter RPAREN LBRACE codeBlock? returnStatement RBRACE functionDeclaration?
    |   VOID VariableFuncName LPAREN declarationParameter RPAREN LBRACE codeBlock? RBRACE functionDeclaration?
    ;
declarationParameter
    :   singleDeclarationParameter multiDeclarationParameter
    |   singleDeclarationParameter
    ;
multiDeclarationParameter
    :   COMMA declarationParameter
    ;
singleDeclarationParameter
    :   returntype VariableFuncName
    |
    ;
returnStatement
    :   RETURN specialValue SEMI
    ;

// 7) Function Call
functionCall
    :   VariableFuncName LPAREN callParameter? RPAREN SEMI
    ;
functionCallNoTerminator
    :   VariableFuncName LPAREN callParameter? RPAREN
    ;
callParameter
    :   specialValue COMMA callParameter callParameter?
    |   specialValue
//    |   //empty
    ;

// 8) Arrays
array
    :   datatype VariableFuncName arrayAssignment SEMI
    ;
arrayAssignment
    :   LBRACK IntegerLiteral RBRACK
    |   LBRACK RBRACK ASSIGN LBRACE list RBRACE
    ;
list
    :   boolList
    |   charList
    |   floatList
    |   integerList
    |   stringList
    ;
// TODO: Fix boolean shits especially boolean b[] = {true};
boolList
    :   booleanLiteral COMMA boolList
    |   booleanLiteral
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
    :   (NegativeIntegerLiteral | IntegerLiteral) COMMA integerList
    |   IntegerLiteral
    |   NegativeIntegerLiteral
    ;
stringList
    :   StringLiteral COMMA stringList
    |   StringLiteral
    ;

// 9) Printer
printer
    :   PRINTER LPAREN StringLiteral RPAREN SEMI    // forcePrint("HelloWorld");
    |   PRINTER LPAREN specialValue RPAREN SEMI     // forcePrint(func(a));
    ;

// 10) Scanner
scanner
    //:   datatype VariableFuncName ASSIGN SCANNER // int i = scanner.nextInt();
    :   SCANNER LPAREN SCANNERINT COMMA VariableFuncName RPAREN SEMI // scanf("%d", &number);
    |   SCANNER LPAREN SCANNERFLOAT COMMA VariableFuncName RPAREN SEMI
    |   SCANNER LPAREN SCANNERBOOLEAN COMMA VariableFuncName RPAREN SEMI
    |   SCANNER LPAREN SCANNERCHAR COMMA VariableFuncName RPAREN SEMI
    |   SCANNER LPAREN SCANNERSTRING COMMA VariableFuncName RPAREN SEMI
    ;

// 11) Code Block
codeBlock
    :   declaration codeBlock?
    |   assignment codeBlock?
    |   conditionalStatement codeBlock?
    |   loopStatement codeBlock?
    |   functionCall codeBlock?
    |   array codeBlock?
    |   expression codeBlock?
    |   comment codeBlock?
    |   printer codeBlock?
    |   scanner codeBlock?
//    |   // empty
    ;

// 12) Main
main
    :   INT 'jarjarbinks' LPAREN RPAREN LBRACE codeBlock? returnMain RBRACE
    ;
returnMain
    :   RETURN IntegerLiteral SEMI
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
PRINTER       : 'forcePrint';
// Scanner Keywords
SCANNER       : 'forceScan';


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
    :   Letters Digits?
    ;

// Boolean Literal
booleanLiteral
    :   'true'
    |   'false'
    ;

// Char Literal
CharLiteral
    :   '\'' Letter '\''
    |   '\'' Space '\''
    |   '\'' Digit '\''
    ;

// Float Literal
FloatLiteral
    :   NegativeSign Digits '.' Digits
    |   Digits '.' Digits
    ;

// Integer Literal
IntegerLiteral
    :   PositiveIntegerLiteral
    //|   NegativeSign Digits
    ;

NegativeIntegerLiteral
    :   NegativeSign Digits
    ;

// Positive Integer Literal
PositiveIntegerLiteral
    :   '+'? Digits
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
    :   [A-Za-z0-9 .!?_+\-,@#%$^&*();\\\/|<>"'~ ]*
    ;

// Scanner Datatypes
SCANNERINT      : '\'%d\'';
SCANNERFLOAT    : '\'%f\'';
SCANNERBOOLEAN  : '\'%b\'';
SCANNERCHAR     : '\'%c\'';
SCANNERSTRING   : '\'%s\'';

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
comment
    :   'meesa ' .*? ' yousa'
    ;

WS  :  [ \t\r\n\u000C]+ -> skip
    ;