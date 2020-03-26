package com.MavenTemplates.Automate;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EnrichandReveal {
public WebDriver driver;
	
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver" ,"/Users/geetika/Desktop/Automation/MAC/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://campaign.odicci.com/#/f96058f1bc572ff34e7e");
		driver.findElement(By.id("1040")).click();
		driver.findElement(By.id("1040")).sendKeys("1993geetika@gmail.com");
		driver.findElement(By.cssSelector("#element-36723 > div > div > label:nth-child(4) > input")).click();
		driver.findElement(By.id("1096")).click();
		driver.findElement(By.xpath("//*[@id=\"submitButton\"]/div")).click();
		driver.findElement(By.xpath("//*[@class=\"string\"]")).click();
		AssertJUnit.assertEquals("This voucher will be send to you by email as well. This voucher is only valid for products with a minimum price of £40. Terms & Conditions apply.",driver.findElement(By.xpath("//*[@id=\"element-36727\"]/div/div/div")).getText());
		
		
		driver.quit();
		
}
}
