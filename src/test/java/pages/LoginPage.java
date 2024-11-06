package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	public LoginPage()
	{
		//here this will replace loginpage.class
		//PageFactory.initElements(driver, this);
		super();
	}
	
	@FindBy(xpath="//input[@name='username']")
	WebElement usernameTextBox;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passwordTextBox;
	
	@FindBy(xpath="//input[@name='login']")
	WebElement loginButton;
	
	public void  usernameTextBox(String text)
	{
		//usernameTextBox.sendKeys("susmitha410");
		type(usernameTextBox,text);
	}
	public void passwordTextBox (String text)
	{
		//passwordTextBox.sendKeys("Susmitha@275");
		type(passwordTextBox,text);
		
	}
	public void loginButton()
	{
		//loginButton.click();
		click(loginButton);
	}
	
}
