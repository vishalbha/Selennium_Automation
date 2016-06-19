package com.automation.pageobject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.common.readPropertyfile;

public class uiDemoPOClass {
	readPropertyfile prop = new readPropertyfile();
	WebDriver driver;
	
	public uiDemoPOClass(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this); 
	}
	
	@FindBy(linkText="Log In")
	private WebElement loginLink;
	
	@FindBy(css = ".fk-input.login-form-input.user-email")
	private WebElement username;
	
	@FindBy(css = ".fk-input.login-form-input.user-pwd")
	private WebElement password;
	
	@FindBy(css = ".submit-btn.login-btn.btn")
	private WebElement loginButton;
	
	@FindBy(css = ".fk-inline-block.err_text")
	private WebElement errorText;
	
	//..............................................
	@FindBy(linkText = "Signup")
	private WebElement signUpLink;
	
	@FindBy(linkText = "SIGNUP")
	private WebElement SIGNUPinInternalPage;
	
	@FindBy (css = ".fk-input.signup-form-input.user-email.num-ten")
	private WebElement mobileNumber;
	
	//@FindBy(css = ".submit-btn.continue-signup.btn")
	@FindBy(css = "input[value='CONTINUE']")
	
	private WebElement signUpContinue;
	
	@FindBy(css = ".fk-hidden.signup_error.help_msg>.fk-inline-block.err_text")
	private WebElement InvalidMobileNumber;
	
	@FindBy(xpath = "html/body/div[12]/div[2]/span")
	private WebElement clickCloseIcon1;
	//...............................................
	
	@FindBy(id="first_name")
	private WebElement firstName;
	
	@FindBy(id= "last_name")
	private WebElement lastName;
	
	@FindBy(id="per-info-suc")
	private WebElement profileUpdateMessage;
	//..............................................................
	@FindBy(id="fk-top-search-box")
	private WebElement searchItem;
	
	@FindBy(css =".search-bar-submit.fk-font-13.fk-font-bold")
	private WebElement searchButton;
	//..............................................................
	
	public void clickLoginLink(){
		 loginLink.click();
	}
	
	public void enterUsername(){
		System.out.println(prop.addKeyValue("Username"));
		username.sendKeys(prop.addKeyValue("Username"));
	}
	 public void enterPassword(){
		 System.out.println(prop.addKeyValue("Password"));
		 password.sendKeys(prop.addKeyValue("Password"));
	 }
	 
	 public void enterUsernameDP(String sUsername){
			username.sendKeys(sUsername);
		}
		 public void enterPasswordDP(String sPassword){
			  password.sendKeys(sPassword);
		 }
	 public void clickLoginButton(){
		 loginButton.click();
	}
	 public String readErrorMessage(){
		 System.out.println(errorText.getText());
		return errorText.getText();
	 }
	 
	 
	 //................................................
	 public void clickSignUpLink(){
		 signUpLink.click();
	 }
	 
	 public void clickSIGNUPinInternalPage(){
		 SIGNUPinInternalPage.click();
	 }
	 public void enterMobileNumber(){
		 mobileNumber.sendKeys(prop.addKeyValue("Mobile"));
	 }
	 public void clickSignUpContinueBtn(){
		 signUpContinue.click();
	 }
	 public String readinvalidNumberError(){
		 System.out.println(InvalidMobileNumber.getText());
		 return InvalidMobileNumber.getText();
	 }
	 public void clickCloseIcon(){
		 clickCloseIcon1.click();
	 }
	 //................................................
	 
	 public void validEnterUsername(){
		 username.sendKeys(prop.addKeyValue("validMobile"));
	 }
	 
	 public void validEnterPassword(){
		 password.sendKeys(prop.addKeyValue("validPassword"));
	 }
	 
	 //..Getattribute used when we need to read value of text-box and in style defined
	 //value="find value like vishal"
	 public String readFirstName(){
		 System.out.println(firstName.getAttribute("value"));
		 return firstName.getAttribute("value");
	 }
	 public String readLastName(){
		 System.out.println(lastName.getAttribute("value"));
		 return lastName.getAttribute("value");
	 }
	 
	 public String readProfileupdatemsg(){
		 System.out.println(profileUpdateMessage.getText());
		 return profileUpdateMessage.getText();
	 }
	 //.....................................................
	public void enterSearchItem(){
		searchItem.sendKeys(prop.addKeyValue("Watch"));
	}
	public void clickSearchButton(){
		searchButton.click();
	}
	@FindBy(css = ".pointer.fk-inline-block[value='sort=price_asc']")
	private WebElement lowerPrice;
	
	public void clickLowerPrice(){
		lowerPrice.click();
	}
	
	@FindBy(xpath = "//div[@id='products']/div/div[9]/div[3]/div/div[1]/a")
	private WebElement selectItem;
	
	public void selectItem(){
		selectItem.click();
	}
	@FindBy(xpath = "//input[@value='Add to Cart']")
	private WebElement selectyourItem;
	
	public void clickOnAddToCart(){
		selectyourItem.click();
	}
	@FindBy(xpath="//div[@class = 'cart-btn-cont']/a")
	private WebElement clickonCart;
	
	public void clickOnCartButton(){
		clickonCart.click();
	}
	
	@FindBy(css="a.cart-wishlist-add.fk-inline-block.fk-uppercase")
	private WebElement clickonWishlist;
	
	public void clickonWishlistlink(){
		clickonWishlist.click();
	}
	@FindBy(xpath = "//input[@value='Buy Now']")
	private WebElement buyNowbtn;
	
	public void clickBuyNowBtn(){
		buyNowbtn.click();
	}
	
	
	@FindBy(id = "name")
	private WebElement enterName;
	
	public void clearNameValue(){
		enterName.clear();
		
	}
	public void enterNameValue(){
		enterName.sendKeys("Vishal Bhatt");
	}
	@FindBy (xpath = "//input[@value='Save & Continue']")
	private WebElement clickSaveandContinue;
	
	public void clickSaveandContinue(){
		clickSaveandContinue.click();
	}
	
	@FindBy (xpath = "//div[1]/a[contains(@alt, 'Continue')]")
	private WebElement clickContinue;
	
	public void clickclickContinue(){
		clickContinue.click();
	}
	@FindBy(xpath = "//div[1]/div[@class='address-icons']/a[@tooltip='Delete']")
	private WebElement deleteOption;
	
	public void clickDeleteOption(){
		deleteOption.click();
	}
			
	@FindBy(xpath = "//div[1]/div[@class='address-icons']/a[@tooltip='Edit']")
	private WebElement editOption;
	
	public void clickEditOption(){
		editOption.click();
	}


}






