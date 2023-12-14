package com.spicejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.spicejet.utils.Sewrappers;

public class SJP11_Validate_Flight_Status extends Sewrappers {

	@FindBy(xpath = "//div[@data-testid='flight status-horizontal-nav-tabs']")
	public WebElement flightStatus;
	
	@FindBy(xpath = "//div[text()='Departure Date']/following-sibling::div")
	public WebElement DepatureDate;
	
	@FindBy(xpath = "//div[text()='From']")
	public WebElement From;
	
	@FindBy(xpath = "//div[text()='To']")
	public WebElement To;
	
	@FindBy(xpath = "//div[text()='Flight No.(optional)']")
	public WebElement flightNumber;
	
	@FindBy(xpath = "//div[text()='Search Flights']")
	public WebElement Search_flight_Button;
	
	public void validating_flight_status(String date,String from,String to,String fno) {
		waitForElement(flightStatus, 20);
		clickElement(flightStatus);
		
		waitForElement(DepatureDate, 20);
		typeText(DepatureDate, date);
		
		waitForElement(From, 20);
		typeText(From, from);
		
		waitForElement(To, 20);
		typeText(To, to);
		
		waitForElement(flightNumber, 20);
		typeText(flightNumber, fno);
		
		waitForElementToBeClickable(Search_flight_Button, 0);
		clickElement(Search_flight_Button);
		
	}
	
}
