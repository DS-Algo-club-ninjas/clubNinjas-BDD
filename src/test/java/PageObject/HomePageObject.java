package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import DriverFactory.DriverFactory;

public class HomePageObject {
	
	WebDriver driver= DriverFactory.getDriver();
	
	// Locators
    By signInLink = By.xpath("//a[text()='Sign in']");
    By getStarted_btn = By.xpath("//button[@class='btn']");
    By DataStructuresDrpDwn= By.xpath("//div[@class='nav-item dropdown show']");
    
  //Need to call method from Home Page
	public void click_getStarted_btn() {
		driver.findElement(getStarted_btn).click();
	}

}
