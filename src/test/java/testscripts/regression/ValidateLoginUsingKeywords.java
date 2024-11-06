package testscripts.regression;

import org.testng.annotations.Test;

import base.BaseTest;
import keywords.ApplicationKeywords;

public class ValidateLoginUsingKeywords extends BaseTest {
	@Test
	public void loginTest()
	{
		ApplicationKeywords ak=new ApplicationKeywords();
		ak.startBrowser();
		ak.launchApp();
		ak.type("username_textbox", "susmitha410");
		ak.type("password_textbox", "Susmitha@275");
		ak.click("login_button");
	}
	
}
