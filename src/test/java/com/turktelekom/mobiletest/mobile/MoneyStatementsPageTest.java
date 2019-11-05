package com.turktelekom.mobiletest.mobile;

import org.testng.annotations.Test;

import com.turktelekom.basetest.BaseTest;
import com.turktelekom.mobiletest.mobile.page.android.MobileHomePageAndroid;
import com.turktelekom.mobiletest.mobile.page.android.MobileLoginPageAndroid;
import com.turktelekom.mobiletest.mobile.page.android.MoneyStatementsPageAndroid;
import com.turktelekom.mobiletest.start.page.android.StartPageAndroid;

public class MoneyStatementsPageTest extends BaseTest{

	private final String PHONE_NUMBER = "";
	private final String PASSWORD = "";
	
	@Test
	public void view_available_balance() throws InterruptedException {
	
		StartPageAndroid startPage = new StartPageAndroid(driver);
		startPage.clickMobilButton();
		Thread.sleep(3000);
		
		MobileLoginPageAndroid loginPage = new MobileLoginPageAndroid(driver);
		loginPage.login(PHONE_NUMBER,PASSWORD);
		Thread.sleep(5000);
		
		MobileHomePageAndroid homePage = new MobileHomePageAndroid(driver);
		//popUp.popUpSecurityImage();
		homePage.popUpFingerPrint();
		Thread.sleep(5000);
		homePage.popUpUpdate();
		Thread.sleep(5000);
		homePage.popUpExplore();
		Thread.sleep(5000);
		homePage.clickPersonalized();
		Thread.sleep(3000);
		homePage.backHomeFromPersonalizedPage();
		Thread.sleep(5000);
		
		MoneyStatementsPageAndroid  moneyStatementsPage = new MoneyStatementsPageAndroid(driver);
		moneyStatementsPage.clickMoneyStatements();
		Thread.sleep(5000);
		moneyStatementsPage.viewAvailablaBalance();
		Thread.sleep(5000);
	}
}
