package com.turktelekom.mobiletest.mobile.page.android;

import org.openqa.selenium.support.ui.ExpectedConditions;
import com.turktelekom.mobiletest.BasePageAndroid;
import com.turktelekom.mobiletest.mobile.constant.MyUsePageXpath;
import com.turktelekom.mobiletest.mobile.page.MyUsePage;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;

public class MyUsePageAndroid extends BasePageAndroid implements MyUsePage {

	public MyUsePageAndroid(MobileDriver<MobileElement> driver) {
		super(driver);
	}
	
	@Override
	public void viewDK() {
		String remainingDK = wait.until(ExpectedConditions.visibilityOfElementLocated(MyUsePageXpath.REMAINING_DK_TEXT)).getText();
		String viewgDK = wait.until(ExpectedConditions.visibilityOfElementLocated(MyUsePageXpath.VÝEW_DK_TEXT)).getText();
		
		System.out.println(remainingDK+ ": " +viewgDK);
	}

	@Override
	public void viewGB() {
		String remainingGB = wait.until(ExpectedConditions.visibilityOfElementLocated(MyUsePageXpath.REMAINING_GB_TEXT)).getText();
		String viewgGB = wait.until(ExpectedConditions.visibilityOfElementLocated(MyUsePageXpath.VÝEW_GB_TEXT)).getText();
		
		System.out.println(remainingGB+ ": " +viewgGB);
	}

	@Override
	public void viewSMS() {
		String remainingSMS = wait.until(ExpectedConditions.visibilityOfElementLocated(MyUsePageXpath.REMAINING_SMS_TEXT)).getText();
		String viewgSMS = wait.until(ExpectedConditions.visibilityOfElementLocated(MyUsePageXpath.VÝEW_SMS_TEXT)).getText();
		
		System.out.println(remainingSMS+ ": " +viewgSMS);
	}

	

}
