package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	
	WebDriver driver;
	
	
	String userName ;
	String password;
	String dashBoardHeaderVerify;
	
	
	
	@Test
	@Parameters({"userName","password"})
	public void validUserShouldBeAbleToLogin(String userName, String password) {
		
		driver = BrowserFactory.init();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		loginPage.insertUserName(userName);
		loginPage.insertPassword(password);
		loginPage.clicSignIn();
		
		DashboardPage dashBoardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashBoardPage.validationDashboard("Dashboard");
		BrowserFactory.tearDown();
		
	}
	

}
