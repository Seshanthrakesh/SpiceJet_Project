package com.spicejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.spicejet.utils.Sewrappers;

public class SJP12_Validate_Manage_Booking extends Sewrappers {
	@FindBy(xpath = "//input[@placeholder='e.g. W3X3H8']")
	public WebElement PNR_Number;
	
	@FindBy(xpath = "//input[@placeholder='john.doe@spicejet.com']")
	public WebElement Emailid;
	
	@FindBy(xpath = "//div[text()='Search Booking']")
	public WebElement SearchBooking_button;
	
	public void Manage_Booking(String mpnr,String memailid) {
		waitForElement(PNR_Number, 20);
		typeText(PNR_Number, mpnr);
		
		waitForElement(Emailid,20);
		typeText(Emailid, memailid);
		
		waitForElementToBeClickable(SearchBooking_button, 20);
		clickElement(SearchBooking_button);
	}
}
