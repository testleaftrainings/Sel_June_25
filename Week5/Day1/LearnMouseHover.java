package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseHover {//ctrl+shift+o---->importing

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//locate the element
		WebElement prime = driver.findElement(By.xpath("//span[text()='Prime']"));
		//instantiate the action class
		Actions builder=new Actions(driver);
		//using the objects call the required methods
		builder.moveToElement(prime).perform();//perform is a mandatory
		
		

	}

}
