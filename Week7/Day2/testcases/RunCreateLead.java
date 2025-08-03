package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.login;

public class RunCreateLead extends BaseClass {
	@Test
	public void runCreateLead() {
		
		login l=new login();
		l.enterUname().enterPwd().clickLogin().clickCrmsfa().clickLeads().createLead().entercName()
		.enterfName().enterlName().clickSubmit().verifyLeads();
		
	}

}
