package com.turktelekom.mobiletest;

import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;

public class BasePage{

	protected MobileDriver<MobileElement> driver;
	protected WebDriverWait wait;

	public BasePage(MobileDriver<MobileElement> driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 10);
	}
}
