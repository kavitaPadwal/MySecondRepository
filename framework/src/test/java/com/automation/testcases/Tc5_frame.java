package com.automation.testcases;

import org.testng.annotations.Test;

import com.automation.Base.Base;
import com.automation.pages.page5_frame;

public class Tc5_frame extends Base {
	
	@Test
	
	public void frame() {
		page5_frame obj= new page5_frame();
		//obj.frame();
		obj.name();
	}

}
