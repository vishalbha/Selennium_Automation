package com.automation.common;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;

public class selectBrowsers {
	public WebDriver driver;

	
	
	
	public WebDriver selectWebdriver(String Browser) throws Exception{
		
		if(Browser.equalsIgnoreCase("FF")){
			FirefoxProfile profile= new FirefoxProfile();
			profile.setAcceptUntrustedCertificates(true);
			profile.setAssumeUntrustedCertificateIssuer(true);
			  driver= new FirefoxDriver(profile);
			}
		else if (Browser.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver","src/lib/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver", "src/lib/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}else{
			throw new Exception("UnSupportable Browser"); 
		}
		return driver;
	
	}
	
	public void loginUrl(){
	/*	FileInputStream fileInput = null;
		
		File file = new File("src/lib/data.Properties");
		try {
			 fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		readPropertyfile readproperty = new readPropertyfile();
		driver.get(readproperty.addKeyValue("Url"));
	}
	
	
	
	
	
	@AfterSuite
	  public void afterSuite() {
	 //driver.quit();driver.close();
	  }
}

