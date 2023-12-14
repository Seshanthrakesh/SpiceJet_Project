package com.spicejet.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.spicejet.utils.Sewrappers;

public class SJ7_Fill_BookingForm extends Sewrappers{

	@FindBy(xpath="//div[text()='Mr']")
	public WebElement Mr;
	@FindBy(xpath="//div[text()='Mrs']")
	public WebElement Mrs;
	@FindBy(xpath="//div[text()='Miss']")
	public WebElement Miss;

	@FindBy(xpath="//*[@id='primary-contact-details']/div[3]/div[1]/div[2]/div/div[2]")
	public WebElement Title;


	@FindBy(xpath="(//input[@dir='auto'])[1]")
	public WebElement firstandMiddleName;
	@FindBy(xpath="(//input[@dir='auto'])[2]")
	public WebElement LastName;
	@FindBy(xpath="(//input[@dir='auto'])[3]")
	public WebElement contactNumber;
	@FindBy(xpath="//input[@data-testid='emailAddress-inputbox-contact-details']")
	public WebElement emailid;
	@FindBy(xpath="(//div[text()='India']/following-sibling::div)[1]")
	public WebElement Country;
	@FindBy(xpath="//input[@placeholder='Search']")
	public WebElement Search;
	@FindBy(xpath="//input[@data-testid='city-inputbox-contact-details']")
	public WebElement TownorCity;

	@FindBy(xpath="(//div[text()='Mr']/following-sibling::div)[1]")
	public WebElement pTitle;

	@FindBy(xpath="(//div[text()='Mr'])[2]")
	public WebElement pMr;
	@FindBy(xpath="(//div[contains(@class,'css-76zvg2 r-homxoj')])[3]")
	public WebElement pMrs;
	@FindBy(xpath="(//div[text()='Miss'])[2]")
	public WebElement pMiss;
	@FindBy(xpath="//input[@data-testid='traveller-0-first-traveller-info-input-box']")
	public WebElement pfirstandMiddleName;
	@FindBy(xpath="//input[@data-testid='traveller-0-last-traveller-info-input-box']")
	public WebElement pLastName;
	@FindBy(xpath="//input[@data-testid='sc-member-mobile-number-input-box']")
	public WebElement MobileNumber;
	@FindBy(xpath="(//input[@placeholder='DD/MM/YYYY'])[1]")
	public WebElement DateOfBirth;
	@FindBy(xpath="(//input[@placeholder='DD/MM/YYYY'])[2]")
	public WebElement ValidUpto;
	@FindBy(xpath="//div[text()='Passport Number*']/following::input[1]")
	public WebElement PassportNumber;

	//Filling contact details & name of the passengers
	public void contact_details(String title,String fmName,String LName,String contact,String Email,String search,String city) {
		waitForElement(Title,20);
		clickElement(Title); 
		clickElement(Miss);
		waitForElement(firstandMiddleName,20);
		typeText(firstandMiddleName, fmName);
		waitForElement(LastName,20);
		typeText(LastName, LName);
		waitForElement(contactNumber,20);
		typeText(contactNumber, contact);
		waitForElement(emailid,20);
		typeText(emailid, Email);
		waitForElement(Country,20);
		clickElement(Country);
		clickElement(Search);
		typeText(Search, search);
		List<WebElement> Optionslist=driver.findElements(By.xpath("//*[@id='primary-contact-details']/div[4]/div[2]/div[2]/div[2]/div[2]"));
		for(WebElement option:Optionslist){
			option.click();
		}
		clickElement(TownorCity);
		typeText(TownorCity, city); 

	}
	
	//Filling the passengers information for booking ticket
	public void passengers_information(String ptitle,String pfmName,String pLName,String mobileNum,String passNum,String validuptodate) {
		waitForElement(pTitle,20);
		clickElement(pTitle);
		clickElement(pMrs);
		waitForElement(pfirstandMiddleName,20);
		typeText(pfirstandMiddleName, pfmName);
		waitForElement(pLastName,20);
		typeText(pLastName, pLName);
		waitForElement(MobileNumber,20);
		typeText(MobileNumber, mobileNum);
		waitForElement(DateOfBirth,20);
		clickElement(DateOfBirth);
		List<WebElement> Yearslist=driver.findElements(By.xpath("//div[contains(@class,'css-1dbjc4n r-1loqt21 r-12zupyf r-1otgn73')]//div"));
		for(WebElement Year:Yearslist){
			if(Year.getText().equalsIgnoreCase("1998")) {
				waitForElement_Visibility(Year, 20);
				System.out.println(Year.getText());
				Year.click();
			}
		}
		List<WebElement> Monthslist=driver.findElements(By.xpath("//div[contains(@class,'css-1dbjc4n r-z2wwpe r-1aiy7tn r-4ueuch')]//div/div/div/div"));
		for(WebElement Months:Monthslist){
			System.out.println(Months.getText());
			if(Months.getText().equalsIgnoreCase("Feb")) {
				waitForElement_Visibility(Months,20);
				actionsClick(Months);
			}
		}
		List<WebElement> Datelist=driver.findElements(By.className("css-1dbjc4n r-14lw9ot r-ymp9ed r-1i8plt1 r-1rnoaur r-m611by r-4ueuch"));
		for(WebElement  Date :Datelist){
			if(Date.getText().equalsIgnoreCase("19"))
			{
				waitForElement_Visibility(Date,20);
				System.out.println(Date.getText());
				Date.click();
			}
		}

		waitForElement(PassportNumber,20);
		typeText(PassportNumber, passNum);
		
		waitForElementToBeClickable(ValidUpto, 20);
		typeText(ValidUpto, validuptodate);	
	}

}
