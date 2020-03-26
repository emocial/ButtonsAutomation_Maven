package com.MavenTemplates.Automate;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenGiftBox {
public WebDriver driver;
	
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver" ,"/Users/geetika/Desktop/Automation/MAC/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://campaign.odicci.com/#/94e65e43eb77b1233f17");
		driver.findElement(By.id("1042")).click();
		driver.findElement(By.id("1042")).sendKeys("Geetika");
		driver.findElement(By.id("1043")).click();
		driver.findElement(By.id("1043")).sendKeys("S");
		driver.findElement(By.id("1040")).click();
		driver.findElement(By.id("1040")).sendKeys("1993geetika@gmail.com");
		driver.findElement(By.id("1096")).click();
		driver.findElement(By.xpath("//*[@id=\"submitButton\"]/div")).click();
		driver.findElement(By.id("top-lace")).click();
		AssertJUnit.assertEquals("Well done!",driver.findElement(By.xpath("//*[@id=\"element-37005\"]/div/div/div")).getText());
		
driver.quit();
}
}
