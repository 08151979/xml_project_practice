package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	
	WebDriver driver;
	
	public void selectDropDownPage(WebElement element, String visibleElement) {
		
		Select sel = new Select(element);
		sel.selectByVisibleText(visibleElement);
		
	}
   public int randomNumber(int boundaryNo) {
	   Random rand = new Random(999);
	 int num =   rand.nextInt(boundaryNo);
	   return num;
   }
   public void clickActionLocator() {
	   Actions action = new Actions(driver);
	   action.doubleClick();
   }
}
