package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.AddContactPage;
import page.BasePage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddContactTest extends BasePage {
	
	WebDriver driver;
	String userName;
	String password;
	String fullName;
	String companyName;
	String email;
	String phone;
	String address;
	String city;
	String country;
	String state;
	String zip;
	@Test
	@Parameters({"userName", "password","FullName","CompanyName","Email","Phone","Address","City","Country","State","Zip"})
	public void validUserShouldBeAbleToAddCustomer(@Optional("default parameter will execute if the parameter tag misses in the testng.xml ")String userName, String password, String fullName, String companyName, String email, String phone, String address, String city, String country, String state, String zip) throws InterruptedException {
		driver = BrowserFactory.init();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
			loginPage.insertUserName(userName);
			loginPage.insertPassword(password);
			loginPage.clicSignIn();
			
			DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
			dashboardPage.validationDashboard("Dashboard- iBilling");
			dashboardPage.clickCustomerElement();
			dashboardPage.clickAddCustomerElement();
			
			AddContactPage addcontactPage = PageFactory.initElements(driver, AddContactPage.class);
			addcontactPage.validatAddContactPage("Contacts - iBilling");
			addcontactPage.insertFullName(fullName);
			addcontactPage.selectDropDownPage(companyName);
			addcontactPage.insertEmail(email);
			addcontactPage.insertPhone(phone);
			addcontactPage.insertAddress(address);
			addcontactPage.insertCity(city);
			addcontactPage.insertState(state);
			addcontactPage.insertZip(zip);
			addcontactPage.selectDropdownCountry(country);
			
			addcontactPage.clickableSaveButton();
			
	}

}
