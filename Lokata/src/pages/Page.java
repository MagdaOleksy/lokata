package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page {

	public Page(WebDriver driver){
		this.driver = driver;
	}
	
	WebDriver driver;
}
