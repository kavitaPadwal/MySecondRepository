package Tests;




import org.testng.annotations.Test;

import Pages.switchfacility;

public class switchfacility_TNG extends  selectfacility_TNG  {
	  
	  @Test
      public void Switch_facilitymethod() throws InterruptedException {
	 
	      
		switchfacility switchobj = new switchfacility(driver);
	      switchobj.ClickOnSwitchFacility();
	      switchobj.selectdropdown(1);
	      switchobj.ClickOnSubmit();
	      	   	

}
	  
       
	 /* @AfterTest
      public void tearDown() {
   	   driver.close();   
      }*/
}
