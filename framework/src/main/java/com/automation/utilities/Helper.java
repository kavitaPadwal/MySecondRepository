package com.automation.utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.automation.Base.Base;



public class Helper extends Base  {
	
	public static void ScreenShot(WebDriver driver) {
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileHandler.copy(src, new File("./Screenshots/UHS_"+getCurrentDateTime() +".png"));
	System.out.println("screenshot captured successfully");
	} catch (IOException e) {
		System.out.println("Unable to capture screenshot"+e.getMessage());
		
	}
	}
	
	public static String getCurrentDateTime() {
		DateFormat customformat=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss"); 
		Date currentDate=new Date();
		return customformat.format(currentDate);
	}
	
	
	
	
	public static void navigate_back() {
		driver.navigate().back();
		}
	
		

}
