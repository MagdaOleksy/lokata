package mBank;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import GUI.*;

public class Start {
	
	
	
	public static void main(String[] args){
		//System.setProperty("webdriver.chrome.driver", "C:\\JARy\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.mbank.pl");
		
        StartPage startPage = PageFactory.initElements(driver, StartPage.class);
        startPage.loginButtonClick();
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
       // loginPage.logIn(login, password);
	}
}
