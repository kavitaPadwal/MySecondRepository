package com.automation.pages;


import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.automation.Base.Base;


public class page1_Login extends Base {
	public page1_Login() {
	PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(name="username")
	  WebElement username;
	
	
	@FindBy(name="password")
	  WebElement password;
	
	@FindBy(name="submit")
	  WebElement submit;
	
	@FindBy(xpath="//*[@id=\"logoutLi\"]/a")
    WebElement logout;

     @FindBy(xpath="//*[@id=\"SignoutLi\"]/a")
     WebElement logout1;
     
     @FindBy(xpath="//*[@id=\"LoginDiv\"]/div/div[2]/div")
     WebElement asert;


	
	
	public page2_selectfacility login (String uname,String pass) {
	    
		username.sendKeys(uname);
		password.sendKeys(pass);
		submit.click();
		 return new page2_selectfacility();
	}	
		public void dprovider1() {
		String text=driver.getCurrentUrl();
		System.out.println("the text is"+text);
		
		
		if(!text.equals("http://35.172.186.182/uhs/Signin")) {
			logout.click();
			logout1.click();
		}else {
			System.out.println("the another test data is ");
		}
		
       
		
		
	
	
	}




	
}


