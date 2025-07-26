package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CreateLead extends BaseClass {
	@Test(dataProvider="fetchData")
	public  void runCreateLead(String cName,String fName,String lName) {
		
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.name("submitButton")).click();
		
}
	@DataProvider(name="fetchData")
	public String[][] sendData() {
		//declare 2d array
		//FIRST[]--->represents row
		//second[]---->represents column
		String [][] data=new  String[3][3];
		//assign the data
		data[0][0]="Testleaf";
		data[0][1]="SARANYA";
		data[0][2]="S";
		
		data[1][0]="testleaf";
		data[1][1]="vidya";
		data[1][1]="R";
		
		data[2][0]="testleaf";
		data[2][1]="Hari";
		data[2][2]="R";
		
		return data;
	}
}






