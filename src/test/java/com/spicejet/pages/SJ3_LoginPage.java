package com.spicejet.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.spicejet.utils.Sewrappers;

public class SJ3_LoginPage extends Sewrappers{

	@FindBy(xpath="//div[text()='Login']")
	public WebElement login;

	@FindBy(xpath="//div[text()='Email']")
	public WebElement emailcheckbox;

	@FindBy(xpath="//div[text()='Mobile Number']")
	public WebElement mobilenumbercheckbox;

	@FindBy(xpath="//input[@type='number']")
	public WebElement MobileNumber;

	@FindBy(xpath="//input[@type='email']")
	public WebElement emailid;

	@FindBy(xpath="//input[@type='password']")
	public WebElement password;

	@FindBy(xpath="//div[@data-testid='login-cta']")
	public WebElement Login_button;

	@FindBy(id="confirmationMessage")
	public WebElement confirmationMessage;

	public void do_login() {
		waitForElement(login,20);
		clickElement(login);
	}
	public void select_emailcheckbox() {
		waitForElement(mobilenumbercheckbox,20);
		actionsClick(mobilenumbercheckbox);

	}
	public void select_mobilenumbercheckbox() {
		waitForElement(emailcheckbox,20);
		actionsClick(emailcheckbox);

	}
	public void Type_mobilenumbercheckbox(String mobilenumber) {
		waitForElement(MobileNumber,20);
		typeText(MobileNumber, mobilenumber);

	}
	public void Type_emailid(String emailId) {
		waitForElement(emailid, 20);
		typeText(emailid, emailId);
	}
	public void Type_password(String pswd) {
		waitForElement(password,20);
		typeText(password, pswd);
	}
	public void clicklogin_button() {
		waitForElement(Login_button,20);
		clickElement(Login_button);
	}

	//validating the login functionality 
	public void validate_login_Functionality() {
		if (confirmationMessage.isDisplayed()) {
			System.out.println("Login successful! Confirmation message: " + confirmationMessage.getText());
		} 
		else {
			System.out.println("Login failed!");
		}
	}
}


