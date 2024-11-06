package testscripts.regression;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.SearchHotelPage;

public class ValidateLoginUsingPOM2 extends BaseTest {
 @Test
 public void validateLogin()
 {
	 LoginPage loginPage= new LoginPage();
	 loginPage.usernameTextBox("susmitha410");
	 loginPage.passwordTextBox("Susmitha@275");
	 loginPage.loginButton();
	 SearchHotelPage searchHotelPage=new  SearchHotelPage();
	 searchHotelPage.verifyTitle("Adactin.com - Search Hotel");
	 searchHotelPage.helloUsernameText("susmitha410");
 }
}
