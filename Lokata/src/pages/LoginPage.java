package pages;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends Page{
	
	WebDriver driver;
	@FindBy(id="userID")
	WebElement login;
	@FindBy(id="pass")
	WebElement password;
	@FindBy(id="submitButton")
	WebElement submitButton;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void logIn(String log, String pass){
		login.sendKeys(log);
		password.sendKeys(pass);
		submitButton.click();
	}

}
