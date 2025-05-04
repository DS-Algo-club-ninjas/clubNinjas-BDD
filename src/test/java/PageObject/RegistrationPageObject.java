package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import DriverFactory.DriverFactory;

public class RegistrationPageObject {
	
		
	WebDriver driver= DriverFactory.getDriver();

         
        // Locators
        By registerLink = By.linkText("Register");
        By usernameRegTxtBox = By.id("id_username");
        By passwordRegTxtBox = By.id("id_password1");
        By passwordConfirmRegTxtBox = By.id("id_password2");
        By registerButton = By.xpath("//input[@value='Register']");
        By loginLink = By.id("registerBtn");
        By successMessage = By.xpath("//div[contains(text(), 'New Account Created')]");
        By ErrorMessage = By.xpath("//div[@class='alert alert-primary']");
        
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

    	public boolean isUsernameEnteredCorrectly() {
      		
    		String username = "clubNinjasSdet207";
    	    WebElement usernameField = driver.findElement(usernameRegTxtBox);
    	    usernameField.sendKeys(username);
    	    String userNameTxtFieldValue = usernameField.getDomProperty("value");
    	    System.out.println("Username field value: " +userNameTxtFieldValue);
    	    return userNameTxtFieldValue != null && !userNameTxtFieldValue.trim().isEmpty();

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
    	    
    		String password = "SeleniumProj@25";
    		WebElement passwordfield = driver.findElement(usernameRegTxtBox);
    		passwordfield.sendKeys(password);
    		String passwordfieldTxtFieldValue = passwordfield.getDomProperty("value");
    		System.out.println("Username field value: " +passwordfieldTxtFieldValue);
    		return passwordfieldTxtFieldValue != null && !passwordfieldTxtFieldValue.trim().isEmpty();
    	}
    	
    	public String errorMessageDisplayed() {
    		return driver.findElement(ErrorMessage).getText();
    		 	}

    	public String homeSuccessMessageDisplayed() {
    		return driver.findElement(successMessage).getText();
    	}

}


