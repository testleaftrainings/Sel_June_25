package week8.day1;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReports {

	public static void main(String[] args) throws IOException {
		
		//set up the reportpath
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./reports/result.html");
		//maintain the history
		reporter.setAppendExisting(true);
		//instantiate the extent reports
		ExtentReports extent=new ExtentReports();
		//attach the data with the file
		extent.attachReporter(reporter);
		
		//create a testcase and assign all the testcase details
		
		ExtentTest test=extent.createTest("createlead","create leads with madatory details");
		test.assignAuthor("saranya");
		test.assignCategory("smoketesting");
		
		//attach the steplevel status of testcases
		test.pass("username entered sucessfully",MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/homepage.png").build());
		test.fail("pwd entered is invalid");
		test.fail("login not successfull");
		//mandotory step
		extent.flush();//reports will be saved in the reports folder
		System.out.println("completed");
	}

}
