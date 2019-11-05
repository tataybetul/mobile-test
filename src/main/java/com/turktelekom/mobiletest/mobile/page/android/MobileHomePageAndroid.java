package com.turktelekom.mobiletest.mobile.page.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.turktelekom.mobiletest.BasePageAndroid;
import com.turktelekom.mobiletest.mobile.constant.MobileHomePageXpath;
import com.turktelekom.mobiletest.mobile.page.MobileHomePage;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;

public class MobileHomePageAndroid extends BasePageAndroid implements MobileHomePage {

	public MobileHomePageAndroid(MobileDriver<MobileElement> driver) {
		super(driver);
	}

	@Override
	public void noPopUpSecurityImage() {
		WebElement dontCareButton = driver.findElement(MobileHomePageXpath.POP_UP_SECURITY_IMAGE);
		wait.until(ExpectedConditions.elementToBeClickable(dontCareButton)).click();
	}

	@Override
	public void popUpFingerPrint() {
		WebElement noAnswerButton = driver.findElement(MobileHomePageXpath.POP_UP_FINGER_PRINT);
		wait.until(ExpectedConditions.elementToBeClickable(noAnswerButton)).click();
	}

	@Override
	public void popUpUpdate() {
		WebElement okButton = driver.findElement(MobileHomePageXpath.POP_UP_UPDATE);
		wait.until(ExpectedConditions.elementToBeClickable(okButton)).click();
	}

	@Override
	public void popUpExplore() {
		WebElement exploreButton = driver.findElement(MobileHomePageXpath.POP_UP_EXPLORE);
		wait.until(ExpectedConditions.elementToBeClickable(exploreButton)).click();
	}

	@Override
	public void clickPersonalized() {
		WebElement personalized = driver.findElement(MobileHomePageXpath.PERSONALIZED);
		wait.until(ExpectedConditions.elementToBeClickable(personalized)).click();
	}

	@Override
	public void backHomeFromPersonalizedPage() {
		driver.navigate().back();
	}
	

}
