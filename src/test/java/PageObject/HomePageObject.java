package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import DriverFactory.DriverFactory;

public class HomePageObject {
	
	WebDriver driver = DriverFactory.getDriver();
	
	// Locators
    By signInLink = By.xpath("//a[text()='Sign in']");
   	By randomClick = By.xpath("//h1[text()='Preparing for the Interviews']");
    By getStarted_btn = By.xpath("//button[@class='btn']");
    By homeLogInMsg = By.xpath("//div[contains(text(),'logged in')]");
    
    //DropDownsMenu
    By dataStructuresDrpDwn= By.xpath("//a[text()='Data Structures']");
    By arrayDrpDwn= By.xpath("//a[text()='Data Structures']");
    By linkedListDrpDwn= By.xpath("//a[text()='Data Structures']");
    By stackDrpDwn= By.xpath("//a[text()='Data Structures']");
    By queueDrpDwn= By.xpath("//a[text()='Data Structures']");
    By treeDrpDwn= By.xpath("//a[text()='Data Structures']");
    By graphDrpDwn= By.xpath("//a[text()='Data Structures']");
    
    //Get Started Buttons on HomePage
    By dataStructuresGetStartedBtn= By.xpath("//h5[contains(text(),'Data Structures')]/parent::div/a[contains(text(),'Get Started')]");
    By arrayGetStartedBtn= By.xpath("//h5[contains(text(),'Array')]/parent::div/a[contains(text(),'Get Started')]");
    By linkedListGetStartedBtn= By.xpath("//h5[contains(text(),'Linked List')]/parent::div/a[contains(text(),'Get Started')]");
    By stackGetStartedBtn= By.xpath("//h5[contains(text(),'Stack')]/parent::div/a[contains(text(),'Get Started')]");
    By queueGetStartedBtn= By.xpath("//h5[contains(text(),'Queue')]/parent::div/a[contains(text(),'Get Started')]");
    By treeGetStartedBtn= By.xpath("//h5[contains(text(),'Tree')]/parent::div/a[contains(text(),'Get Started')]");
    By graphGetStartedBtn= By.xpath("//h5[contains(text(),'Graph')]/parent::div/a[contains(text(),'Get Started')]");
    
  
    
  //Need to call method from Home Page
	public void click_getStarted_btn() {
		driver.findElement(getStarted_btn).click();
	}

}
