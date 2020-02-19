package Tests;


import org.testng.annotations.Test;


import Pages.addnew;


public class Addnew_TNG extends switchfacility_TNG {

	@Test
	public  void Addnewmethod() {
		addnew addnewobj= new addnew(driver);
		//addnewobj.date();
		//addnewobj.ClickOnAddnew();
		
		//addnewobj.Explicitwait();
		//addnewobj.ClickOnAddnew();
		
		addnewobj.servicedropdown("WALK-IN");
		
		addnewobj.ClickOnAdd();
		
		//addnewobj.Firstname("test");
		
		
		
		
		
}
}
