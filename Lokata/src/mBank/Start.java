package mBank;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import GUI.*;

public class Start {
	
	
	
	private static Scanner odczyt;

	public static void main(String[] args){

		System.setProperty("webdriver.chrome.driver", "C:\\JARy\\chromedriver.exe");
		System.out.println("Podaj login");
		odczyt = new Scanner (System.in);
		String login = odczyt.nextLine();
		System.out.println("Podaj has³o");
		String password = odczyt.nextLine();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mbank.pl");
		
        StartPage startPage = PageFactory.initElements(driver, StartPage.class);
        startPage.loginButtonClick();
        
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.logIn(login, password);
        
        DesktopPage desktopPage = new DesktopPage(driver);
        desktopPage.clickShoppingButton();
        
        
	}
}
