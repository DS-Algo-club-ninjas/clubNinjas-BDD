package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import DriverFactory.DriverFactory;

public class QueuePageObject {
	
	WebDriver driver= DriverFactory.getDriver();
	
	By queueGetStarted_btn = By.xpath("//a[@href='queue']");
	By dataStructutrDropDown = By.xpath("//div[@class='nav-item dropdown']");
	By queueDropDown = By.xpath("//div[@class='nav-item dropdown show']//*[contains(text(),'Queue')]");
	By implOfQueue_link = By.linkText("Implementation of Queue in Python");
	By implUsingCollections_link = By.linkText("Implementation using collections.deque");
	By implUsingArray_link = By.linkText("Implementation using array");
	By queueOperation_link = By.linkText("Queue Operations");
	
	public void click_queueGetStarted_btn() {
		driver.findElement(queueGetStarted_btn).click();
	}
	
	public void click_dataStructutrDropDown() {
		driver.findElement(dataStructutrDropDown).click();
	}
	public void click_queueDropDown() {
		driver.findElement(queueDropDown).click();
	}
	
	public void click_implOfQueue_link() {
		driver.findElement(implOfQueue_link).click();
	}
	
	public void click_implUsingCollections_link() {
		driver.findElement(implUsingCollections_link).click();
	}
	
	public void click_implUsingArray_link() {
		driver.findElement(implUsingArray_link).click();
	}
	
	public void click_queueOperation_link() {
		driver.findElement(queueOperation_link).click();
	}

}
