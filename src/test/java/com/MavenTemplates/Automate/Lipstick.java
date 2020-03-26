package com.MavenTemplates.Automate;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lipstick {
	public WebDriver driver;
	
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver" ,"/Users/geetika/Desktop/Automation/MAC/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		driver.get("https://campaign.odicci.com/#/0891bcbfec2c0179e68d");
		driver.findElement(By.id("2338")).click();
		driver.findElement(By.id("2338")).sendKeys("Geetika");
		driver.findElement(By.id("1040")).click();
		driver.findElement(By.id("1040")).sendKeys("1993geetika@gmail.com");
		driver.findElement(By.id("1096")).click();
		driver.findElement(By.xpath("//*[@id=\"submitButton\"]/div")).click();
		AssertJUnit.assertEquals("Select your skintone:",driver.findElement(By.xpath("//*[@id=\"element-52605\"]/div/div/div")).getText());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"imageTagBox\"]/div/div[2]/div/div[1]/div")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AssertJUnit.assertEquals("Select your eye colour:",driver.findElement(By.xpath("//*[@id=\"element-52617\"]/div/div/div")).getText());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("#imageTagBox > div > div:nth-child(3) > div > div.imageTagElementImageWrapper.clickable > div")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AssertJUnit.assertEquals("Select your favourite make-up style:",driver.findElement(By.xpath("//*[@id=\"element-52621\"]/div/div/div")).getText());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("#imageTagBox > div > div:nth-child(4) > div > div.imageTagElementImageWrapper.clickable > div")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AssertJUnit.assertEquals("What finish would you prefer:",driver.findElement(By.xpath("//*[@id=\"element-52633\"]/div/div/div")).getText());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("#imageTagBox > div > div:nth-child(3) > div > div.imageTagElementImageWrapper.clickable > div")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AssertJUnit.assertEquals("In what occasion would you wear lipstick?",driver.findElement(By.xpath("//*[@id=\"element-52638\"]/div/div/div")).getText());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("#imageTagBox > div > div:nth-child(4) > div > div.imageTagElementImageWrapper.clickable > div")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AssertJUnit.assertEquals("Get your own VIVA GLAM LIPSTICK!",driver.findElement(By.xpath("//*[@id=\"element-52647\"]/div/div/div")).getText());
		
		
		driver.quit();
		
		
		
	}
}
