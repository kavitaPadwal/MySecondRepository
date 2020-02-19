package com.automation.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserfactory {
	
	public static WebDriver startBrowser(WebDriver driver,String browsername,String url) {
		
		if(browsername.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\selenium materials\\Chrome\\chromedriver.exe");
	   		 driver=new ChromeDriver(); 
			
		}
		else if(browsername.equals("Firefox")) {
			System.setProperty("webdriver.firefox.marionette",".\\Drivers\\geckodriver.exe\\");
   		 driver=new FirefoxDriver();
			 
		}
		else { 
			System.out.println("we do not support this browser");
		}
		
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		return driver;
	}
	
	
	public static void quiteBrowser(WebDriver driver) {
		 driver.quit();
	}

}
