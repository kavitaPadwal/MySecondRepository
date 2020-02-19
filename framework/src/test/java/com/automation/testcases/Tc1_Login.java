package com.automation.testcases;

 

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.automation.Base.Base;
import com.automation.pages.page1_Login;
import com.automation.pages.page2_selectfacility;

 
//@Listeners(com.automation.utilities.ListenerTest.class)

public class Tc1_Login extends Base {
	
	
	@Test(dataProvider="wordpress")
	public void login(String username,String password) throws InterruptedException {
		page1_Login login=new page1_Login();
		login.login(username, password);
		login.dprovider1();
		Thread.sleep(5000);
		
	
		//login.login(excel.getStringData("Login", 0, 0),excel.getStringData("Login", 0, 1));
		
	}
	



      @DataProvider(name="wordpress")
	public Object[][] getdata() {
		
	//int rows=excel.getRowCount(0);
	
    	  Object[][] data=new Object[3][2]; 
	try {
		
	for(int i=0;i<3;i++) {
		data[i][0]=excel.getStringData(0,i, 0);
		data[i][1]=excel.getStringData(0,i, 1);

	}
	//return data;
	
	
	
	}catch(Exception e) {
		System.out.println("handle"+e);
	}
	return data;
	
		
	}
	
	/*@DataProvider(name="wordpress")
	public Object[][] getdata(){
		Object[][] data=new Object[3][2];
		
		data[0][0]="provider";
		data[0][1]="prp";
				
		data[1][0]="provider";
		data[1][1]="provider";
		
		data[2][0]="provider";
		data[2][1]="prp";
		
		return data;
	}*/
      
      @Test(groups = { "smoke" },priority=1, description="My Sample Test Fail")
      public void secondclass() {
    	  System.out.println("this is first class");
    	  String expectedTitle = "TestingFailed";
    	  Assert.assertEquals(driver.getTitle(), expectedTitle, "Title not matched"); 
      }
      
      @Test(groups = { "smoke" },priority=0, description="My Sample Test Pass")
      public void thirdclass() {
    	  System.out.println("this is second class");
      }
      
      @Test(groups = { "regression" })
      public void fourthclass() {
    	  System.out.println("this is regression test");
      }
      
      @Test(groups = { "regression" })
      public void fifthclass() {
    	  System.out.println("this is regression test");
      }
      
  	
}
	
	
