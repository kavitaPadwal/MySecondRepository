package com.automation.utilities;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.automation.Base.Base;

public class common extends Base {

	public static void SelectByvisibleText(WebElement dropdown,String value) {
		Select selectitem=new Select((WebElement) dropdown);
		selectitem.selectByVisibleText(value);
		System.out.println("the selected item is"+selectitem);
		
	}
	
	
	public static void frame() {
		List<WebElement> frm= driver.findElements(By.tagName("frame"));
		int count=frm.size();
		System.out.println("the frame count is"+count);
	}
	
	public static void Actionclass(WebElement element) {
		Actions actions=new Actions(driver);
		actions.moveToElement(element).perform();
		
		
	}
	
	
	public static void Contextclick(WebElement element) {
		Actions actions=new Actions(driver);
		actions.moveToElement(element).contextClick().build().perform();
			
	}
	
	public static void alert() {
		Alert alert=driver.switchTo().alert();
		String textEdit = alert.getText();
		System.out.println("the text is"+textEdit);
		alert.accept();
	}
	
	
	
	
	public static void radiobuttons(List<WebElement> list,String name) {
		  int count=list.size();
		  System.out.println("the radiobutton count is:"+count);
		  for(int i=0;i<count;i++) {
			 String  name1=list.get(i).getText();
			  System.out.println("the names are:"+name1);
		  
		  if(name1.equals(name)) {
			  list.get(i).click();
			     
			  System.out.println("the selected name is:"+name);
		  }else {
			  System.out.println("not found");
		  }
		  }
		}
	
	public static void windowhandles() {
		
		Set<String>ids=driver.getWindowHandles();//collecting windows
		Iterator<String> it=ids.iterator(); //Switching to window
		String parentid=it.next(); //first go to parent window
		String childid=it.next();//from parent go to child window	
		driver.switchTo().window(childid);// Finally Switching to child window
		System.out.println(driver.getTitle());// After switching verifying
		driver.switchTo().window(parentid);// Again Switching to parent window
		System.out.println(driver.getTitle());// Switching back to parent verifying
		
		
	}
	
}
