package com.turktelekom.mobiletest.mobile.page.android;

import com.turktelekom.mobiletest.BasePageAndroid;
import com.turktelekom.mobiletest.mobile.constant.MobileLoginPageAndroidXpath;
import com.turktelekom.mobiletest.mobile.page.MobileLoginPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;

public class MobileLoginPageAndroid extends BasePageAndroid implements MobileLoginPage {
	
	public MobileLoginPageAndroid(MobileDriver<MobileElement> driver) {
		super(driver);
	}

	@Override
	public void login(String phoneNumber, String password) throws InterruptedException {
		WebElement phoneNumberText = driver.findElement(MobileLoginPageAndroidXpath.PHONE_NUMBER_TEXT);
		wait.until(ExpectedConditions.elementToBeClickable(phoneNumberText)).click();
		phoneNumberText.sendKeys(phoneNumber);
		Thread.sleep(3000);
		
		WebElement passwordText = driver.findElement(MobileLoginPageAndroidXpath.PASSWORD_TEXT);
		wait.until(ExpectedConditions.elementToBeClickable(passwordText)).click();
		passwordText.sendKeys(password);
		Thread.sleep(3000);
		
		WebElement loginButton = driver.findElement(MobileLoginPageAndroidXpath.LOGIN_BUTTON);
		wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
	}
	

	
}
