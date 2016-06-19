package com.automation.common;

import org.testng.annotations.DataProvider;

public class getDataProviderClass {

	@DataProvider(name = "Authentication")
	public static Object[][] credentials(){
		return new Object[][] {{"ervishal.bhatt59@gmail.com","abc123545"},{"ervishal.bhatt59@gmail.com","abc1235"}} ;
		
	}

}
