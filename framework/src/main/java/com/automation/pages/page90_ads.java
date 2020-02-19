package com.automation.pages;


import org.openqa.selenium.support.PageFactory;

import com.automation.Base.Base;

public class page90_ads extends Base {
	public page90_ads() {
		PageFactory.initElements(driver,this);
	}
	
	public void ads() {
		String ads=driver.getWindowHandle();
		System.out.println("the windows is:"+ads);
	}

}
