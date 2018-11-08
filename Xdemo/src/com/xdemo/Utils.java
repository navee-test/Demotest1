package com.xdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Utils {

	public static AppiumDriver driver;
	
	
	public static String linkpath = System.getProperty("user.dir");
	public static String path = linkpath + "\\demobuild\\app-pulse-release_original.apk";
	
	public static String D_Name;
	public static String D_version;
	public static String P_name;
	public static String packageName;
	public static String activity;
	public static FileInputStream f2;
	public static Properties prop;
	public static File fl;
	public static DesiredCapabilities cap;
	public static String file2 = linkpath + "\\testdata.properties";
	
//	public static void main(String [] args) {
//		System.out.println(linkpath);
//		System.out.println(linkpath + "\\demobuild\\app-pulse-release_original.apk");
//	}
	
	static {
		 prop = new Properties();
		
		try {
			//FileInputStream f2;
			f2 = new FileInputStream(file2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			
			prop.load(f2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		D_Name = prop.getProperty("deviceName");
		D_version = prop.getProperty("platformVersion");
		P_name = prop.getProperty("platformName");
		packageName = prop.getProperty("appPackage");
		activity = prop.getProperty("appActivity");
		
	}
	
	
	public void launchApp() throws IOException {
		
		
		
		 fl = new File(path);
		//Its a class and it will keep the key value data which support app launch
		cap = new DesiredCapabilities();
		//In whichh device given app need to install
		cap.setCapability("deviceName", D_Name);
		cap.setCapability("platformVersion", D_version);
		cap.setCapability("platformName", P_name);
		//Which app need to install and open
		cap.setCapability("app", fl.getAbsolutePath());
		cap.setCapability("appPackage", packageName);
		cap.setCapability("appActivity", activity);
	
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
	}
	
	public static String userName = "//a[@name='hellow']~xapth";
	public static String userName1 = "//a[@name='hellow']~id";
	public static String userName2 = "//a[@name='hellow']~css";
	
	public void getElement(String mobileElement) {
		
		String objecttype;
		objecttype = StringUtils.substringAfter(mobileElement, "~");
		
	}
	
}
