package Tests.POM;
import Pages.calender;

public class calender_date extends Add_new{
	static String Expmonth="January 2018";
	
	public static void calenderdate() throws InterruptedException {
	   // calender calenderobj=new calender(driver);
	   // calenderobj.clickoncalender();
		calender.clickoncalender(driver).click();
		
 
		String currmonth=calender.clickondate(driver).getText();
		if(Expmonth.equals(currmonth)){
			System.out.println("current month is selected");
			
		}
		
		else
		{
			for(int i=1;i<12;i++) {
				calender.nextmonth(driver).click();
				Thread.sleep(1000);
				String currmonth1=calender.clickondate(driver).getText();
				if(Expmonth.equals(currmonth1)){
					System.out.println(" month is selected");
					
				}
				
			}
		}
	
}
}