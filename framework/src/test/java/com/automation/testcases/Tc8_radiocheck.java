package com.automation.testcases;

import org.testng.annotations.Test;

import com.automation.Base.Base;
import com.automation.pages.page8_radiocheck;

public class Tc8_radiocheck extends Base  {
	
	@Test
	public void radio() {
		page8_radiocheck obj=new page8_radiocheck();
	    obj.check(excel.getStringData("Login", 3, 0));
	}

}
