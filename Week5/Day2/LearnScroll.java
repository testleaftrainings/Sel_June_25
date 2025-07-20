package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnScroll {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement scroll = driver.findElement(By.xpath("//span[contains(text(),'Amazon.com')]"));
		
		Actions sd=new Actions(driver);
		sd.scrollToElement(scroll).perform();
		
		String text = scroll.getText();
		System.out.println(text);
		
		WebElement cli = driver.findElement(By.xpath("(//h5[contains(text(),'Amazon ')])[2]"));
		sd.click(cli).perform();
	}

}
