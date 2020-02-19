package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.Base.Base;
import com.automation.utilities.common;

public class page9_windowhandles extends Base {
	
	public page9_windowhandles() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText="Click Here")
	   WebElement link;
	
	public void link() {
		link.click();
		common.windowhandles();
		


	}

}
