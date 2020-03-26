package com.MavenTemplates.Automate;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WheelofFortune {
public WebDriver driver;
	
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver" ,"/Users/geetika/Desktop/Automation/MAC/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://campaign.odicci.com/#/f510e7b68517a45eacb7");
		driver.findElement(By.id("1480")).click();
		driver.findElement(By.id("1480")).sendKeys("1993geetika@gmail.com");
		driver.findElement(By.id("1504")).click();
		driver.findElement(By.id("1609")).click();
		driver.findElement(By.xpath("//*[@id=\"submitButton\"]/div")).click();
		//assertEquals("Spin the wheel to find out what your special Easter egg has in store for you!",driver.findElement(By.xpath("//*[@id=\"element-38969\"]/div/div/div")).getText());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	driver.findElement(By.cssSelector("#canvasFront")).click();
		driver.quit();
		
		
}
}
