package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BasicLocators {

	public static void main(String[] args) {
		
		/*
		 * steps to interact with the webelement
		 * 1)locate the element from the dom
		 * 2)sendkeys--->pass the values
		 * 3)click--->clicking an element
		 * shortcut for opening the dom:ctrl+shift+i,fn+f12,right click on the element and inspect
		 */
		EdgeDriver driver=new EdgeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		WebElement pwd = driver.findElement(By.name("PASSWORD"));
		pwd.sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		//driver.close();//close the current window
		

	}

}
