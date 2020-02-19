package com.automation.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automation.Base.Base;
import com.automation.utilities.common;

public class page2_selectfacility extends Base  {
	
    
	
	public page2_selectfacility() {
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(name="facilityname")
	  WebElement dropdown;
	
	@FindBy(name="facilityname")
	 List< WebElement> dropdown1;
	
	
	@FindBy(xpath="//input[@value='Submit']")
	    WebElement submit;
	
	@FindBy(xpath="//*[@id=\"logoutLi\"]/a")
	     WebElement logout;
	
	@FindBy(xpath="//*[@id=\"SignoutLi\"]/a")
    WebElement logout1;
	
	
      
    	public page3_homepage Selectfacilitydropdown(String text) {
    		int size=dropdown1.size();
    		System.out.println("the size is"+size);
    		for(int i=0;i<size;i++) {
    			System.out.println("The elements are:"+dropdown1.get(i).getText());
    		}
    		
    		common.SelectByvisibleText(dropdown, text);
    	    submit.click();
    	    logout.click();
    	    logout1.click();
    	    return new page3_homepage();
    	}
    	  
    	
    /*	public void clickonsubmit() {
    		submit.click();
			
    	}*/
    	

    	
      }

