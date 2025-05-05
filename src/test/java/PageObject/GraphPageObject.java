package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import DriverFactory.DriverFactory;

public class GraphPageObject {

	WebDriver driver= DriverFactory.getDriver();
	
	//Locators
	By graphLink = By.linkText("Graph");
	By graphRepresentationsLink = By.linkText("Graph Representations");
	By practiceQuestions = By.xpath("//a[normalize-space()='Practice Questions']");
	
	By tryHere_btn = By.linkText("Try here>>>");
	By run_btn = By.xpath("//button");
	By tryHereEditor_box = By.xpath("//textarea[@autocorrect='off']");
	By tryHereEditor_output = By.id("output");
	
	public void clickGraphLink() {
		driver.findElement(graphLink).click();
	}
	
	public void clickGraphRepresentationsLink() {
		driver.findElement(graphRepresentationsLink).click();
	}
	
	public void clickPracticeQuestionsLink() {
		driver.findElement(practiceQuestions).click();
	}
	public void click_tryHere_btn() {
		driver.findElement(tryHere_btn).click();
	}
	
	public void click_tryHereRun_btn() {
		driver.findElement(run_btn).click();
	}
	
	public boolean runBtnDisplayed() {
		return driver.findElement(run_btn).isDisplayed();
	}

}
