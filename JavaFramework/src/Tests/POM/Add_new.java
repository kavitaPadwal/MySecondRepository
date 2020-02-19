package Tests.POM;

import Pages.addnew;

public class Add_new extends Switch_facility {
	public static void Addnewmethod() {
		addnew addnewobj= new addnew(driver);
		addnewobj.date();
		addnewobj.ClickOnAddnew();
		
		//addnewobj.Explicitwait();
        //addnewobj.ClickOnAddnew();
		
		addnewobj.servicedropdown("WALK-IN");
		
		addnewobj.ClickOnAdd();
		
	//	addnewobj.Firstname("test");
		
	
		
		
	}

}
