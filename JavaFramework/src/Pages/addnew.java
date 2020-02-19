package Pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class addnew {

WebDriver driver;
 
	
	public addnew(WebDriver driver) {
    this.driver=driver;	
    
    }
	
	/* By AddNew=By.id("add");
	public void Explicitwait() {
	
		(new WebDriverWait(driver, 100)).until(ExpectedConditions.presenceOfElementLocated(AddNew));
	     driver.findElement(AddNew).click();
	     
	}*/
	
	    By date1=By.name("patientdata_length");
		  public void date(){
		  
		  driver.findElement(date1).click();
		  
		  }
		  
	  
	  
	 By AddNew=By.id("add");
	    public void ClickOnAddnew() {
	    	driver.findElement(AddNew).click();
	    	
	    	
	    	
	    }
	     
	
	      
	    
	
		
	    public void servicedropdown(String text) {
	    	WebElement Service_dropdown=driver.findElement(By.id("ServiceType"));
	    	Select Facility=new Select(Service_dropdown);
	    	//Facility.selectByIndex(index);
	    	Facility.selectByVisibleText(text);
	    	}
	    
	    By Add=By.id("button");
		
	    public void ClickOnAdd() {
	    	
	    	driver.findElement(Add).click();
	    	
	    	
	    	
	    }
	    
	    
	 
	    
	  /*  public void Firstname(String text) {
	    	 driver.findElement(By.id("firstname")).sendKeys(text);
	    	 List<WebElement> autosuggest=driver.findElements(By.xpath("//div[starts-with(@id,'ui-id-')]"));
	    	    
	    	    // verify the size of the list
	    	    System.out
	    	            .println("Size of the AutoSuggets is = " + autosuggest.size());
	    	    // print the auto suggest
	    	    for (WebElement a : autosuggest)
	    	        System.out.println("Values are = " + a.getText());
	    	    // suppose now you want to click on 3rd auto suggest then simply do like
	    	    // this
	    	    autosuggest.get(2).click();
	    	   
	    }*/
	    
	    
	    
	    
}
