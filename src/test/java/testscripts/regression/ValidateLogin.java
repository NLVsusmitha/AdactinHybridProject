package testscripts.regression;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class ValidateLogin extends BaseTest {
	 @Test
	 public void validateLoginTest1()
	 {
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("susmitha410");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Susmitha@410");
		 driver.findElement(By.xpath("//input[@id='login']")).click();
		 Assert.assertEquals(driver.getTitle(),"Adactin.com - Search Hotel");
	 }
	 @Test
	 public void validateLoginTest2()
	 {
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("susmitha10");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Susmitha@410");
		 driver.findElement(By.xpath("//input[@id='login']")).click();
		 Assert.assertEquals(driver.getTitle(),"Adactin.com - Hotel Reservation System");
	 }
	 @Test
	 public void validateLoginTest3()
	 {
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("susmitha410");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Susmitha@0");
		 driver.findElement(By.xpath("//input[@id='login']")).click();
		 Assert.assertEquals(driver.getTitle(),"Adactin.com - Hotel Reservation System");
	 }
	 @Test
	 public void validateLoginTest4()
	 {
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("susmith410");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Susmitha@10");
		 driver.findElement(By.xpath("//input[@id='login']")).click();
		 Assert.assertEquals(driver.getTitle(),"Adactin.com - Hotel Reservation System");
	 }
}
