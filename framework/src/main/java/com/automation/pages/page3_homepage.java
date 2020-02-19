package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.Base.Base;
import com.automation.utilities.common;



public class page3_homepage extends Base {
	

	public page3_homepage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="add")
	   WebElement addnew;
	
	@FindBy(id="ServiceType")
	     WebElement servicetype;
	
	@FindBy(id="button")
	     WebElement button;
	
	public page4_patientform clickonaddnew(String service) { 
		addnew.click();
		common.SelectByvisibleText(servicetype, service);
		button.click();
		return new page4_patientform();
		
	}
	
	
	



}
