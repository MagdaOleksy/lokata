package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MarketPage {

	public MarketPage(WebDriver driver) {
		this.driver = driver;
	}
	
	WebDriver driver;
	
	@FindBy(id = "shop-menu-SV")
	WebElement savingsButton;
}
