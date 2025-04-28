package PageObject;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import DriverFactory.DriverFactory;

public class LoginPageObject {
	
	WebDriver driver= DriverFactory.getDriver();

	
	 // Constructor
//    public LoginPageObject(WebDriver driver) {
//        this.driver = driver;
       
        // Locators
        By signInLink = By.xpath("//a[text()='Sign in']");
        By userNameTxtBox = By.name("username");
        By passwordTxtBox = By.id("id_password");
        By loginBtn = By.xpath("//input[@value='Login']");
        By regLinkbelowLogin = By.xpath("//a[text() ='Register!]");
        By loggedInMessage = By.xpath("//div[contains(text(),'logged in')]");
        By loggedOutMessage = By.xpath("//div[contains(text(),'Logged out successfully')]");
        By invalidMessage = By.xpath("//div[contains(text(),'Invalid')]");
        By signOutLink = By.xpath("//a[text()='Sign out']");
        
    	public boolean signInLinkDisplayed() {
    		return driver.findElement(signInLink).isDisplayed();
    	}

    	public void LoginBtnClick() {
    		driver.findElement(loginBtn).click();
    	}

    	public void clickSignInLink() {
    		driver.findElement(signInLink).click();
    	}

    	public void clickSignOutLink() {
    		driver.findElement(signOutLink).click();
    	}

    	public boolean signOutLinkDisplayed() {
    		return driver.findElement(signOutLink).isDisplayed();
    	}
    	
    	public void enterUserNameTxtBox(String username) {
    		driver.findElement(userNameTxtBox).clear();
    		driver.findElement(userNameTxtBox).sendKeys(username);
     	}
    	
    	public void enterPasswordRegTxtBox(String password) {
    		driver.findElement(passwordTxtBox).clear();
    		driver.findElement(passwordTxtBox).sendKeys(password);
     	}

    	public void LoggedMessageSignIn(String loggedInMsg) {
    		String verifyLogMessage = driver.findElement(loggedInMessage).getText();
    		assertTrue(verifyLogMessage.contains(loggedInMsg));
    	}

    	public String LoggedMessageSignOut(String loggedOutMsg) {
    		String verifyLogMessage = driver.findElement(loggedOutMessage).getText();
    		assertTrue(verifyLogMessage.contains(loggedOutMsg));
    		return verifyLogMessage;
    	}

    	public String invalidUserNameAndPassword(String invalidMsg) {
    		String verifyLogMessage = driver.findElement(invalidMessage).getText();
    		assertTrue(verifyLogMessage.contains(invalidMsg));
    		return verifyLogMessage;
    	}
        
        public String getPopUpMessage() {
            WebElement activeElement = driver.switchTo().activeElement();
            if (activeElement != null) {
                return activeElement.getDomProperty("validationMessage").trim();
            }
            return null;
        }

}


