3:00 to 3:30 ---> Operators
3:30 to 4:30 ---> ControlStatements
4:30 to 4:45 ---> Breakout
4:45 to 4:55 ---> Break
4:55 to 5:45 ---> Methods & Objects
5:45 to 6:00 ---> Breakout
6:00 to 6:15 --->Recap

Operators:
----------
operators are special symbols that perform specific operations
 
1.Arithmetic operators:
These operators are used to perform mathematical operations
such as addition, subtraction, multiplication,and division.
+ (addition)
- (subtraction)
* (multiplication)
/ (division)-Que
% (modulus or remainder)

2.Assignment operators:
These operators are used to assign values to variables. 
= (assignment)//a=2;
+= (add and assign)
-= (subtract and assign)
*= (multiply and assign)
/= (divide and assign)
%= (modulus and assign)

3.Comparison operators:
These operators are used to compare two value
and return a boolean value (true or false). 
== (equal to)
!= (not equal to)
> (greater than)
< (less than)
>= (greater than or equal to)
<= (less than or equal to)

4.Logical operators:
These operators are used to combine two or more boolean expressions
and return a boolean value.
&& (logical and) (multiplication)
1 T    0 F
and 
 A    B    C
 1    0    0
 1    1     1
 0    1     0
 1    1     1
(5==5)&&(5<5)---false
  1*0=0--->F
|| (logical or)(addition)
addition
1+1---1T
0+1---1T
1+0---1T
0+0---0F
(5==5)||(5<5)---True
! (logical not or negation)
1---0   T F

0---1   F  T

5. unary operator
Increment operator (++) 
Decrement operator (--)

For Loop:
---------
fixed number of time 

### Conditional Statements:
   1. Conditional statements  are used to control the flow of the program based on certain conditions. These statements allow the program to make decisions and execute different blocks of code depending on whether a specified condition evaluates to true or false. The primary conditional statements in Java include:

### 1. if Statement:

*Definition:*
The if statement is used to execute a block of code only if a specified condition is true.

*Syntax:*
java
int age=50;
if (age>=50) {
    syso("applicable")
}


### 2. if-else Statement:

*Definition:*
The if-else statement is used to execute one block of code if the condition is true and another block of code if the condition is false.

*Syntax:*
java
if (age>=50) {
    syso("applicable")
} else {
    syso("not applicable")
}


### 3. if-else if-else Statement:

*Definition:*(nested If)
The if-else if-else statement allows you to check multiple conditions in sequence. It executes the first block of code whose condition is true.

*Syntax:*
java
if (condition1) {
    // Code to be executed if condition1 is true
} else if (condition2) {
    // Code to be executed if condition2 is true
} else {
    // Code to be executed if none of the conditions is true
}

Control and Jump Statements:
Definition: Control statements in Java are used to manage the flow of execution in a program. They include decision-making statements

Looping Statements: For Loop: Repeats a block of code a specific number of times.

Jump Statements: Break Statement: Terminates the innermost loop or switch statement. Continue Statement: Skips the current iteration and continues to the loop and proceeds to the next iteration.
Methods:
Definition: A method in Java is a set of instructions or a block of code encapsulated within a named unit. It is designed to perform a specific task and can be invoked (called) from other parts of the program. Methods promote code reusability, modularization, and a more organized code structure. They are defined by the method's signature, which includes its name, parameters, and return type.
Explanation: Declaration: Methods are declared with a return type, a name, and parameters (if any). Return Type: Specifies the type of data the method will return, or "void" if it doesn't return anything. Parameters: Input values passed to the method for processing.
Objects:
Definition: In Java, an object is an instance of a class, representing a real-world entity or concept. Objects encapsulate data (attributes) and behavior (methods) related to the entity they represent. They are created from class blueprints and follow the principles of object-oriented programming (OOP), including encapsulation, inheritance, and polymorphism. Objects interact with each other through method calls and can store and manipulate data.
Explanation
Instantiation: Objects are created from classes using the new keyword. Attributes (Fields): Define the properties of an object. Behaviors (Methods): Define the actions an object can perform.
Arrays:
Definition: An array in Java is a data structure that stores a fixed-size, ordered collection of elements of the same data type. Arrays provide a convenient way to group related data items under a single name. The elements in an array are accessed using an index, starting from 0. Arrays are useful for efficiently managing and manipulating large sets of data.

Explanation: Declaration: Arrays are declared with a type, followed by square brackets ([]). Example: int[] numbers; Initialization: Arrays can be initialized when declared or later using the new keyword. Example: int[] numbers = new int[5]; Accessing Elements: Elements in an array are accessed using their index (starting from 0). Example: int firstNumber = numbers[0]; Length of Array: The length of an array is obtained using the length attribute. Example: int arrayLength = numbers.length;

method:

Access specifier

Return type

methodName

Input arguments
