package mBank;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import GUI.*;

public class Start {
	
	
	
	public static void main(String[] args){
		//System.setProperty("webdriver.chrome.driver", "C:\\JARy\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\JARy\\chromedriver.exe");
		 // DesiredCapabilities cap = DesiredCapabilities.firefox();
	    //    cap.setCapability("marionette", true);
	    //    cap.setBrowserName("firefox");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mbank.pl");
		
        StartPage startPage = PageFactory.initElements(driver, StartPage.class);
        startPage.loginButtonClick();
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
       // loginPage.logIn(login, password);
	}
}
