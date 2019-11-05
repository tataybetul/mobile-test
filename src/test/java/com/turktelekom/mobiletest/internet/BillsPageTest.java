package com.turktelekom.mobiletest.internet;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.turktelekom.basetest.BaseTest;
import com.turktelekom.mobiletest.internet.page.android.BillsPageAndroid;
import com.turktelekom.mobiletest.internet.page.android.InternetHomePageAndroid;
import com.turktelekom.mobiletest.internet.page.android.InternetLoginPageAndroid;
import com.turktelekom.mobiletest.start.page.android.StartPageAndroid;

public class BillsPageTest extends BaseTest {
	
	private final String PHONE_NUMBER = "";
	private final String PASSWORD  = "";
	
	@Test
	public void viewBill() throws InterruptedException {
		
		StartPageAndroid startPage = new StartPageAndroid(driver);
		startPage.clickInternetButton();
		Thread.sleep(3000);
		
		InternetLoginPageAndroid internetLoginPage = new InternetLoginPageAndroid(driver);
		internetLoginPage.login(PHONE_NUMBER, PASSWORD);
		Thread.sleep(3000);

		InternetHomePageAndroid homePage = new InternetHomePageAndroid(driver);
		homePage.closeImagePasswordPopUp();
		Thread.sleep(5000);
		
		BillsPageAndroid billsPage = new BillsPageAndroid(driver);
		billsPage.clickBillsButton();
		
		
		//billsPage.clickBillPayButton();
		
		//billsPage.viewBill();
		
	}
}
