package com.spicejet.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.spicejet.utils.Sewrappers;

public class SJ2_Validate_SignupPage extends Sewrappers{

	@FindBy(xpath="//div[text()='Signup']")
	public WebElement signup;

	@FindBy(xpath="//select[contains(@class,'form-control form-select ')]")
	public WebElement Title;

	@FindBy(xpath="(//span[text()='T&Cs']/following::input)[1]")
	public WebElement FirstandmiddleName;

	@FindBy(id="last_name")
	public WebElement LastName;

	@FindBy(id="dobDate")
	public WebElement DateOfBirth;

	@FindBy(xpath="//select[@class='react-datepicker__year-select']")
	public WebElement Year;

	@FindBy(xpath="//select[@class='react-datepicker__month-select']")
	public WebElement month;

	@FindBy(xpath="//div[contains(text(),'28')]")
	public WebElement date;

	@FindBy(className="react-datepicker__month-container")
	public WebElement datepicker;

	@FindBy(xpath="//input[@class=' form-control']")
	public WebElement MobileNumber;

	@FindBy(id="email_id")
	public WebElement emailid;

	@FindBy(id="new-password")
	public WebElement password;

	@FindBy(id="c-password")
	public WebElement confrimpassword;

	@FindBy(id="defaultCheck1")
	public WebElement Termsandconditions;

	@FindBy(id="confirmationMessage")
	public WebElement confirmationMessage;

	public void signup_method() {
		waitForElement(signup, 20);
		actionsClick(signup);
		windowHandlingswitchToNewWindow();

		waitForElement(Title, 20);
		selectByindex(Title, 1);

		waitForElement(FirstandmiddleName, 20);
		typeText(FirstandmiddleName,"john");

		waitForElement(LastName, 20);
		typeText(LastName,"petter");

		waitForElement(emailid, 20);
		typeText(emailid,"johnpetter@gmail.com");

		waitForElement(password, 20);
		typeText(password,"Johnjohn@123");

		waitForElement(confrimpassword, 20);
		typeText(confrimpassword,"Johnjohn@123");

		waitForElement(MobileNumber, 20);
		typeText(MobileNumber,"9876543210");

		waitForElement(DateOfBirth, 20);
		actionsClick(DateOfBirth);
		selectByValue(month, "1");
		selectByVisibleText(Year, "1998");
		actionsClick(date);

		waitForElement(Termsandconditions, 20);
		actionsClick(Termsandconditions);
	}

	//Validating signup functionality 
	public void validate_signup_Functionality() {

		if (confirmationMessage.isDisplayed()) {
			System.out.println("Sign-up successful! Confirmation message: " + confirmationMessage.getText());
		} 
		else {
			System.out.println("Sign-up failed!");
		}
	}
}
