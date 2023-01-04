package com.neotech.utils;

import javax.management.RuntimeErrorException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	   public static 	WebDriver driver;
		
		
		
		/**
	this method will create the driver
		 */
		public static void setUp() {
			
			ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
			
			switch(ConfigsReader.getProperty("browser")) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
				driver = new ChromeDriver();
				break;
			case "firefox":
				System.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVER_PATH);
				driver = new FirefoxDriver();
				default:
					throw new RuntimeException("browser is not supported!!!");
					
			}
			
			driver.manage().window().maximize();
			driver.get(ConfigsReader.getProperty("url"));
			
		}
		
		
		/**
	this method will quit the browser
		 */
	public static void tearDown() {
		if (driver != null)
			driver.quit();
		
	}
		public static WebDriver getDriver() {
			return driver;
		}
		public static void setDriver(WebDriver driver) {
			BaseClass.driver = driver;
		}
	}