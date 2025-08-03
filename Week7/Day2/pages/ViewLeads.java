package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class ViewLeads extends BaseClass{
	
	public ViewLeads verifyLeads() {
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if (text.contains("saranya")) {
			System.out.println("text matched");
			
		} else {
			System.out.println("text not matched");

		}
		return this;
	}

}
