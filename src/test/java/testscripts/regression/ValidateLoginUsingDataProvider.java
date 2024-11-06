package testscripts.regression;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;

public class ValidateLoginUsingDataProvider extends BaseTest {
	 @Test(dataProvider="getTestData")
	 public void validateLoginTest1(String username,String password,String expTitle)
	 {
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		 driver.findElement(By.xpath("//input[@id='login']")).click();
		 Assert.assertEquals(driver.getTitle(),expTitle);
	 }
	 @DataProvider
	 public Object[][]  getTestData()
	 {
		 Object[][] data =new Object[4][3];
		 
		 data[0][0]="susmitha410";
		 data[0][1]="Susmitha@410";
		 data[0][2]="Adactin.com - Search Hotel";
		 
		 data[1][0]="susmitha10";
		 data[1][1]="Susmitha@410";
		 data[1][2]="Adactin.com - Hotel Reservation System";
		 
		 data[2][0]="susmitha410";
		 data[2][1]="Susmitha@40";
		 data[2][2]="Adactin.com - Hotel Reservation System";
		 
		 data[3][0]="susmitha10";
		 data[3][1]="Susmitha@40";
		 data[3][2]="Adactin.com - Hotel Reservation System";
		 
		return data;
		 
	 }
	 
}
