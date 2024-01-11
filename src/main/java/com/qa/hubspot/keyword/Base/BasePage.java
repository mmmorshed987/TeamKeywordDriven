package com.qa.hubspot.keyword.Base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

	public WebDriver driver;
	public Properties prop;
	
	
	public WebDriver init_driver(String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome")) {
		WebDriverManager.edgedriver().setup();
		// Headless Mode
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--Headless");
		driver = new ChromeDriver(options);
		
		}
		else {
			driver = new ChromeDriver();
		}
		
		return driver;
				
	}
	
	
	public Properties init_Properties()  {
		prop = new Properties();
		
	try {
	FileInputStream ip = new FileInputStream ("C:\\Users\\mmmor\\eclipse-workspace\\TeamKeywordDriven\\"
			+ "src\\main\\java\\config\\config.properties"); 
	
	prop.load(ip);}
	
	catch (FileNotFoundException e) {
		e.printStackTrace();    // what is it?
	}catch (IOException e) {
		e.printStackTrace();
	}
			
		return prop;
		
	}
	
	
	
	
}
