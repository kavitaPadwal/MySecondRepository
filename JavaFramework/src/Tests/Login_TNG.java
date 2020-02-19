package Tests;


import org.testng.annotations.Test;

import Pages.IntakeLogin2;

public class Login_TNG extends TestNg_Demo{
	
	@Test
    public void Login_Testcasemethod()    {
	
  	  IntakeLogin2 loginobj =new IntakeLogin2(driver);
       
  	  loginobj.SetTextInUsername("intake");
	      loginobj.SetTextInPassword("intake");
	      loginobj.ClickOnButton();
	   
	      
	      
		
	}

}
