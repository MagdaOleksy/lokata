package GUI;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DesktopPage {

	WebDriver driver;
	
	@FindBy(how=How.XPATH, xpath ="//*[@id='main-nav']/ul/li[3]/a")
	WebElement shoppingButton;
	
	public void clickShoppingButton(){
		shoppingButton.click();
	}
	
	public DesktopPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
