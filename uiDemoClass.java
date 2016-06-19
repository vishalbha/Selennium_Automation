package com.automation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
 




import com.automation.base.uiDemoBaseClass;
import com.automation.common.getDataProviderClass;
import com.automation.common.selectBrowsers;

public class uiDemoClass extends selectBrowsers {
	//.. Enabled = False used to ignore this test case.
  @Test(enabled=false)
  public void loginTest() {
	  uiDemoBaseClass baseClass = new uiDemoBaseClass(driver);
	  baseClass.loginPage(driver);
  }

  @Test(enabled=false)
  public void RegisterTest() {
	  uiDemoBaseClass baseClass = new uiDemoBaseClass(driver);
	  baseClass.registerPage(driver);
  }
  
  @Test(enabled=false)
  public void enterInloginform(){
	  uiDemoBaseClass baseClass = new uiDemoBaseClass(driver);
	  baseClass.loginform(driver);
  }

  @Test(dataProvider="Authentication" ,dataProviderClass=getDataProviderClass.class)
  public void checkCredentails(String sUsername, String sPassword){
	  uiDemoBaseClass baseClass = new uiDemoBaseClass(driver);
	   baseClass.loginPageUsingDataProvider(driver,sUsername ,sPassword);
	   driver.navigate().back();
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
