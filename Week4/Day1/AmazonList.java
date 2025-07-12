package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonList {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		
		driver.manage().window().maximize();
		driver.navigate();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//search phones
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones",Keys.ENTER);
		//no of phones
		Thread.sleep(3000);
		List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		List<Integer> list=new ArrayList<Integer>();
		for (WebElement each : findElements) {
			
			String text = each.getText();
			String replaceAll = text.replaceAll(",", "");
			//convert string to an integer
			
			//try {
			if (! replaceAll.isEmpty()) {
				
			
			int mob = Integer.parseInt(replaceAll);
				list.add(mob);
				
			//} catch (NumberFormatException e) {
				
			//}
			}
			
		}
		//sorting
		Collections.sort(list);
		System.out.println(list);

	}

}
