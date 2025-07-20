package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/draggable/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//frame
		driver.switchTo().frame(0);
		//locate
		WebElement drag = driver.findElement(By.id("draggable"));
		Actions act=new Actions(driver);
		//act.dragAndDropBy(drag, 25, 50).perform();
		
		Point location = drag.getLocation();
		int x = location.getX();
		int y = location.getY();
		act.dragAndDropBy(drag, x, y).perform();
	}

}
