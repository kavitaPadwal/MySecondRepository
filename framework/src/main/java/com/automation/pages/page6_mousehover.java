package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.Base.Base;
import com.automation.utilities.common;

public class page6_mousehover extends Base {
	public page6_mousehover() {
		PageFactory.initElements(driver, this);
	}
	
   @FindBy(xpath="//*[@id=\"content\"]/div/div[1]/img")
       WebElement hover;
   
   @FindBy(xpath="//div[@class='figure'][1]//a")
        WebElement Subelement;
   
   
   public void hover() {
	    common.Actionclass(hover);
		String text=Subelement.getText();
		System.out.println("the text is:"+text);
		Subelement.click();
		
   }
	
	

}
