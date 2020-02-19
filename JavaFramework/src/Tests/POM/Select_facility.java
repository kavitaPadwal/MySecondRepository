package Tests.POM;







import Pages.intake_home;

public class Select_facility extends Login_Testcase{
	 
	

	public static void Select_facilitymethod() {
		
		intake_home dropobj=new intake_home(driver);
		dropobj.selectdropdown("Life");
		dropobj.ClickOnSubmit();
	}	 
	
}



 
	
	
	


