package com.automation.testcases;

import com.automation.Base.Base;
import com.automation.pages.page1_Login;
import com.automation.pages.page2_selectfacility;

public class Tc4_patientform extends Base {
	
	public void form() {
		
		page1_Login login;
		page2_selectfacility facility;
		
		login=new page1_Login();
		facility=login.login(excel.getStringData("Login", 0, 0),excel.getStringData("Login", 0, 1));
	}

}
