package com.MavenTemplates.Automate;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TravelSurvey {
	public WebDriver driver;
	
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver" ,"/Users/geetika/Desktop/Automation/MAC/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://campaign.odicci.com/#/151f52548fc9fb76e349");
		driver.findElement(By.id("303")).click();
		driver.findElement(By.id("303")).sendKeys("Geetika");
		driver.findElement(By.id("304")).click();
		driver.findElement(By.id("304")).sendKeys("S");
		driver.findElement(By.id("301")).click();
		driver.findElement(By.id("301")).sendKeys("1993geetika@gmail.com");
		driver.findElement(By.id("800")).click();
		driver.findElement(By.id("785")).click();
		driver.findElement(By.xpath("//*[@id=\"submitButton\"]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"specialEmodule\"]/div[8]/div[2]/div[2]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"specialEmodule\"]/div[10]/div[2]/div[2]/button[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"specialEmodule\"]/div[14]/div[2]/div[2]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"specialEmodule\"]/div[22]/div[2]/div[2]/button[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"specialEmodule\"]/div[36]/div[2]/div[2]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"specialEmodule\"]/div[58]/div[2]/div[2]/button[2]")).click();
		driver.quit();
		
		
		
		
		
}
}
