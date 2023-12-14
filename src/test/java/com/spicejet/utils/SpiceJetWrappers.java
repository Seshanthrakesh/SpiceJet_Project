package com.spicejet.utils;
import org.openqa.selenium.support.PageFactory;
import com.spicejet.pages.SJ6_Select_Flight_To_BookingPage;
import com.spicejet.pages.SJ7_Fill_BookingForm;
import com.spicejet.pages.SJ8_Fill_Payment_Information;
import com.spicejet.pages.SJ9_Verify_Booking;
import com.spicejet.pages.SJP10_Validate_CheckIn;
import com.spicejet.pages.SJP11_Validate_Flight_Status;
import com.spicejet.pages.SJP12_Validate_Manage_Booking;
import com.spicejet.pages.SJ3_LoginPage;
import com.spicejet.pages.SJ4_Search_Flight_Oneway;
import com.spicejet.pages.SJ5_Search_Flight_RoundTrip;
import com.spicejet.pages.SJ2_Validate_SignupPage;

public class SpiceJetWrappers extends Sewrappers{
	public void signup() {
		SJ2_Validate_SignupPage signuppage=PageFactory.initElements(driver, SJ2_Validate_SignupPage.class);
		signuppage.signup_method();
	}
	public void login(String mobilenumber,String pswd ) {
		SJ3_LoginPage loginpage=PageFactory.initElements(driver, SJ3_LoginPage.class);
		loginpage.do_login();
		loginpage.select_mobilenumbercheckbox();
		loginpage.Type_mobilenumbercheckbox(mobilenumber);
		loginpage.Type_password(pswd);
		loginpage.clicklogin_button();
	}
	public void search_Flight_for_OneWay_Travel(String origin,String dest) {
		SJ4_Search_Flight_Oneway OneWay=PageFactory.initElements(driver, SJ4_Search_Flight_Oneway.class);
		OneWay.Search_Flight_Onewymethods(origin,dest);
		OneWay.passengers_count_Oneway();
		OneWay.Click_SearchFlight();
	}
	public void search_Flight_for_RoundTrip_Travel(String origin,String dest) {
		SJ5_Search_Flight_RoundTrip Roundtrip=PageFactory.initElements(driver, SJ5_Search_Flight_RoundTrip.class);
		Roundtrip.Search_Flight_Roundtripmethods(origin,dest);
		Roundtrip.passengers_count_Roundtrip();
		Roundtrip.Click_SearchFlight();
	}
	public void Select_flight() {
		SJ6_Select_Flight_To_BookingPage selectflight=PageFactory.initElements(driver, SJ6_Select_Flight_To_BookingPage.class);
		selectflight.select_flight();
		
	}
	public void Fill_booking_form(String title,String fmName,String LName,String contact,String Email,String search,String city,String ptitle,String pfmName,String pLName,String MobileNum,String passNum,String validuptodate) {
		SJ7_Fill_BookingForm bookingflight=PageFactory.initElements(driver, SJ7_Fill_BookingForm.class);
		bookingflight.contact_details(title, fmName, LName, contact, Email, search, city);
		bookingflight.passengers_information(ptitle, pfmName, pLName, MobileNum, passNum,validuptodate);
	}
	public void Fill_Payment_Info(String cnum,String cardholder,String emonth,String eyear,String cvv) {
		SJ8_Fill_Payment_Information payment=PageFactory.initElements(driver, SJ8_Fill_Payment_Information.class);
		payment.ToskipAddons();
		payment.Entering_Payment_Details(cnum, cardholder, emonth, eyear, cvv);
	}
	public void verify_booking() {
		SJ9_Verify_Booking verifybooing=PageFactory.initElements(driver, SJ9_Verify_Booking.class);
		verifybooing.verifybooking();
	}
	public void Validating_checkin(String pnr,String emailid) {
		SJP10_Validate_CheckIn checkin=PageFactory.initElements(driver, SJP10_Validate_CheckIn.class);
		checkin.CheckIn(pnr, emailid);
	}
	public void vaidating_Flight_status(String date,String from,String to,String fno) {
		SJP11_Validate_Flight_Status status=PageFactory.initElements(driver, SJP11_Validate_Flight_Status.class);
		status.validating_flight_status(date, from, to, fno);
	}
	public void validating_manage_booking(String m_pnr,String m_emailid) {
		SJP12_Validate_Manage_Booking managebooking=PageFactory.initElements(driver, SJP12_Validate_Manage_Booking.class);
		managebooking.Manage_Booking(m_pnr, m_emailid);
	}
}
