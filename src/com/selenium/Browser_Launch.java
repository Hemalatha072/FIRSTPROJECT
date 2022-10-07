package com.selenium;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.print.DocFlavor.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Browser_Launch {
	private static WebDriver driver;
	
	 public static void main(String[] args) {

		 
	// public static void main(String[] args, By a)throws InterruptedException, IOException {
		 
		                   //DAY - 2
		 
		// Configuring the system properties of chrome driver
		 
	//	System.setProperty("webdriver.chrome.driver","C:\\Users\\NETHAJI M\\Downloads\\chromedriver.exe");

		//Initializing the browser driver
//		WebDriver drive = new ChromeDriver(); //upcasting
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		WebElement amazon = a.findElement ((SearchContext) By.xpath("//input[@dir='auto'"));
//		amazon.click();
//		

		//Navigating through a particular website
		 
	//	driver.get("https://www.amazon.in/");
	        //maximize
//		String show = drive.getCurrentUrl();
//		System.out.println(show);
//		System.out.println("--------");
//		String page = drive.getPageSource();
//		System.out.println(page);
//		
		// Navigate methods
		 
	//   driver.navigate().to("https://www.flipkart.com/");
		
	//	driver.navigate().back();                  //amazon
	//	driver.navigate().forward();                //flipkart
	//	driver.navigate().refresh();               //refresh

//		System.out.println("Selenium Webdriver Script in Chrome");
//		driver.close();
		                    // DAY - 3
	
		//minimize
		
//    	Dimension size=new Dimension(500,400);
//    	driver.manage().window().setSize(size);
//    	
//		String title = driver.getTitle();
//		System.out.println(title);
//		
		
//		                  // ----->FIND ELEMENT
		 
//     	WebElement email = driver.findElement(By.id("email"));
//		email.sendKeys("hemalatha07223@gmail.com");
//		WebElement password = driver.findElement(By.name("pass"));
//		password.sendKeys("987654321");
//     	WebElement login = driver.findElement(By.name("login"));
//		login.click();
		
		
		              // DAY - 4 -------------> x-path - absolute x-path
		 
//       	WebElement create= driver.findElement(By.xpath("(//a[@role='button'])[2]"));
//		create.click();
//		Thread.sleep(3000);
//		WebElement fname = driver.findElement(By.name("firstname"));
//		fname.sendKeys("Hema");
//		WebElement sname = drive.findElement(By.xpath("(//input[@'type'])[3]"));
//		sname.sendKeys("Hemalatha");
//		WebElement mnumber = drive.findElement(By.xpath("(//input[contains(@class,'inputtext_58mg_')])[3]"));
//		mnumber.sendKeys("123459876");
//		WebElement pass = drive.findElement(By.xpath("(//input[@autocomplete='new-pasword']"));
//		pass.sendKeys("123456789");
//		WebElement gender = drive.findElement(By.xpath("(//label[@class='class'_58mt'])[2]"));
//		gender.click();
//	    WebElement sign = drive.findElement(By.xpath("(//span[@class='hidden_elem_58ml'])[1]"));
//	    sign.click();
//		
		
		
		             // DAY - 5 -------->Take Screenshot
//		
//		TakesScreenshot ts = (TakesScreenshot) driver;  // narrowing
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		File destination = new File("C:\\Users\\NETHAJI M\\eclipse-workspace\\Selenium Project\\screenshot\\error1.png");
//		FileUtils.copyFile(source,destination);
		
		             // DAY - 6 ----------> SINGLE DROPDOWN
//		
//		WebElement day = driver.findElement(By.id("month"));
//		Select s = new Select(day);
//		s.selectByValue("19");
//		WebElement month = driver.findElement(By.id("month"));
//		Select s1 = new Select(month);
//		s1.selectByIndex(11);
//		
		            //DAY-7 ----------> MULTIPLE DROPDOWN 
		
		WebElement multi = driver.findElement(By.xpath("(//select)[6]"));
		Select s = new Select(multi);
		s.selectByValue("1");
		s.selectByIndex(2);
		s.selectByVisibleText("Loadrunner");
		
	//	s.deselectByIndex(2);
		
		boolean multiple = s.isMultiple();
		System.out.println("To check is multiple: "+multiple);
		System.out.println("-----------------------------------------");
		
		// getOptions
		
		List<WebElement> options = s.getOptions();
		for(WebElement webElement: options) {
			System.out.println("get Options : "+webElement.getText());
			
		}
		
		System.out.println("-----------------------------------------");
	
		// get All selected options
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for(WebElement webElement1 : allSelectedOptions) {
			System.out.println("get all selected options: "+webElement1.getText());
		}
		
		System.out.println("--------------------------------------");
		
		// First Selected Option
		
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println("get first selected options: "+firstSelectedOption.getText());
		
		
		}	
	

}
