package Tests.POM;




import Pages.switchfacility;

public class Switch_facility extends Select_facility {
	 
	public static void Switch_facilitymethod()  {
		 
		switchfacility switchobj = new switchfacility(driver);
		  
		  switchobj.ClickOnSwitchFacility();
		  switchobj.selectdropdown(1);
		  switchobj.ClickOnSubmit();
		  
}
}