package com.automation.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.Base.Base;

public class page8_radiocheck extends Base {
	public page8_radiocheck() {
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//div[@id='checkboxes']/label/input")
	  List< WebElement> checkbox;
	
	
	public void check(String menu) {
		int count= checkbox.size();
		System.out.println("the box count is:"+count);
		
		
		for(int i=0;i<count;i++) {
		String text=checkbox.get(i).getAttribute("value");
		System.out.println("the text is"+text);
			
		if(text.equals(menu)) {
			checkbox.get(i).click();
			
			System.out.println("the selected name is:"+menu);
		
		
		}
		}
		
	}
	
}
