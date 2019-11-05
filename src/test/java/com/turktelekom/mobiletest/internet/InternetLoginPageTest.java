package com.turktelekom.mobiletest.internet;

import org.testng.annotations.Test;
import com.turktelekom.basetest.BaseTest;
import com.turktelekom.mobiletest.internet.page.android.InternetLoginPageAndroid;
import com.turktelekom.mobiletest.start.page.android.StartPageAndroid;

public class InternetLoginPageTest extends BaseTest {
	
	private final String PHONE_NUMBER = "";
	private final String PASSWORD  = "";
	
	/*@Test
	public void clickInternetButton() throws InterruptedException {
		StartPageAndroid startPage = new StartPageAndroid(driver);
		startPage.clickInternetButton();
	}
	
	*/
	@Test
	public void login() throws InterruptedException {
		
		StartPageAndroid startPage = new StartPageAndroid(driver);
		startPage.clickInternetButton();
		Thread.sleep(5000);
		
		InternetLoginPageAndroid internetLoginPage = new InternetLoginPageAndroid(driver);
		internetLoginPage.login(PHONE_NUMBER, PASSWORD);
		Thread.sleep(5000);
			
	}
	

}
