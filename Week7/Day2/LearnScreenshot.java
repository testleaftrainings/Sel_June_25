package week7.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenshot {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//take the snapshot
		File source = driver.getScreenshotAs(OutputType.FILE);
		//destination
		File destination=new File("./snaps/homepage.png");
		//connect source and destination
		FileUtils.copyFile(source, destination);
		
		//particular textfield
		WebElement textfield = driver.findElement(By.id("twotabsearchtextbox"));
		File source1 = textfield.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snaps/search.png");
		FileUtils.copyFile(source1, dest);

	}

}
