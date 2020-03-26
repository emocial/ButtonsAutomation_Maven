package com.MavenTemplates.Automate;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Swipesurveytemplate {
public WebDriver driver;
	
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver" ,"/Users/geetika/Desktop/Automation/MAC/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://campaign.odicci.com/#/f012f960c4e53a2d18da");
		driver.findElement(By.xpath("//*[@id=\"specialEmodule\"]/div[8]/div[2]/div[2]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"specialEmodule\"]/div[10]/div[2]/div[2]/button[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"specialEmodule\"]/div[14]/div[2]/div[2]/button[2]")).click();
		driver.findElement(By.id("1042")).click();
		driver.findElement(By.id("1042")).sendKeys("Geetika");
		driver.findElement(By.id("1612")).click();
		driver.findElement(By.id("1612")).sendKeys("1993geetika@gmail.com");
		driver.findElement(By.id("1096")).click();
		driver.findElement(By.xpath("//*[@id=\"submitButton\"]/div")).click();
		
		
		driver.quit();
		
		
		
		
		
		
	}
}
