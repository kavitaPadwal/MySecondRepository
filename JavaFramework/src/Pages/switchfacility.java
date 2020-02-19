package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class switchfacility {
	
WebDriver driver;
	
	public switchfacility(WebDriver driver) {
      this.driver=driver;
	}
	
	By ClickOnSwitchFacility= By.xpath(".//*[@id='container']/div[1]/div[2]/a");
	public void ClickOnSwitchFacility() {
		driver.findElement(ClickOnSwitchFacility).click();
	}
	
	
	public void selectdropdown(int index) {
		WebElement SwitchFacility_dropdown=driver.findElement(By.id("facilityname"));
		Select SwitchFacility=new Select(SwitchFacility_dropdown);
		SwitchFacility.selectByIndex(index);
		
	}
	By ClickOnSubmit=By.name("submit");
	public void ClickOnSubmit() { 
		driver.findElement(ClickOnSubmit).click();
		
		}
	
	
	
    	
    	
    	
    }
		



