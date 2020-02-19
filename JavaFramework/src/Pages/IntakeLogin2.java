package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class IntakeLogin2   {

	  WebDriver driver;
	
	//By Intake_Username=By.name("username");
	//By Intake_Password=By.name("password");
	//By Intake_Submit=By.name("submit");
	
	
	// public IntakeLogin2(WebDriver driver) {
    // 	this.driver=driver  ;    	
   //  }
	
	

	/*public  void  SetTextInUsername(String text) {
	
		//System.out.println("driver"+driver);

	driver.findElement(Intake_Username).sendKeys(text);
	}
	
	
	
	public void SetTextInPassword(String text) {
		driver.findElement(Intake_Password).sendKeys(text);
		
	}
	
	public void ClickOnButton() {
		driver.findElement(Intake_Submit).click();
	}*/
	 
	 
	 public static WebElement SetTextInUsername(WebDriver driver){

		    WebElement element = driver.findElement(By.name("username"));

		 return element;

		    }

	 public static WebElement SetTextInPassword(WebDriver driver){

		    WebElement element = driver.findElement(By.name("password"));

		 return element;

		    }
	 
	 
	 
	 public static WebElement ClickOnButton(WebDriver driver){

		    WebElement element = driver.findElement(By.name("submit"));

		 return element;

		    }

	
}

