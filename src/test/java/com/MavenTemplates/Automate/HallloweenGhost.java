package com.MavenTemplates.Automate;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HallloweenGhost {
public WebDriver driver;
	
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver" ,"/Users/geetika/Desktop/Automation/MAC/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://campaign.odicci.com/#/e9594dbb6cbe851f6ae6");
		driver.findElement(By.id("tapImage0")).click();
		driver.findElement(By.id("tapImage0")).click();
		driver.findElement(By.xpath("//*[@id=\"submitButton\"]/div")).click();
		driver.findElement(By.id("1040")).click();
		driver.findElement(By.id("1040")).sendKeys("1993geetika@gmail.com");
		driver.findElement(By.id("1096")).click();
		driver.findElement(By.xpath("//*[@id=\"submitButton\"]/div")).click();
		
		driver.quit();
		
		
		
		
	}
}
