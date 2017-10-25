package GUI;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StartPage {
	
	WebDriver driver;
	@FindBy(id = "log-in")
	WebElement loginButton;
	
	public StartPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void loginButtonClick(){
		loginButton.click();
	}
}
