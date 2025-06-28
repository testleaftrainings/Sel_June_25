package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//EdgeDriver driver1=new EdgeDriver();
		
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//get the title of the page
		String title = driver.getTitle();
		System.out.println(title);
		
		//System.out.println(driver.getTitle());
		
		//close the browser
		
		driver.close();//close the current window
		
		driver.quit();//close all the tabs which has opened
		

	}

}
