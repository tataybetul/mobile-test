package com.turktelekom.mobiletest.internet.page.android;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import com.turktelekom.mobiletest.BasePageAndroid;
import com.turktelekom.mobiletest.internet.constant.BillsPageAndroidXpath;
import com.turktelekom.mobiletest.internet.page.BillsPage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;

public class BillsPageAndroid extends BasePageAndroid implements BillsPage {

	public BillsPageAndroid(MobileDriver<MobileElement> driver) {
		super(driver);
	}

	@Override
	public void clickBillsButton() throws InterruptedException {
		
		WebElement clickButton= driver.findElement(BillsPageAndroidXpath.CLICK_BILL_BUTTON);
		wait.until(ExpectedConditions.elementToBeClickable(clickButton)).click();
		Thread.sleep(5000);
	}

	@Override
	public void clickBillPayButton() throws InterruptedException {
	
		WebElement clickPayBillButton= driver.findElement(BillsPageAndroidXpath.CLICK_PAYING_BILL_BUTTON);
		wait.until(ExpectedConditions.elementToBeClickable(clickPayBillButton)).click();
		Thread.sleep(5000);
		
	}

	/*@Override
	public void viewBill() throws InterruptedException {
		
		WebElement billText= driver.findElement(BillsPageAndroidXpath.BILL_VIEW);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By) billText));
		Thread.sleep(5000);
		Assert.assertEquals(billText.isDisplayed(), true);
	}
	
*/
	
	
}
