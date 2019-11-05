package com.turktelekom.mobiletest.internet.page.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.turktelekom.mobiletest.BasePageAndroid;
import com.turktelekom.mobiletest.internet.constant.InternetHomePageAndroidXpath;
import com.turktelekom.mobiletest.internet.page.InternetHomePage;
import com.turktelekom.mobiletest.mobile.constant.MyUsePageXpath;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;

public class InternetHomePageAndroid extends BasePageAndroid implements InternetHomePage{

	public InternetHomePageAndroid(MobileDriver<MobileElement> driver) {
		super(driver);
	}

	@Override
	public void closeImagePasswordPopUp() throws InterruptedException {
		WebElement noAnswer = driver.findElement(InternetHomePageAndroidXpath.NO_IMAGE_PASSWORD_POP_UP);
		wait.until(ExpectedConditions.elementToBeClickable(noAnswer)).click();
		Thread.sleep(3000);
	}

	@Override
	public void viewCurrentCost() throws InterruptedException {
		
	
		String currentCostResult = wait.until(ExpectedConditions.visibilityOfElementLocated(InternetHomePageAndroidXpath.CURRENT_COST_RESULT)).getText();
		System.out.println(currentCostResult);
		
	}
	
	
	

}
