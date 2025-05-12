package Utilities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import DriverFactory.DriverFactory;

public class TryEditor {
	WebDriver driver= DriverFactory.getDriver();
	
	By tryHere_btn = By.linkText("Try here>>>");
	By run_btn = By.xpath("//button");
	By tryHereEditor_box = By.xpath("//textarea[@autocorrect='off']");
	By tryHereEditor_output = By.id("output");
	
	public String get_currentPageTitle() {
		String currentTitle = driver.getTitle();
		return currentTitle;
	}
//	
//	public void click_tryHere_btn() {
//		driver.findElement(tryHere_btn).click();
//	}
//	
//	public void enterCodeTryEditor(String pythonCode) {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		JavascriptExecutor js = (JavascriptExecutor)driver;		
//		for (int i = 0; i < 2; i++) {
//		    try {
//		    	WebElement tryHereEditor = driver.findElement(tryHereEditor_box);
//		    	tryHereEditor.sendKeys(Keys.CONTROL + "a");
//				tryHereEditor.sendKeys(Keys.DELETE);
//				js.executeScript(
//			            "document.querySelector('.CodeMirror').CodeMirror.setValue(arguments[0]);",
//			            pythonCode
//			        );
//		        break;
//		    } catch (Exception e) {
//		    	try {
//		        wait.until(ExpectedConditions.visibilityOfElementLocated(tryHereEditor_box));
//		    	}
//		    	catch (Exception e1) {
//		    		e1.printStackTrace();
//		    	}
//		    }
//		}
//	}
//	
//	public String get_tryHereEditor_output() {
//		String output = "";
//		try {
//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(tryHereEditor_output));
//		output = driver.findElement(tryHereEditor_output).getText();
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		return output;
//	}
//	
//	public String acceptAlert(String errorMsg) {
//		String alertMsg = "";
//		try {
//			Alert alert = driver.switchTo().alert();
//			alertMsg = alert.getText();
//			alert.accept();
//			//Assert.assertTrue(alertMsg.contains(errorMsg));
//		} catch (NoAlertPresentException e) {
//			//Assert.fail("No Alert found");
//			e.printStackTrace();
//		}
//		catch (UnhandledAlertException e) {
//			System.out.println("Unhandled alert exception: " + e.getMessage());
//		}
//		return alertMsg;
//	}
//	
	
}
