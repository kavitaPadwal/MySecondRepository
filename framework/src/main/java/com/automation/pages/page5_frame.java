package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.Base.Base;
import com.automation.utilities.common;


public class page5_frame extends Base {
	
	public page5_frame() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@id=\"tinymce\"]/p")
	   WebElement text;
	
	
	@FindBy(xpath="/html/body")
	     WebElement name;
	
	public void frame() {
		common.frame();
		driver.switchTo().frame(0);
	String txt=	text.getText();
	System.out.println("the txt is"+txt);
	}
	

	  public void name() {
		  common.frame();    
		  driver.switchTo().frame(1);
		//  common.frame();
		//  driver.switchTo().frame(2);   
		  String txt=name.getText();
		System.out.println("the txt is"+txt);
		 
		  
	  }
}
