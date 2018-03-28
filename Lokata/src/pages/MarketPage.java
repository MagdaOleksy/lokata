package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//Klasa strony 
public class MarketPage extends Page{

	public MarketPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickSavingsButton(){
		savingsButton.click();
	}
	
	WebDriver driver;
	@FindBy(linkText = "Pasa¿")
	//@FindBy(id = "shop-menu-SV")
	WebElement savingsButton;
}
