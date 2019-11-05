package com.turktelekom.mobiletest.mobile;

import org.testng.annotations.Test;

import com.turktelekom.basetest.BaseTest;
import com.turktelekom.mobiletest.mobile.page.android.MobileLoginPageAndroid;
import com.turktelekom.mobiletest.start.page.android.StartPageAndroid;

public class MobileLoginAndroidTest extends BaseTest {
	
	private final String PHONE_NUMBER = "";
	private final String PASSWORD = "";
	
	/*@Test
	public void clickMobilButton() throws InterruptedException {
		StartPageAndroid startPage = new StartPageAndroid(driver);
		startPage.clickMobilButton();
		Thread.sleep(3000);
	}*/
	
	
	@Test
	public void login() throws InterruptedException {
		StartPageAndroid startPage = new StartPageAndroid(driver);
		startPage.clickMobilButton();
		Thread.sleep(3000);
		
		MobileLoginPageAndroid mobilLoginPageAndroid = new MobileLoginPageAndroid(driver);
		mobilLoginPageAndroid.login(PHONE_NUMBER, PASSWORD);
		Thread.sleep(3000);
		
	}
	
	

}
