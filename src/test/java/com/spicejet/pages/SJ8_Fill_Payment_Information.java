package com.spicejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.spicejet.utils.Sewrappers;

public class SJ8_Fill_Payment_Information extends Sewrappers {

	@FindBy(xpath = "(//div[text()='Continue'])[3]")
	public WebElement Continue;

	@FindBy(xpath = "//input[@type='tel']")
	public WebElement CardNumber;
	@FindBy(xpath = "//input[@placeholder='Cardholder Name']")
	public WebElement CardholderName;
	@FindBy(xpath = "//input[@placeholder='MM']")
	public WebElement ExpiryMonth;
	@FindBy(xpath = "//input[@placeholder='YY']")
	public WebElement ExpiryYear;
	@FindBy(xpath = "//input[@placeholder='123']")
	public WebElement CVV;
	@FindBy(xpath="//div[text()='Proceed to pay']")
	public WebElement pay;

	public void ToskipAddons() {
		waitForElementToBeClickable(Continue, 20);
		actionsClick(Continue);
	}
	public void Entering_Payment_Details(String cnum,String cardholder,String emonth,String eyear,String cvv ) {
		waitForElement(CardNumber,20);
		typeText(CardNumber, cnum);
		waitForElement(CardholderName,20);
		typeText(CardholderName, cardholder);
		waitForElement(ExpiryMonth,20);
		typeText(ExpiryMonth, emonth);
		waitForElement(ExpiryYear,20);
		typeText(ExpiryYear, eyear);
		waitForElement(CVV,20);
		typeText(CVV, cvv);
		waitForElementToBeClickable(pay, 20);
		actionsClick(pay);
	}
}
