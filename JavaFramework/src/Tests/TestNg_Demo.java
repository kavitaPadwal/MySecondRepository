package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.BeforeTest;






public class TestNg_Demo {
 
	public static WebDriver driver;
	
	    @BeforeTest
		public void setUpTest() {
		System.setProperty("webdriver.firefox.marionette","C:\\Users\\user\\Downloads\\gecko 9.0\\geckodriver.exe\\");
	     driver = new FirefoxDriver();
	     driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);	
	     driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
	     driver.get("http://35.172.186.182/uhs/");
			driver.manage().window().maximize();
		    
			
		}
		
		
	   
        /* @Test
	      public void Login_Testcasemethod()   {
		
	    	  IntakeLogin2 loginobj =new IntakeLogin2(driver);
	         
	    	  loginobj.SetTextInUsername("intake");
		      loginobj.SetTextInPassword("intake");
		      loginobj.ClickOnButton();
		   
			
		}
	@Test
      public  void Select_facilitymethod() {
		
		intake_home dropobj=new intake_home(driver);
		dropobj.selectdropdown();
		dropobj.ClickOnSubmit();
	}

        @Test
       public void Switch_facilitymethod() {
	 
	      switchfacility switchobj = new switchfacility(driver);
	      switchobj.ClickOnSwitchFacility();
	      switchobj.ClickOnSubmit();
	      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	

}
       
       @AfterTest
       public void tearDown() {
    	   driver.close();   
       }*/
	    
	}
	 
	