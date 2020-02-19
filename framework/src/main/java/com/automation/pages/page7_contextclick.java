package com.automation.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.Base.Base;
import com.automation.utilities.common;

public class page7_contextclick extends Base {
	
	public page7_contextclick() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="hot-spot")
	WebElement click ;
	
	
	
	public void click() {
		boolean elePresent=click.isDisplayed();
		System.out.println("the element is:"+elePresent);
		
		
		common.Contextclick(click);
		common.alert();
		
	}
	
	
	
}


