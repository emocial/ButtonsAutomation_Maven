package com.MavenTemplates.Automate;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Jackpot {
public WebDriver driver;
	
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver" ,"/Users/geetika/Desktop/Automation/MAC/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://campaign.odicci.com/#/d377632ed7d16c5557c9");
		driver.findElement(By.id("1042")).click();
		driver.findElement(By.id("1042")).sendKeys("Geetika");
		driver.findElement(By.id("1040")).click();
		driver.findElement(By.id("1040")).sendKeys("1993geetika@gmail.com");
		driver.findElement(By.id("1096")).click();
		driver.findElement(By.id("1611")).click();
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//*[@id=\"jackpot\"]/div[2]/div/div[6]")).click();
		//assertEquals("Congratulations!",driver.findElement(By.xpath("//*[@id=\"element-37650\"]/div/div/div")).getText());
		driver.quit();
		
}
}
