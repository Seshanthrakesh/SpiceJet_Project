package com.spicejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SJ9_Verify_Booking {
	@FindBy(xpath = "//div[@id='confirmation-message']")
	public WebElement confirmationMessage;
	
	//verifies the confrim message for booking the ticket
	public void verifybooking() {
		if (confirmationMessage.isDisplayed() && confirmationMessage.getText().contains("Booking Successful")) {
			System.out.println("Booking was successful. Confirmation message found.");
		} else {
			System.out.println("Booking was not successful. Confirmation message not found or does not match expected text.");
		}
	}



}
