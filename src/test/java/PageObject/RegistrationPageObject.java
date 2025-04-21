package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPageObject {
	
	WebDriver driver;

    // Constructor
    public RegistrationPageObject(WebDriver driver) {
        this.driver = driver;
        
        // Locators
        By registerLink = By.xpath("//a[text()=' Register ']");
        By usernameRegTxtBox = By.id("id_username");
        By passwordRegTxtBox = By.id("id_password1");
        By passwordConfirmRegTxtBox = By.id("id_password2");
        By registerButton = By.xpath("//input[@value='Register']");
        By loginLink = By.id("registerBtn");
        By successMessage = By.xpath("//div[contains(text(), 'New Account Created')]");
        By ErrorMessage = By.xpath("//div[contains(text(), 'password_mismatch')]");

}
}

