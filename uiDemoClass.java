package com.automation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.automation.base.uiDemoBaseClass;
import com.automation.common.selectBrowsers;

public class uiDemoClass extends selectBrowsers {
	//.. Enabled = False used to ignore this test case.
  @Test(enabled=false)
  public void loginTest() {
	  uiDemoBaseClass baseClass = new uiDemoBaseClass(driver);
	  baseClass.loginPage(driver);
  }

  @Test
  public void RegisterTest() {
	  uiDemoBaseClass baseClass = new uiDemoBaseClass(driver);
	  baseClass.registerPage(driver);
  }
  
  @Test
  public void enterInloginform(){
	  uiDemoBaseClass baseClass = new uiDemoBaseClass(driver);
	  baseClass.loginform(driver);
  }

  @BeforeClass
  public void beforeClass() {
	try {
		selectWebdriver("chrome");
		loginUrl();	  
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }

  @AfterClass
  public void afterClass() {
//driver.close();
  }

 
}
