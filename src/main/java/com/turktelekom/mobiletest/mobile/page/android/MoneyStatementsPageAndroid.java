package com.turktelekom.mobiletest.mobile.page.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.turktelekom.mobiletest.BasePageAndroid;
import com.turktelekom.mobiletest.mobile.constant.MoneyStatementsPageXpath;
import com.turktelekom.mobiletest.mobile.page.MoneyStatementsPage;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;

public class MoneyStatementsPageAndroid extends BasePageAndroid implements MoneyStatementsPage {

	public MoneyStatementsPageAndroid(MobileDriver<MobileElement> driver) {
		super(driver);
	}

	@Override
	public void clickMoneyStatements() {
		WebElement clickStatements = driver.findElement(MoneyStatementsPageXpath.CLICK_MONEY_STATEMENTS);
		wait.until(ExpectedConditions.elementToBeClickable(clickStatements)).click();
	}

	@Override
	public void viewAvailablaBalance() {
		System.out.println("Available Balance: "+driver.findElement(MoneyStatementsPageXpath.AVAILABLE_BALANCE).getText());
	}
	

	
}
