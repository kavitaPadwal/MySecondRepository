package Tests;



import org.testng.annotations.Test;

import Pages.intake_home;


public class selectfacility_TNG extends Login_TNG  {
	
	
	@Test
    public  void Select_facilitymethod() {
		
			
		intake_home dropobj=new intake_home(driver);
		dropobj.selectdropdown("Life");
		dropobj.ClickOnSubmit();
	}
}
