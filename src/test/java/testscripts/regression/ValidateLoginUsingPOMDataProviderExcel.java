package testscripts.regression;

import java.util.HashMap;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.SearchHotelPage;
import utils.UtilKit;

public class ValidateLoginUsingPOMDataProviderExcel extends BaseTest {
 @Test(dataProvider ="getTestData")
 public void validateLogin(HashMap<String,String> testDataMap)
 {
	 LoginPage loginPage= PageFactory.initElements(driver, LoginPage.class);
	 loginPage.usernameTextBox(testDataMap.get("username"));
	 loginPage.passwordTextBox(testDataMap.get("password"));
	 loginPage.loginButton();
	 SearchHotelPage searchHotelPage= PageFactory.initElements(driver,SearchHotelPage.class);
	 searchHotelPage.verifyTitle(testDataMap.get("expectedtitle"));
	 searchHotelPage.helloUsernameText(testDataMap.get("username"));
 }
 @DataProvider
 public Object[][]  getTestData()
 {
	 Object[][] data =new Object[1][1];
	data[0][0]= UtilKit.getTestdataFromExcel("TC-101");
	
	 
	return data;
	 
 }
 
}
