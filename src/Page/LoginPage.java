package Page;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	By uid= By.xpath("//input[@name='uid']");
	
	By passwd= By.xpath("//input[@name='password']");
	
	By btnLogin=By.xpath("//input[@name='btnLogin']");
	
	public void setUserid(String userid)
	{
		driver.findElement(uid).sendKeys(userid);
		
	}
	
	
	public void setPassword(String password)
	{
		
		driver.findElement(passwd).sendKeys(password);
		
	}
	
	
	public void clickBtnLogin()
	{
		
		driver.findElement(btnLogin).click();
	}
	
	public void verifyHomePage() {
		
		String PageTitle= driver.getTitle().trim();
		
		assertEquals("Guru99 Bank Manager HomePage", PageTitle);
		
		
		
	}
	
	
}
