package PageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import DriverFactory.DriverFactory;

public class GraphPageObject {

	WebDriver driver= DriverFactory.getDriver();
	
	//Locators
	By graphLink = By.xpath("//p[text()='Topics Covered']/following-sibling::ul[1]//a[text()='Graph']");
	By graphRepresentationsLink = By.xpath("//p[text()='Topics Covered']/following-sibling::ul[2]//a[text()='Graph Representations']");
	By practiceQuestions = By.xpath("//a[normalize-space()='Practice Questions']");
	
	By tryHere_btn = By.linkText("Try here>>>");
	By run_btn = By.xpath("//button");
	By tryHereEditor_box = By.xpath("//textarea[@autocorrect='off']");
	By tryHereEditor_output = By.xpath("//pre[@id='output']");
	
	public void clickGraphLink() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(graphLink));
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

	public String getResultText() {
		return driver.findElement(tryHereEditor_output).getText();
	}

}
