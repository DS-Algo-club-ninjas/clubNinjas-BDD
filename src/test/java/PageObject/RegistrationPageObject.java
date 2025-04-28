package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import DriverFactory.DriverFactory;

public class RegistrationPageObject {
	
		
	WebDriver driver= DriverFactory.getDriver();

    // Constructor
   // public RegistrationPageObject(WebDriver driver) {
        //this.driver = driver;
        
        // Locators
		
        By registerLink = By.linkText("Register");
        By usernameRegTxtBox = By.id("id_username");
        By passwordRegTxtBox = By.id("id_password1");
        By passwordConfirmRegTxtBox = By.id("id_password2");
        By registerButton = By.xpath("//input[@value='Register']");
        By loginLink = By.id("registerBtn");
        By successMessage = By.xpath("//div[contains(text(), 'New Account Created')]");
        By ErrorMessage = By.xpath("//div[@class='alert alert-primary']");
        
    	//Need to call method from Home Page
//    	public void click_getStarted_btn() {
//    		driver.findElement(getStarted_btn).click();
//    	}
        
    	public boolean registerLinkDisplayed() {
    		return driver.findElement(registerLink).isDisplayed();
    	}
    	
    	public void registerLinkClick() {
    		driver.findElement(registerLink).click();
    	}
    	
    	public boolean registerBtnDisplayed() {
    		return driver.findElement(registerLink).isDisplayed();
    	}
    	
    	public void registerBtnClick() {
    		driver.findElement(registerButton).click();
     	}

    	public void enterUserNameRegTxtBox(String username) {
    		driver.findElement(usernameRegTxtBox).clear();
    		driver.findElement(usernameRegTxtBox).sendKeys(username);
     	}
    	
//    	public boolean isUsernameEnteredCorrectly() {
//    		// Example: Check if the username is non-empty and matches a pattern
//    		//return usernameRegTxtBox != null && !((CharSequence) usernameRegTxtBox).isEmpty();
//    		return usernameRegTxtBox != null && !usernameRegTxtBox.getAttribute("value").isEmpty();
//    	}
//    	
    	public boolean isUsernameEnteredCorrectly() {
    	    WebElement usernameField = driver.findElement(usernameRegTxtBox); 
    	    return usernameField != null && !usernameField.getText().isEmpty();
    	  //return usernameRegTxtBox != null && !((CharSequence) usernameRegTxtBox).isEmpty();

    	}
    	
    	public void enterPasswordRegTxtBox(String password) {
    		driver.findElement(passwordRegTxtBox).clear();
    		driver.findElement(passwordRegTxtBox).sendKeys(password);
     	}
    	
    	public void enterPasswordConfirmRegTxtBox(String ConfirmPassword) {
    		driver.findElement(passwordConfirmRegTxtBox).clear();
    		driver.findElement(passwordConfirmRegTxtBox).sendKeys(ConfirmPassword);
     	}
    	
    	public boolean isPasswordEnteredCorrectly() {
    		 WebElement passwordfield = driver.findElement(passwordRegTxtBox); 
     	    return passwordfield != null && !passwordfield.getText().isEmpty();
    		//return passwordRegTxtBox != null && !((CharSequence) passwordRegTxtBox).isEmpty();
    	}
    	
    	public String errorMessageDisplayed() {
    		return driver.findElement(ErrorMessage).getText();
    		 	}

    	public String homeSuccessMessageDisplayed() {
    		return driver.findElement(successMessage).getText();
    	}

}


