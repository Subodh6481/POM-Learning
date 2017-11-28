package SetUP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class DriverSetup {

	private WebDriver driver;

	public static String baseurl = "http://demo.guru99.com/v4/";

	
	public WebDriver getDriver() {

		
		System.setProperty("webdriver.chrome.driver", "C://Eclipse//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to(baseurl);

		return driver;
	}

}
