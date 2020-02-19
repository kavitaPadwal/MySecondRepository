package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class intake_home {

   
    WebDriver driver;
 
	
	public intake_home(WebDriver driver) {
    this.driver=driver;
	}
	
	
	
	public void selectdropdown(String text) {
	WebElement Facility_dropdown=driver.findElement(By.id("facilityname"));
	Select Facility=new Select(Facility_dropdown);
	//Facility.selectByIndex(index);
	Facility.selectByVisibleText(text);
	}
	
	

     By Submit=By.xpath("html/body/div[2]/form/div[2]/input");
     public void ClickOnSubmit() {
    	 driver.findElement(Submit).click();
     }



	
}
