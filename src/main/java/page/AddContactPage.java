package page;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class AddContactPage extends BasePage  {
	
	WebDriver driver;
	
	public AddContactPage(WebDriver driver) {
		this.driver = driver;
	
	}
	@FindBy(how = How.XPATH, using = "//h5[contains(text(), 'Add Contact')]")WebElement ADD_CONTACT_HEADER_ELEMENT;
     @FindBy(how = How.XPATH, using = "//*[@id=\"account\"]\"")WebElement FULLNAME_ELEMENT;
     @FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]")WebElement COMPANY_ELEMENT;
     @FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")WebElement EMAIL_ELEMENT;
     @FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]")WebElement PHONE_ELEMENT;
     @FindBy(how = How.XPATH, using = "//*[@id=\"address\"]")WebElement ADDRESS_ELEMENT;
     @FindBy(how = How.XPATH, using = "//*[@id=\"city\"]")WebElement CITY_ELEMENT;
     @FindBy(how = How.XPATH, using = "//*[@id=\"state\"]")WebElement STATE_ELEMENT;
     @FindBy(how = How.XPATH,using = "//*[@id=\"zip\"]") WebElement ZIP_ELEMENT;
     @FindBy(how = How.XPATH, using = "//select[@id='country']/option[1]")WebElement COUNTRY_ELEMENT;
    @ FindBy(how = How.XPATH, using = "//*[@id=\"rform\"]/div[1]/div[1]/div[10]/div/span/span[1]/span")WebElement EMPTY_ELEMENT;
     @FindBy(how = How.XPATH, using = "//*[@id=\"submit\"]")WebElement SAVE_ELEMENT;
     
     
     
     public void  validatAddContactPage(String addContact) throws InterruptedException {
    	 Thread.sleep(3000);
    	 Assert.assertEquals(ADD_CONTACT_HEADER_ELEMENT.getText(), addContact, "Wrong Page!!");
     
   
     }
     static String enteredName;
 	public static String getEnteredName() {
 		return enteredName;
 	}
     public void insertFullName(String fullName) {
    	  enteredName = fullName + randomNumber(999);
    	
    	 FULLNAME_ELEMENT.sendKeys(fullName);
     }
    
	public void selectDropDownPage ( String company) {
		selectDropDownPage(company);
	}
	public void insertEmail(String email) {
		EMAIL_ELEMENT.sendKeys(email + randomNumber(999));
	}
	public void insertPhone(String phone) {
		PHONE_ELEMENT.sendKeys(phone + randomNumber(999));
	}
	public void insertAddress(String address) {
		ADDRESS_ELEMENT.sendKeys(address);
	}
	public void insertCity(String city) {
		CITY_ELEMENT.sendKeys(city);
	}
	public void insertState(String state) {
		STATE_ELEMENT.sendKeys(state);
	}
	public void insertZip(String zip) {
		ZIP_ELEMENT.sendKeys(zip);
	}
	public void selectDropdownCountry(String country) {
		selectDropDownPage(country);
	}
	
	
	public void clickableSaveButton() {
		SAVE_ELEMENT.click();
	}
}
