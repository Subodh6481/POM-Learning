package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	By newCustomer= By.linkText("New Customer");
	
	
	public void clickNewCUstomer()
	{
		
		driver.findElement(newCustomer).click();
		
	}
	
	
	

}
