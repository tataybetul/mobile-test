package com.turktelekom.mobiletest.start.page.android;

import org.openqa.selenium.support.ui.ExpectedConditions;

import com.turktelekom.mobiletest.BasePageAndroid;
import com.turktelekom.mobiletest.start.page.StartPage;
import com.turktelekom.mobiletest.start.page.constant.StartPageAndroidXpath;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;

public class StartPageAndroid extends BasePageAndroid implements StartPage{
	
	public StartPageAndroid(MobileDriver<MobileElement> driver) {
		super(driver);
	}
	
	@Override
	public void clickMobilButton() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(StartPageAndroidXpath.MOBILE_LOGIN_BUTTON)).click();		
	}

	@Override
	public void clickInternetButton() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(StartPageAndroidXpath.INTERNET_LOGIN_BUTTON)).click();
	}

	@Override
	public void clickHomePhoneButton() {
		// TODO Auto-generated method stub
		
	}
}
