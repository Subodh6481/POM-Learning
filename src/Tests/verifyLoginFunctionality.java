package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.LoginPage;
import SetUP.DriverSetup;

public class verifyLoginFunctionality extends DriverSetup {

	WebDriver driver;
	LoginPage loginpage;
	
	
	@BeforeClass
	
	public void setUp() {

		driver = getDriver();
	}
	
	
	@Test
	public void verifyValidLogin() {
		
		loginpage =new LoginPage(driver);
		
		loginpage.setUserid("mngr107115");
		
		loginpage.setPassword("mugUvuq");
		
		loginpage.clickBtnLogin();
		
		loginpage.verifyHomePage();
	}
	
	@AfterClass
	
	public void closeBrowser() {
		
		driver.quit();
		
	}
	
	
	
}
