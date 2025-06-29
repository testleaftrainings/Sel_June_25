package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class LearnDD {

	public static void main(String[] args) {
		/*
		 * Steps to handle the dropdown:
		 * 1)identify the element present inside the select tag
		 * 2)if it is present inside<select> locate the element and store it in alocal variable
		 * 3)instantiate the select class and pass the webelement as an argment to the constructor
		 * 4)using the select class object acess the methodsa)select by indexb)visible textc)value
		 */
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		WebElement pwd = driver.findElement(By.name("PASSWORD"));
		pwd.sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		//click on leads
		driver.findElement(By.linkText("Leads")).click();
		//click on create lead
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saranya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		//click on sourceDD
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sel=new Select(sourceDD );
		sel.selectByIndex(4);
		//industry
		WebElement industryDD = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select sel1=new Select(industryDD);
		sel1.selectByValue("IND_GEN_SERVICES");
		

	}

}
