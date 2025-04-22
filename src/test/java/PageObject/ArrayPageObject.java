package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import DriverFactory.DriverFactory;

public class ArrayPageObject {
	

	
	WebDriver driver= DriverFactory.getDriver();
	
//	public ArrayPageObject(WebDriver driver) {
//		this.driver = driver;
//	}
	
	By getStarted_btn = By.xpath("//button[@class='btn']");
	By signIn_btn = By.linkText("Sign in");
	By username = By.id("id_username");
	By password = By.id("id_password");
	By login_btn = By.xpath("//input[@value='Login']");
	By arrayGetStarted_btn = By.xpath("//a[@href='array']");
	By dataStructutrDropDown = By.xpath("//div[@class='nav-item dropdown']");
	By arrayDropDown = By.xpath("//div[@class='nav-item dropdown show']//*[contains(text(),'Arrays')]");
	By arraysInPython_link = By.linkText("Arrays in Python");
	By arraysUsingList_link = By.linkText("Arrays Using List");
	By basicOperationsInLists_link = By.linkText("Basic Operations in Lists");
	By applicationsOfArray_link = By.linkText("Applications of Array");
	By tryHere_btn = By.linkText("Try here>>>");
	By run_btn = By.xpath("//button");
	By tryHereEditor_box = By.xpath("//*[contains(@class,'CodeMirror')]");
	By tryHereEditor_output = By.id("output");
	By practiceQns_link = By.linkText("Practice Questions");
	By searchTheArray_link = By.linkText("Search the array");
	By maxConsOnes_link = By.linkText("Max Consecutive Ones");
	By findNumbers_link = By.linkText("Find Numbers with Even Number of Digits");
	By sqrsOfArray_link = By.linkText("Squares of  a Sorted Array");
	By submit_btn = By.xpath("//input[@value='Submit']");
	
	//Need to call method from Home Page
	public void click_getStarted_btn() {
		driver.findElement(getStarted_btn).click();
	}
	
	public void click_signIn_btn() {
		driver.findElement(signIn_btn).click();
	}
	
	public void enter_username() {
		driver.findElement(username).sendKeys("ClubNinjas");
	}
	
	public void enter_password() {
		driver.findElement(password).sendKeys("qwertyui(");
	}
	
	public void click_login_btn() {
		driver.findElement(login_btn).click();
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

}
