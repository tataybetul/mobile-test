package com.turktelekom.mobiletest.mobile;

import org.testng.annotations.Test;

import com.turktelekom.basetest.BaseTest;
import com.turktelekom.mobiletest.mobile.page.android.MobileHomePageAndroid;
import com.turktelekom.mobiletest.mobile.page.android.MobileLoginPageAndroid;
import com.turktelekom.mobiletest.mobile.page.android.MyUsePageAndroid;
import com.turktelekom.mobiletest.start.page.android.StartPageAndroid;

public class MyUsePageTest extends BaseTest {
	
	private final String PHONE_NUMBER = "";
	private final String PASSWORD = "";
	
	@Test
	public void view_my_use() throws InterruptedException {
	
		StartPageAndroid startPage = new StartPageAndroid(driver);
		startPage.clickMobilButton();
		Thread.sleep(3000);
		
		MobileLoginPageAndroid loginPage = new MobileLoginPageAndroid(driver);
		loginPage.login(PHONE_NUMBER,PASSWORD);
		Thread.sleep(5000);
		
		MobileHomePageAndroid homePage = new MobileHomePageAndroid(driver);
		//popUp.popUpSecurityImage();
		homePage.popUpFingerPrint();
		Thread.sleep(5000);
		
		homePage.popUpUpdate();
		Thread.sleep(5000);
		
		homePage.popUpExplore();
		Thread.sleep(5000);
		
		homePage.clickPersonalized();
		Thread.sleep(3000);
		
		homePage.backHomeFromPersonalizedPage();
		Thread.sleep(5000);
		
		MyUsePageAndroid myUsePage = new MyUsePageAndroid(driver);
		myUsePage.viewDK();
		Thread.sleep(5000);
		
		myUsePage.viewGB();
		Thread.sleep(5000);
	}

}
