package Tests.POM;





import Pages.IntakeLogin2;


public class Login_Testcase extends TestCases   {
	
public static void Login_Testcasemethod()    {
		
		
      /* IntakeLogin2 loginobj =new IntakeLogin2(driver){
    
	    loginobj.SetTextInUsername("intake"); 
	    loginobj.SetTextInPassword("intake");
	    loginobj.ClickOnButton();*/
	   
		
	
	IntakeLogin2.SetTextInUsername(driver).sendKeys("intake");
	IntakeLogin2.SetTextInPassword(driver).sendKeys("intake");
	IntakeLogin2.ClickOnButton(driver).click();
	
	
}
}