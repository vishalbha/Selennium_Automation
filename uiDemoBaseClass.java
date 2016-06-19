package com.automation.base;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.automation.pageobject.uiDemoPOClass;

public class uiDemoBaseClass {

	uiDemoPOClass pageobject;
	
	public uiDemoBaseClass(WebDriver driver) {
		pageobject= new uiDemoPOClass(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Check invalid Username Password test-case (Negative Test-Case)

	public void loginPage(WebDriver driver){
		driver.navigate().refresh();
		pageobject.clickLoginLink();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		pageobject.enterUsername();
		pageobject.enterPassword();
		pageobject.clickLoginButton();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Assert.assertEquals(pageobject.readErrorMessage(), "Invalid details. Please try again.");
	}
	
	public void loginPageUsingDataProvider(WebDriver driver,String sUsername , String sPassword){
		pageobject.clickLoginLink();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		pageobject.enterUsernameDP(sUsername);
		pageobject.enterPasswordDP(sPassword);
		pageobject.clickLoginButton();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Assert.assertEquals(pageobject.readErrorMessage(), "Invalid details. Please try again.");
	}
	//Go for registration but enter invalid length of number (Negative Test-Case)
	public void registerPage(WebDriver driver){
		pageobject.clickSignUpLink();
		pageobject.clickSIGNUPinInternalPage();
		//... Switch to another window
		String window = driver.getWindowHandle();
		driver.switchTo().window(window);
		pageobject.enterMobileNumber();
		pageobject.clickSignUpContinueBtn();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Assert.assertEquals(pageobject.readinvalidNumberError(),"Please enter a valid mobile number");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		pageobject.clickCloseIcon();
		
	}
	
	
	
	//(Positive Test-Case)
	public void loginform(WebDriver driver){
		pageobject.validEnterUsername();
		pageobject.validEnterPassword();
		pageobject.clickLoginButton();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Assert.assertEquals(pageobject.readFirstName(),"vishal");
		Assert.assertEquals(pageobject.readLastName(),"bhatt");
	//	driver.findElement(By.cssSelector(".btn.btn-blue")).click(); 
		//Assert.assertEquals(pageobject.readProfileupdatemsg(),"Your changes have been saved successfully.");
		pageobject.enterSearchItem();
		pageobject.clickSearchButton();
		//...Shortlist lowest price
		pageobject.clickLowerPrice();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		pageobject.selectItem();
		pageobject.clickOnAddToCart(); 
		driver.navigate().refresh();
		pageobject.clickOnCartButton();
		pageobject.clickonWishlistlink();
		driver.navigate().back();
		pageobject.clickBuyNowBtn();
		pageobject.clickDeleteOption();	
		//.. Handle Alert.
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();
		pageobject.clickEditOption();
		String window1= driver.getWindowHandle();
		driver.switchTo().window(window1);
		pageobject.clearNameValue();
		pageobject.enterNameValue();
		pageobject.clickSaveandContinue();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		pageobject.clickclickContinue();
	}
}
