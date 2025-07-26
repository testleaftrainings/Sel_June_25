03:00 - 03:45 -> Annotations
03:45 - 04:30 ->  Static Parameterization
04:30 - 05:00 ->  Breakout+Break
05:00 - 05:30 -> Dyanmic Parameterization
05:30 - 05:50 -> Breakout
05:50 - 06:15 -> Read value from Excel

Java Wait:
---Thread.sleep--->waits for the entire duration you have specified.
               --->applicable for each piece of code.
               ---->not recommended bec it slows down the execution of code.
Testng Annotations:

@BeforeSuite-->triggered once before all the tests are run--->at the begining

 @BeforeTest--->triggered once before all the classes are run--->set the testlevel info

  @BeforeClass---->testlevel info will be captured (testcase name,author)

    @BeforeMethod---->preconditions

      @Test---->testcase

    @AfterMethod---->postconditions

     @AfterClass

  @AfterTest

@AfterSuite

parameterization:

1)static:data which is common across all the testcases
2)dynamic :data varies or differs across all the testcases.

Steps to implement Static Parameterization: 
Identify the data that are common across all the test cases 
1.Add parameter tag for each data in the XML file ex: url,username,password ,browser 
2.Map the parameters in the class using @Parameters ex: @Parameters({"url","username", "password"})
 Note: The name should exactly match the names in the xml 
 3.Use that parameters inside the method using arguments
Note: Sequence matters but the name of the arguments does not matter 
 4.Finally, replace the arguments with the hardcoded values 
 Note: You should always run from the xml file when you use parameters

Dynamic Parameterization: 
1.Identify the data that are need to be dynamic for the particular testcase ex: CreateLead : companyName, firstName, lastName, phoneNumber EditLead : phoneNumber,companyName 
2.Create a method sendData and annotate with @Dataprovider annotation and give a name for the DataProvider
3.Create an Input array with rowCount and columnCount - add datas into the array with index starting from 0 
4.Return data back to the calling method
5.Receive the data in the testcase uding dataProvider attribute 
6. Pass input arguments to the test method and replace all the hardcoded data



