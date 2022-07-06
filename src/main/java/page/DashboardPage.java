package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;



public class DashboardPage {
	
	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//h2[contains(text(), 'Dashboard')]")WebElement DASHBOARD_WEBELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/a/span[1]")WebElement CUSTOMER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a")WebElement ADD_CUSTOMER_ELEEMENT;
	@FindBy(how= How.XPATH,using = "//*[@id=\"side-menu\"]/li[3]/ul/li[2]/a")WebElement LIST_CUSTOMER_ELEMENT;
	
	
	public void validationDashboard(String dashboard) {
		Assert.assertEquals(DASHBOARD_WEBELEMENT.getText(), dashboard, "wrong Page ! !");
	}
	
	
	public void clickCustomerElement() throws InterruptedException {
//		Actions action = new Actions(driver);
//		action.doubleClick(CUSTOMER_ELEMENT);
		Thread.sleep(3000);
		CUSTOMER_ELEMENT.click();
	}
	public void clickAddCustomerElement() {
		ADD_CUSTOMER_ELEEMENT.click();
	}
    public void clickListCustomer() throws InterruptedException {
    	Thread.sleep(3000);
    	LIST_CUSTOMER_ELEMENT.click();
    }
}
