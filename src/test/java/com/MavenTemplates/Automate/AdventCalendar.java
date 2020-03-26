package com.MavenTemplates.Automate;

import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AdventCalendar {
public WebDriver driver;
	
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver" ,"/Users/geetika/Desktop/Automation/MAC/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://campaign.odicci.com/#/test/15ae85261e971f6ff761");
		driver.findElement(By.id("1482")).click();
		driver.findElement(By.id("1482")).sendKeys("ABS");
		driver.findElement(By.id("1480")).click();
		driver.findElement(By.id("1480")).sendKeys("ABS@df.ss");
		driver.findElement(By.id("1083")).click();
		driver.findElement(By.xpath("//*[@id=\"submitButton\"]/div")).click();
		
		driver.quit();
		
		
}
}
