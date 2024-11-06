package testscripts.regression;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import keywords.ApplicationKeywords;
import utils.UtilKit;

public class ValidateLoginUsingHybrid extends BaseTest {
	@Test(dataProvider="getTestData")
	public void loginTest(HashMap<String,String> testDataMap)
	{
		ApplicationKeywords ak=new ApplicationKeywords();
		ak.startBrowser();
		ak.launchApp();
		ak.type("username_textbox",testDataMap.get("username") );
		ak.type("password_textbox",testDataMap.get("password") );
		ak.click("login_button");
		ak.verifyTitle(testDataMap.get("expectedtitle"));
	}
	@DataProvider
	 public Object[][]  getTestData()
	 {
		 Object[][] data =new Object[1][1];
		data[0][0]= UtilKit.getTestdataFromExcel("TC-101");
		
		 
		return data;
		 
	 }
	
}
