package PageObject;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import DriverFactory.DriverFactory;

public class ArrayPageObject {	
	WebDriver driver= DriverFactory.getDriver();
	
	By arrayGetStarted_btn = By.xpath("//a[@href='array']");
	By dataStructutrDropDown = By.xpath("//div[@class='nav-item dropdown']");
	By arrayDropDown = By.xpath("//div[@class='nav-item dropdown show']//*[contains(text(),'Arrays')]");
	By arraysInPython_link = By.linkText("Arrays in Python");
	By arraysUsingList_link = By.linkText("Arrays Using List");
	By basicOperationsInLists_link = By.linkText("Basic Operations in Lists");
	By applicationsOfArray_link = By.linkText("Applications of Array");
	By tryHere_btn = By.linkText("Try here>>>");
	By run_btn = By.xpath("//button");
	By tryHereEditor_box = By.xpath("//textarea[@autocorrect='off']");
	By tryHereEditor_output = By.id("output");
	By practiceQns_link = By.linkText("Practice Questions");
	By searchTheArray_link = By.linkText("Search the array");
	By maxConsOnes_link = By.linkText("Max Consecutive Ones");
	By findNumbers_link = By.linkText("Find Numbers with Even Number of Digits");
	By sqrsOfArray_link = By.linkText("Squares of a Sorted Array");
	By submit_btn = By.xpath("//input[@value='Submit']");
	
	
	public String get_currentPageTitle() {
		String currentTitle = driver.getTitle();
		return currentTitle;
	}
	
	public String get_currentPageURL() {
		String currentURL = driver.getCurrentUrl();
		return currentURL;
	}
	
	//ArrayPage Methods
	public void click_arrayGetStarted_btn() {
		driver.findElement(arrayGetStarted_btn).click();
	}
	
	public void click_dataStructutrDropDown() {
		driver.findElement(dataStructutrDropDown).click();
	}
	
	public void select_arrayDropDown() {
		driver.findElement(arrayDropDown).click();
	}
	
	public void click_arraysInPython_link() {
		driver.findElement(arraysInPython_link).click();
	}
	
	public void click_arraysUsingList_link() {
		driver.findElement(arraysUsingList_link).click();
	}
	
	public void click_basicOperationsInLists_link() {
		driver.findElement(basicOperationsInLists_link).click();
	}
	
	public void click_applicationsOfArray_link() {
		driver.findElement(applicationsOfArray_link).click();
	}
	
	public void click_tryHere_btn() {
		driver.findElement(tryHere_btn).click();
	}
	
	public void click_tryHereRun_btn() {
		driver.findElement(run_btn).click();
	}

	public void click_practiceQns_link() {
		driver.findElement(practiceQns_link).click();
	}
	
	public void click_searchTheArray_link() {
		driver.findElement(searchTheArray_link).click();
	}
	
	public void click_maxConsOnes_link() {
		driver.findElement(maxConsOnes_link).click();
	}
	
	public void click_findNumbers_link() {
		driver.findElement(findNumbers_link).click();
	}
	
	public void click_sqrsOfArray_link() {
		driver.findElement(sqrsOfArray_link).click();
	}
	
	public void click_submit_btn() {
		driver.findElement(submit_btn).click();
	}
	
	public void enterCodeTryEditor(String pythonCode) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(run_btn));
	    WebElement tryHereEditor = driver.findElement(tryHereEditor_box);
		tryHereEditor.sendKeys(Keys.CONTROL + "a");
		tryHereEditor.sendKeys(Keys.DELETE);
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		js.executeScript(
	            "document.querySelector('.CodeMirror').CodeMirror.setValue(arguments[0]);",
	            pythonCode
	        );
	}
	
	public String get_tryHereEditor_output() {
		String output = null;
		try {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(tryHereEditor_output));
		output = driver.findElement(tryHereEditor_output).getText();
		}
		catch (TimeoutException e) {
			e.printStackTrace();
		}
		return output;
	}
	
	public void acceptAlert(String errorMsg) {
		try {
			Alert alert = driver.switchTo().alert();
			String alertMsg = alert.getText();
			System.out.println("Alert Is:" + alertMsg);
			alert.accept();
			Assert.assertTrue(alertMsg.contains(errorMsg));
		} catch (NoAlertPresentException e) {
			Assert.fail("No Alert found");
		}
		catch (UnhandledAlertException e) {
			System.out.println("Unhandled alert exception: " + e.getMessage());
		}
		}
}
