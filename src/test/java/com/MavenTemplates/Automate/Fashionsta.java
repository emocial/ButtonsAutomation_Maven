package com.MavenTemplates.Automate;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Fashionsta {
	public WebDriver driver;
	
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver" ,"/Users/geetika/Desktop/Automation/MAC/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://campaign.odicci.com/#/fetchfar");
		driver.findElement(By.id("1040")).click();
		driver.findElement(By.id("1040")).sendKeys("1993geetika@gmail.com");
		driver.findElement(By.id("1096")).click();
		driver.findElement(By.id("1611")).click();
		driver.findElement(By.xpath("//*[@id=\"submitButton\"]/div")).click();
		AssertJUnit.assertEquals("What do you in your free time?",driver.findElement(By.xpath("//*[@id=\"element-52525\"]/div/div/div")).getText());
		driver.findElement(By.cssSelector("#imageTagBox > div > div:nth-child(4) > div > div.imageTagElementImageWrapper.clickable > div > span")).click();
		AssertJUnit.assertEquals("What's your style?",driver.findElement(By.xpath("//*[@id=\"element-52532\"]/div/div/div")).getText());
		driver.findElement(By.cssSelector("#imageTagBox > div > div:nth-child(2) > div > div.imageTagElementImageWrapper.clickable > div")).click();
		AssertJUnit.assertEquals("Which food do you like?",driver.findElement(By.xpath("//*[@id=\"element-52540\"]/div/div/div")).getText());
		driver.findElement(By.cssSelector("#imageTagBox > div > div:nth-child(2) > div > div.imageTagElementImageWrapper.clickable > div")).click();
		AssertJUnit.assertEquals("What music do you like?",driver.findElement(By.xpath("//*[@id=\"element-52547\"]/div/div/div")).getText());
		driver.findElement(By.cssSelector("#imageTagBox > div > div:nth-child(1) > div > div.imageTagElementImageWrapper.clickable > div")).click();
		AssertJUnit.assertEquals("Where would you go for a weekend?",driver.findElement(By.xpath("//*[@id=\"element-52554\"]/div/div/div")).getText());
		driver.findElement(By.cssSelector("#imageTagBox > div > div:nth-child(4) > div > div.imageTagElementImageWrapper.clickable > div > span")).click();
		AssertJUnit.assertEquals("CLASSIC",driver.findElement(By.xpath("//*[@id=\"element-52567\"]/div/div/div")).getText());
		driver.quit();
		
		

}
}
