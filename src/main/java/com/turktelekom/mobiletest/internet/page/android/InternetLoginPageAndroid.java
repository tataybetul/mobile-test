package com.turktelekom.mobiletest.internet.page.android;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.turktelekom.mobiletest.BasePageAndroid;
import com.turktelekom.mobiletest.internet.constant.InternetLoginPageAndroidXpath;
import com.turktelekom.mobiletest.internet.page.InternetLoginPage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;

public class InternetLoginPageAndroid extends BasePageAndroid implements InternetLoginPage {

	public InternetLoginPageAndroid(MobileDriver<MobileElement> driver) {
		super(driver);
	}

	@Override
	public void login(String phoneNumber, String password) throws InterruptedException {
	
		WebElement phoneNumberText = driver.findElement(InternetLoginPageAndroidXpath.PHONE_NUMBER_TEXT);
		wait.until(ExpectedConditions.elementToBeClickable(phoneNumberText)).click();
		Thread.sleep(3000);
		phoneNumberText.sendKeys(phoneNumber);
		Thread.sleep(2000);
		
		WebElement nextButton = driver.findElement(InternetLoginPageAndroidXpath.NEXT_BUTTON);
		wait.until(ExpectedConditions.elementToBeClickable(nextButton)).click();
		Thread.sleep(2000);
		
		
		WebElement passwordText = driver.findElement(InternetLoginPageAndroidXpath.PASSWORD_TEXT);
		passwordText.click();
        Thread.sleep(2000);
        passwordText.sendKeys(password);
		//if(!retryingFindClickAndSendKeys(passwordText,password)){
			//throw new RuntimeException();
		//}
	
		WebElement loginButton = driver.findElement(InternetLoginPageAndroidXpath.LOGIN_BUTTON);
		wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
	}
	
	public boolean retryingFindClickAndSendKeys(WebElement element, String keys) throws InterruptedException {
	    boolean result = false;
	    int attempts = 0;
	    while(attempts < 2) {
	        try {
	            element.click();
	            Thread.sleep(1000);
	            element.sendKeys(keys);
	            result = true;
	            break;
	        } catch(StaleElementReferenceException e) {
	        	System.out.println(e.getMessage());
	        }
	        attempts++;
	    }
	    return result;
	}

}
