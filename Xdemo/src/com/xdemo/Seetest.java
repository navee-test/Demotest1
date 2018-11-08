package com.xdemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Seetest {

	
	public static void main(String [] args) throws MalformedURLException {
//		DesiredCapabilities capabilities = new DesiredCapabilities();
	// //capabilities.setCapability("generateReport", false);
	// capabilities.setCapability(MobileCapabilityType.UDID,"HT6CT0201365");
	// capabilities.setCapability("accessKey","eyJ4cC51Ijo1MCwieHAucCI6MiwieHAubSI6Ik1UVXpNelUyTVRZM056ZzBNUSIsImFsZyI6IkhTMjU2In0.eyJleHAiOjE4NDg5MjE2NzgsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.3B8O0hSUmD_UvtNe4RHMdlvokwU56gGvOWkeDp9Uf60");
	// capabilities.setCapability(MobileCapabilityType.APP, "cloud:com.pearson.android.readerplus.dev/com.pearson.android.readerplus.MainActivity");
//		AppiumDriver driver = new AndroidDriver(new URL("https://pearsonlab.cognizant.com/wd/hub"), capabilities);
//		//switchToContext(driver, "NATIVE_APP");
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("generateReport", false);
	capabilities.setCapability(MobileCapabilityType.UDID,"e5ea3219b29fd512b147e2c09bf3171a636eb05f");
	capabilities.setCapability("accessKey","eyJ4cC51Ijo1MCwieHAucCI6MiwieHAubSI6Ik1UVXpNelUyTVRZM056ZzBNUSIsImFsZyI6IkhTMjU2In0.eyJleHAiOjE4NDg5MjE2NzgsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.3B8O0hSUmD_UvtNe4RHMdlvokwU56gGvOWkeDp9Uf60");
	capabilities.setCapability(MobileCapabilityType.APP, "cloud:com.pearson.mobile.readerplus");
	AppiumDriver driver = new IOSDriver(new URL("https://pearsonlab.cognizant.com/wd/hub"), capabilities);
	//switchToContext(driver, "NATIVE_APP");
	//driver.quit();

	}


	}



