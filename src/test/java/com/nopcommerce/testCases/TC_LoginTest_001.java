package com.nopcommerce.testCases;


import java.io.IOException;

import org.testng.Assert;

import org.testng.annotations.Test;

import com.nopcommerce.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	
	
	
	@Test
	public void loginTest() throws InterruptedException, IOException {
		driver.get(baseURL);
		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);
		//lp.setUserName(username);
		//lp.setPassword(password);
		lp.clickLogin();
		logger.info("Login clicked");

		if (driver.getTitle().equals("Dashboard / nopCommerce administration")) {
			Thread.sleep(5000);
			lp.clickLogout();
			Assert.assertTrue(true);
			logger.info("Login is passed");
		} else {
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
		}
	}
	
	
	

}
