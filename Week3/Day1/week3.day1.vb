3:00 to 4:00 ---> Strings
4:00 to 4:10 ---> Break
4:10 to 5:00 ---> Arrays
5:00 to 5:20 ---> Breakout+Break
5:20 to 5:40 ---> ImplicitWait
5:40 to 6:00 ---> Advanced Xpath
6:00 to 6:15 ---> Recap

String Creation in Java
String Literal:

When you create a string using string literals (e.g., String name = "TestLeaf";), Java stores it in the String Pool, a special area in the Java heap memory.
If another string with the same value is declared (e.g., String name2 = "TestLeaf";), Java reuses the string from the pool instead of creating a new object.
This is efficient in terms of memory.
String Instantiation (with new keyword):

When strings are created using the new keyword (e.g., String str = new String("TestLeaf");), a new object is created in the heap memory outside the String Pool.
This means even if two strings have identical values, they will be different objects in memory (e.g., str and str2).
String Comparison in Java
Using == Operator:

The == operator checks for reference equality, meaning it checks whether two references point to the same object in memory.
For example, name == str checks if the string literal and the string object created with new refer to the same memory location, which they do not, hence it prints "Both are not equal".
Using equals Method:

The equals method checks for value equality, meaning it compares the contents of the strings.
For example, str and str2 are different objects, str.equals(str2) returns true because their contents are the same. Thus, it prints "Both are equal".
Using equalsIgnoreCase Method:

This method compares two strings, ignoring case differences.
In the example, name.equalsIgnoreCase(name2) returns true because it ignores the case of the characters. Thus, it prints "Cases ignored and both are equal", assuming name2 is intended to be "TestLeaf" for case difference demonstration.
Notes on Java String Behavior
Immutability: Strings in Java are immutable. Once created, their values cannot be changed. Any modification results in a new string.
Efficiency: Using string literals is often more memory-efficient due to the String Pool mechanism.
Case Sensitivity: By default, string comparison in Java is case-sensitive. Use equalsIgnoreCase for case-insensitive comparisons.

