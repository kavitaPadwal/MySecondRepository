package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class calender {
	
WebDriver driver;

 
	
	/*public calender(WebDriver driver) {
    this.driver=driver;	
    
    }
	
	
	
	By calender=By.xpath("//div[@id='datetimepicker2']/span"); 
	public void clickoncalender() {
		driver.findElement(calender).click();
	}*/
	
	
	public static WebElement clickoncalender(WebDriver driver){

	    WebElement element = driver.findElement(By.xpath("//div[@id='datetimepicker2']/span"));

	 return element;

	    }
	
	
	public static WebElement clickondate(WebDriver driver){
	    WebElement element = driver.findElement(By.xpath(".//*[@id='datetimepicker2']/div/ul/li[1]/div/div[1]/table/thead/tr[1]/th[2]"));
	    System.out.println("kavi");

	 return element;

	    }
	
	
	
	public static WebElement nextmonth(WebDriver driver){
		
	    WebElement element = driver.findElement(By.xpath(".//*[@id='datetimepicker2']/div/ul/li[1]/div/div[1]/table/thead/tr[1]/th[3]/span"));
         
	    
	   
	 return element;

	    }

}
