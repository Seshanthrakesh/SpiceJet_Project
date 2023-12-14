package com.spicejet.pages;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.spicejet.utils.Sewrappers;

public class SJ4_Search_Flight_Oneway extends Sewrappers {
	@FindBy(xpath="//div[text()='Flights']")
	public WebElement fligt_tab;

	@FindBy(xpath="//div[text()='one way']")
	public WebElement OneWay_Checkbutton;

	@FindBy(xpath="//div[text()='round trip']")
	public WebElement RoundTrip_Checkbutton;

	@FindBy(xpath="(//input[@data-focusable='true'])[1]")
	public WebElement Origin;

	@FindBy(xpath="(//input[@data-focusable='true'])[2]")
	public WebElement Destination;

	@FindBy(xpath="//div[text()='Departure Date']")
	public WebElement DepartureDate;

	@FindBy(xpath="//div[text()='Passengers']")
	public WebElement Passengers_count;

	@FindBy(xpath="//div[@data-testid='Adult-testID-plus-one-cta']")
	public WebElement Adult_Increase;

	@FindBy(xpath="//div[@data-testid='Adult-testID-minus-one-cta']")
	public WebElement Adult_Decrease;

	@FindBy(xpath="//div[@data-testid='Children-testID-plus-one-cta']")
	public WebElement Children_Increase;

	@FindBy(xpath="//div[@data-testid='Children-testID-minus-one-cta']")
	public WebElement Children_Decrease;

	@FindBy(xpath="//div[text()='INR']")
	public WebElement inr;

	@FindBy(xpath="//div[text()='USD']")
	public WebElement usd;

	@FindBy(xpath="//div[text()='Family & Friends']")
	public WebElement Family_Friends;

	@FindBy(xpath="//div[text()='Senior Citizen']")
	public WebElement Senior_Citizen;

	@FindBy(xpath="//div[text()='Unaccompanied Minor']")
	public WebElement Unaccompanied_Minor;

	@FindBy(xpath="//div[text()='Students']")
	public WebElement Students;

	@FindBy(xpath="(//div[text()='Govt. Employee'])[2]")
	public WebElement Govt_Employee;

	@FindBy(xpath="//div[text()='Special Assistance']")
	public WebElement Special_Assistance;

	@FindBy(xpath="//div[@data-testid='home-page-flight-cta']")
	public WebElement SearchFlight_button;

	public void Search_Flight_Onewymethods(String origin,String dest)  {
		waitForElement(fligt_tab, 20);
		actionsClick(fligt_tab);
		waitForElement(OneWay_Checkbutton, 20);
		actionsClick(OneWay_Checkbutton);
		
		//Fill  with Dummy Origin
		waitForElementToBeClickable(Origin, 20);
		typeText(Origin,origin);

		List<WebElement> originlist=driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-b5h31w r-rnv2vh r-5njf8e r-1otgn73']"));
		for(WebElement options : originlist) {
			String currentoptions=options.getText();
			if(currentoptions.contains("Chennai")) {
				waitForElementToBeClickable(options,20);
				options.click();
				break;
			}
		}
		
		//Fill  with Dummy Destination
		waitForElementToBeClickable(Destination, 20);
		typeText(Destination,dest);

		List<WebElement> destlist=driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-b5h31w r-rnv2vh r-5njf8e r-1otgn73']"));
		for(WebElement options : destlist) {
			String currentoptions=options.getText();
			if(currentoptions.contains("Coimbatore")) {
				waitForElementToBeClickable(options,40);
				options.click();
				break;
			}
		}

		List<WebElement> dates=driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1pi2tsx r-1777fci r-13qz1uu']//div"));
		for(WebElement date:dates) {
			System.out.println(date.getText());
			if(date.getText().equalsIgnoreCase("23")) {
				waitForElementToBeClickable(date,40);
				actionsClick(date);
			}
		}


		waitForElementToBeClickable(DepartureDate, 500);
		actionsClick(DepartureDate);

	}
	
	//Adds No.of.passengers to search ticket
	public void passengers_count_Oneway() {
		waitForElementToBeClickable(Passengers_count, 300);
		actionsClick(Passengers_count);
		waitForElement(Adult_Increase, 20);
		actionsClick(Adult_Increase);
		actionsClick(Adult_Increase);
		actionsClick(Children_Increase);
		actionsClick(Children_Increase);
	}
	
	public void Click_SearchFlight() {
		waitForElementToBeClickable(Family_Friends,20000);
		actionsClick(Family_Friends);
		waitForElementToBeClickable(SearchFlight_button,20000);
		actionsMoveToElement(SearchFlight_button);
		SearchFlight_button.click();
		actionsClick(SearchFlight_button);
	}
}
