package Page;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class newCustomer {

	WebDriver driver;

	By newCustomer = By.xpath("//input[@name='name']");
	By femaleRadiobtn = By.xpath("//input[@value='f']");
	By dateOfBirth = By.xpath("//input[@name='dob']");
	By address = By.xpath("//*[@name='addr']");
	By cityName = By.xpath("//*[@name='city']");
	By StateName = By.xpath("//*[@name='state']");
	By PinNumber = By.xpath("//*[@name='pinno']");
	By mobNumber = By.xpath("//*[@name='telephoneno']");
	By email = By.xpath("//*[@name='emailid']");
	By password = By.xpath("//*[@name='password']");

	public newCustomer(WebDriver driver) {

		this.driver = driver;

	}

	public void verifyNewCustomerPage() {

		String pageTitle = driver.getTitle();
		assertEquals("Guru99 Bank New Customer Entry Page", pageTitle);

	}

	public void setNewCustomer() {
		driver.findElement(newCustomer).sendKeys("Subodh");
	}

	public void setFemaleRadiobtn() {
		driver.findElement(femaleRadiobtn).click();
	}

	public void setDateOfBirth() {
		driver.findElement(dateOfBirth).sendKeys("09/09/1992");
	}

	public void setAddress() {
		driver.findElement(address).sendKeys("Delhi 6");
	}


	public void setCityName() {
		driver.findElement(cityName).sendKeys("Delhi");
	}


	public void setStateName(By stateName) {
		StateName = stateName;
	}

	public By getPinNumber() {
		return PinNumber;
	}

	public void setPinNumber(By pinNumber) {
		PinNumber = pinNumber;
	}

	public By getMobNumber() {
		return mobNumber;
	}

	public void setMobNumber(By mobNumber) {
		this.mobNumber = mobNumber;
	}

	public By getEmail() {
		return email;
	}

	public void setEmail(By email) {
		this.email = email;
	}

	public By getPassword() {
		return password;
	}

	public void setPassword(By password) {
		this.password = password;
	}

}
