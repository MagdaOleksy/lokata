package mBank;

import org.testng.annotations.Test;

import pages.*;

import org.testng.annotations.BeforeTest;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class Start {
	
	WebDriver driver;
	String login;
	String password;
	
  @Test(priority = 0)
  public void loginButtonClick() {
	
	  StartPage startPage = PageFactory.initElements(driver, StartPage.class);
	  startPage.loginButtonClick();
  }
  
  @Test(priority = 1)
  public void logIn(){
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	  loginPage.logIn(login, password);
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\JARy\\chromedriver_win32_2.37\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.mbank.pl");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
  
  @BeforeSuite
  public void getLoginAndPassword(){
	  System.out.println("Podaj login");
	  Scanner in = new Scanner(System.in);
	  login = in.nextLine();
	  System.out.println("Podaj has³o");
	 
	  password = in.nextLine();
  }
}
