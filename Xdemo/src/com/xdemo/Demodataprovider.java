package com.xdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demodataprovider {

	private static WebDriver driver;
	static String path2 = "C:\\Users\\anude\\eclipse-workspace\\Xdemo\\drivers\\geckodriver.exe";
	static String path = "C:\\Users\\anude\\eclipse-workspace\\Xdemo\\drivers\\chromedriver.exe";
	 
	  @DataProvider(name = "Authentication")
	 
	  public static Object[][] credentials() {
	 
	        return new Object[][] { { "testuser_1", "Test@123" }};
	 
	  }
	 
	  // Here we are calling the Data Provider object with its Name
	 
	  @Test(dataProvider = "Authentication")
	 
	  public void test(String sUsername, String sPassword) {
		  System.setProperty("webdriver.gecko.driver", path2);
		  System.setProperty("webdriver.chrome.driver", path);
		 // driver = new FirefoxDriver();
		  driver = new ChromeDriver();
	 
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	      driver.get("http://www.store.demoqa.com");
	 
	      driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	 
	      driver.findElement(By.id("log")).sendKeys(sUsername);
	 
	      driver.findElement(By.id("pwd")).sendKeys(sPassword);
	 
	      driver.findElement(By.id("login")).click();
	 
	      driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
	 
	      driver.quit();
	 
	  }
	 
	}

