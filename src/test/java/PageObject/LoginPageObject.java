package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObject {
	
	WebDriver driver;
	
	 // Constructor
    public LoginPageObject(WebDriver driver) {
        this.driver = driver;
        
        // Locators
        By signInLink = By.xpath("//a[text() ='Sign in']");
        By userNameTxtBox = By.xpath("id_username");
        By passwordTxtBox = By.id("id_password");
        By regLinkbelowLogin = By.xpath("//a[text() ='Register!]");
        
    

}

}
