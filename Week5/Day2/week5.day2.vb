3:00 to 3:30 --->Actions
3:30 to 4:30 --->TestNG Basics & Seq execution
4:30 to 4:50 --->Breakout
4:50 to 5:00 --->Break
5:00 to 5:30 --->Parallel  execution
5:30 to 5:45 --->Breakout
5:45 to 6:00--->Java wait

softwares required:
1)TestNG plugins-->for compile and execution of testcases
2)TestNG dependencies--->developing the script.
steps for converting normal script to TestNG:
1)convert main mtd into normal method
 a)remove static,string args
 b)remove main and give a valid method name(mthd name should not be same as class name)
 2)add @Test before the method and import it
 how to get the reports:
 after execution,refresh the project,open the testoutput folder,do right click--->open with system editor.
 Parallel execution:
Select the required testcases and create a testng_parallel.xml
Open the xml file and add the attribute parallel ="classes"in the to run classes in parallel
Use the attribute thread-count to control the number of instances to be opened in parallel
To run mutiple tests in parallel add parallel="tests" in
Finally run the xml file
