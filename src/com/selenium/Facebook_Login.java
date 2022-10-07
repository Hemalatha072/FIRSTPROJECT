package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login {
	private static WebDriver driver;

	public static void main(String[] args)throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NETHAJI M\\Downloads\\chromedriver.exe");
		WebDriver drive = new ChromeDriver(); //upcasting
		drive.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		 //maximize
		String show = drive.getCurrentUrl();
		System.out.println(show);
		System.out.println("--------");
		String page = drive.getPageSource();
		System.out.println(page);
		
		  // ----->FIND ELEMENT
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("hemalatha07223@gmail.com");
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("987654321");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		// DAY - 5 -------->Take Screenshot
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;  // narrowing
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\NETHAJI M\\eclipse-workspace\\Selenium Project\\screenshot\\error1.png");
		FileUtils.copyFile(source,destination);
		

      
		
		
		
		
		
		
	}

}
