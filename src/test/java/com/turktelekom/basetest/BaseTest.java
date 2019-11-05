package com.turktelekom.basetest;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BaseTest{

	protected MobileDriver<MobileElement> driver;
	protected WebDriverWait wait;

	@BeforeTest
	public void setUp() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "TestDevice-1");
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.0");
		cap.setCapability("autoGrantPermissions", "true");
		cap.setCapability("appPackage", "com.tmob.AveaOIM");
		cap.setCapability("appActivity", "com.avea.oim.SplashActivity");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
