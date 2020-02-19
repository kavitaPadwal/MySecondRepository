package com.automation.testcases;

import org.testng.annotations.Test;

import com.automation.Base.Base;
import com.automation.pages.page6_mousehover;

public class Tc6_mousehover  extends Base {
	
	@Test
	public void hover() {
		page6_mousehover obj= new page6_mousehover();
		obj.hover();
			
		
	}

}
