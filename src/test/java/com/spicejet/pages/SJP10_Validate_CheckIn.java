package com.spicejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.spicejet.utils.Sewrappers;

public class SJP10_Validate_CheckIn extends Sewrappers{

	@FindBy(xpath = "//input[@placeholder='e.g. W3X3H8']")
	public WebElement CheckIn_Tab;
	
	@FindBy(xpath = "//input[@placeholder='e.g. W3X3H8']")
	public WebElement PNR_Number;
	
	@FindBy(xpath = "//input[@placeholder='john.doe@spicejet.com']")
	public WebElement Emailid;
	
	@FindBy(xpath = "//div[text()='Search Booking']")
	public WebElement SearchBooking_button;
	
	public void CheckIn(String pnr,String emailid) {
		waitForElement(CheckIn_Tab, 20);
		clickElement(CheckIn_Tab);
		
		waitForElement(PNR_Number, 20);
		typeText(PNR_Number, pnr);
		
		waitForElement(Emailid,20);
		typeText(Emailid, emailid);
		
		waitForElementToBeClickable(SearchBooking_button, 20);
		clickElement(SearchBooking_button);
	}
	
}
