package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinks {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//find the links
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));//ctrl+2,L
		//size of the list
		int size = allLinks.size();
		System.out.println(size);
		//retrive single link
		WebElement name = allLinks.get(2);
		String text = name.getText();
		System.out.println(text);
		
		List<String> list=new ArrayList<String>();
		//for(datatype iterator oldv.name)
		for (WebElement each : allLinks) {
			String text2 = each.getText();
			//System.out.println(text2);
			list.add(text2);
			
			
		}
		System.out.println(list);

	}

}
