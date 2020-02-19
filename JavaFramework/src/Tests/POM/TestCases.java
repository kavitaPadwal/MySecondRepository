package Tests.POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestCases {
 
	public  static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.firefox.marionette","C:\\Users\\user\\Downloads\\gecko 9.0\\geckodriver.exe\\");
	     driver = new FirefoxDriver();
		 
		 
		driver.get("http://35.172.186.182/uhs/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		
	   Login_Testcase.Login_Testcasemethod();
		Select_facility.Select_facilitymethod();
		Switch_facility.Switch_facilitymethod();
		Add_new.Addnewmethod();
		calender_date.calenderdate();
		 

	}
	
	
	/*public static void Login_Testcasemethod()   {
		
		
	      IntakeLogin2 loginobj =new IntakeLogin2(driver);
	        
	    
		    loginobj.SetTextInUsername("intake");
		    loginobj.SetTextInPassword("intake");
		    loginobj.ClickOnButton();
		   
			
		}
	
      public static void Select_facilitymethod() {
		
		intake_home dropobj=new intake_home(driver);
		dropobj.selectdropdown();
		dropobj.ClickOnSubmit();
	}


       public static void Switch_facilitymethod() {
	 
	      switchfacility switchobj = new switchfacility(driver);
	      switchobj.ClickOnSwitchFacility();
	      switchobj.ClickOnSubmit();
	      driver.close();

}*/
       
	    
	}
	 
	