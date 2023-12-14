package com.spicejet.tests;
import org.testng.annotations.Test;
import com.spicejet.utils.Reports;
import com.spicejet.utils.Sewrappers;
import com.spicejet.utils.SpiceJetWrappers;

public class TestSpiceJet extends Sewrappers {
	SpiceJetWrappers sj=new SpiceJetWrappers();
	Reports report = new Reports();
	@Test(priority = 1,alwaysRun = true)
	public void launchbrowser_Navigate_to_url() {
		try {
			report.setTCDesc("Launching Chrome With Url-https:https://www.spicejet.com/");
			launchChromeBrowser("https://www.spicejet.com/");
			//launchChromeBrowser("https://www.spicejet.com/search?from=MAA&to=DXB&tripType=1&departure=2023-12-15&adult=1&child=0&srCitizen=0&infant=0&currency=INR&redirectTo=/");
			Reports.reportstep("PASS", "Launched Chrome Browser With Url-https://www.spicejet.com/ Successfully");
		} catch (Exception e) {
			Reports.reportstep("FAIL", "Launching Chrome Browser Failed ");
		}		
	}

	@Test(priority = 2,alwaysRun = true)
	public void signup_TestCase() {
		try {
			report.setTCDesc("TC02-Signup Functionality With- New Account");
			sj.signup();
			Reports.reportstep("PASS", "SignUp Functionality-New Account Created Successfully");
		} catch (Exception e) {
			Reports.reportstep("FAIL", "SignUp Functionality Failed");
		}
	}


	@Test(priority = 3,alwaysRun = true)
	public void signin_TestCase() {
		try {
			report.setTCDesc("TC03-SignIn Functionality With- Correct UserName and Password");
			sj.login("9876543210", "johnjohn");
			Reports.reportstep("INFO", "Enter Email Id Successfully");
			Reports.reportstep("INFO", "Enter Password Successfully");
			Reports.reportstep("PASS", "Login Functionality Successfully");
		} catch (Exception e) {
			Reports.reportstep("FAIL", "LognIn Functionality Failed");
		}
	}
	@Test(priority = 4,alwaysRun = true)
	public void Search_Flight_OneWay_TestCase() {
		try {
			report.setTCDesc("TC04-Search Flight for Oneway with Dummy Origin and Destination");
			sj.search_Flight_for_OneWay_Travel("Chen","Mumb");
			Reports.reportstep("PASS", "Search for OneWay flight Successfully");
		} catch (Exception e) {
			Reports.reportstep("FAIL", "Search for OneWay flight Failed");
		}
	}
	@Test(priority = 5,alwaysRun = true)
	public void Search_Flight_RoundTrip_TestCase() {
		try {
			report.setTCDesc("TC04-Search Flight for RoundTrip with Dummy Origin and Destination");
			sj.search_Flight_for_RoundTrip_Travel("Chen","Mumb");
			Reports.reportstep("PASS", "Search for RoundTrip flight Successfully");
		} catch (Exception e) {
			Reports.reportstep("FAIL", "Search for RoundTrip flight Failed");
		}
	}
	@Test(priority = 6,alwaysRun = true)
	public void Select_fight_TestCase() {
		try {
			report.setTCDesc("TC05-Select Flight And proceed to Booking Page");
			sj.Select_flight();
			Reports.reportstep("PASS", "Flight Selected Proceed to Bookpage  Successfully");
		} catch (Exception e) {
			Reports.reportstep("FAIL", "Failed: Flight  not Selected & Proceed to Bookpage ");
		}
	}
	@Test(priority = 7,alwaysRun = true)
	public void Fill_booking_form_TestCase() {
		try {
			report.setTCDesc("TC06-Search Flight And proceed to Payment Page");
			sj.Fill_booking_form("Mrs","john","petter","9876543210","johnpetter@gamil.com","afghanistan","mexico","Mrs", "john","petter", "9876543210", "19011998","19/01/2025");
			Reports.reportstep("PASS", "Flight Searched Proceed to Payment Page  Successfully");
		} catch (Exception e) {
			Reports.reportstep("FAIL", "Flight  not Searched & Proceed to Payment Page ");
		}
	}
	@Test(priority = 8,alwaysRun = true)
	public void Fill_Payment_Information_TestCase() {
		try {
			report.setTCDesc("TC07-Validating Given Url is broken Or Not");
			sj.Fill_Payment_Info("1234 45678 9011 9876", "John petter", "08", "2025", "899");
			Reports.reportstep("PASS", "TestCase passed by Filling Payment information");
		} catch (Exception e) {
			Reports.reportstep("FAIL", "TestCase Failed by Filling Invalid Payment information");
		}
	}
	@Test(priority = 9,alwaysRun = true)
	public void VerifyBooking_TestCase() {
		try {
			report.setTCDesc("TC08-");
			
			Reports.reportstep("PASS", "");
		} catch (Exception e) {
			Reports.reportstep("FAIL", "");
		}
	}
	@Test(priority = 10,alwaysRun = true)
	public void Validate_Checkin_TestCase() {
		try {
			report.setTCDesc("TC09-");
			sj.Validating_checkin("B6X7N7", "johnpetter@gmail.com");
			Reports.reportstep("PASS", "");
		} catch (Exception e) {
			Reports.reportstep("FAIL", "");
		}
	}
	@Test(priority = 11,alwaysRun = true)
	public void ValidateFlight_Status_TestCase() {
		try {
			report.setTCDesc("TC010-");
			sj.vaidating_Flight_status("19/01/2024", "chennai", "mumbai", "A9X7N5");
			Reports.reportstep("PASS", "");
		} catch (Exception e) {
			Reports.reportstep("FAIL", "");
		}
	}
	@Test(priority = 12,alwaysRun = true)
	public void Valiadte_Manage_Booking_TestCase() {
		try {
			report.setTCDesc("TC011-");
			sj.validating_manage_booking("B6X7N7", "johnpetter@gmail.com");
			Reports.reportstep("PASS", "");
		} catch (Exception e) {
			Reports.reportstep("FAIL", "");
		}
	}
	
	@Test(priority = 13,alwaysRun = true)
	public void quit() {
		closeAllBrowsers();
	}
}
