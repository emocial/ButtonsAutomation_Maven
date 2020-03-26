package com.MavenTemplates.Automate;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShaketorevealPrizes {
public WebDriver driver;
	
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver" ,"/Users/geetika/Desktop/Automation/MAC/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://campaign.odicci.com/#/3e3f3a54ed87be3f8a44");
		driver.findElement(By.xpath("//*[@id=\"specialEmodule\"]/div[8]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"submitButton\"]/div")).click();
		driver.findElement(By.id("1040")).click();
		driver.findElement(By.id("1040")).sendKeys("1993geetika@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"submitButton\"]/div")).click();
		AssertJUnit.assertEquals("Congratulations!",driver.findElement(By.xpath("//*[@id=\"element-11506\"]/div/div/div")).getText());
		
		driver.quit();
		
	}
}
