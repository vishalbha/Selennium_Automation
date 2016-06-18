package com.automation.base;


import java.util.concurrent.TimeUnit;

import org.bouncycastle.crypto.modes.PGPCFBBlockCipher;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
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
		pageobject.clickLoginLink();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		pageobject.enterUsername();
		pageobject.enterPassword();
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
		driver.findElement(By.cssSelector(".pointer.fk-inline-block[value='sort=price_asc']")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id='products']/div/div[7]/div[1]/div/div[1]/a[1]")).click();
		
		
	}
}
