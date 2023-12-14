package com.spicejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.spicejet.utils.Sewrappers;

public class SJ6_Select_Flight_To_BookingPage extends Sewrappers{

	@FindBy(xpath="//div[@data-testid='spicemax-flight-select-radio-button-2']//div[1]")
	public WebElement select_Flight;
	
	@FindBy(xpath="//*[@id='main-container']/div/div[1]/div[5]/div/div/div[2]/div[2]")
	public WebElement Continue;
	
	//Select fligt & And continue to the payment
	public void select_flight() {
		
		waitForElement(select_Flight,20);
		clickElement(select_Flight);
		
		waitForElementToBeClickable(Continue, 20);
		clickElement(Continue);
	}
}
