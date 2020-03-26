package com.MavenTemplates.Automate;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TaptorevealValentine {
public WebDriver driver;
	
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver" ,"/Users/geetika/Desktop/Automation/MAC/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://campaign.odicci.com/#/2fd2eb4ad94481380957");
		
		driver.findElement(By.xpath("//*[@id=\"tapImage0\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"tapImage0\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"tapImage0\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"tapImage0\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"tapImage0\"]")).click();
		driver.findElement(By.id("1480")).click();
		driver.findElement(By.id("1480")).sendKeys("1993geetika@gmail.com");
		driver.findElement(By.id("1504")).click();
		driver.findElement(By.id("1609")).click();
		driver.findElement(By.xpath("//*[@id=\"submitButton\"]/div")).click();
		
		driver.quit();
	}
}
