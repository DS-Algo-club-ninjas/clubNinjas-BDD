package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StackPageObject {
 
             
	        WebDriver driver;
                    
	                By dropdownstack =By.linkText("stack");
	                By operationsInStack = By.linkText("Operations in Stack");
	                By Tryhere = By.linkText("Try here");
	                By printoperations = By.id("//div[@class='CodeMirror cm-s-default']");
	                By runoperations =By.xpath("//button[text()='Run']");
	                
	                By implementation = By.linkText("Implementation");
	                By Tryhereimple = By.linkText("/TryEditor");
	                By printimple = By.id("//div[@class='CodeMirror cm-s-default']");
	                By runimple = By.xpath("//button[text()='Run']");
	               
	                By applications = By.linkText("Applications");
	                By Tryhereapplications = By.linkText("/TryEditor");
	    	        By printapplications = By.id("//div[@class='CodeMirror cm-s-default']");
	    	        By runapplications= By.xpath("//button[text()='Run']");
	                
	    	        By practiceQuestions = By.linkText("Practice Questions");

	    	        public void dropdownstack1 () {
	    	        	driver.findElement(dropdownstack).click();
	    	        }
	                public void clickOperationsInStack() {
	                  driver.findElement(operationsInStack).click();
	                    }
	                
	                public void clickTryhere() {
                      driver.findElement(Tryhere).click();
                    }
	                
	                public void  printhello() {
	                	driver.findElement(printoperations).sendKeys("print(Hello,World!)");
	                	 
	                	   //System.out.println("Output from the editor: " + result);
	                 }
	                 
	                 public void runopertns() {
	                	 driver.findElement(runoperations).click();
	                 }
	                 

	                 
	               public void clickImplementation() {
	                  driver.findElement(implementation).click();
	               }
	                
	               public void clicktryhereimple() {
	                	driver.findElement(Tryhereimple).click();
	                }
	               
	               public void  printhello1() {
	                	driver.findElement(printoperations).sendKeys("print(Hello,World!)");
	 	                 }
	               
	               
	               public void clickapplicatio () {
	                	 driver.findElement(applications).click();
	                 }    

	                public void clicktryhereApplications() {
	                  driver.findElement(Tryhereapplications).click();
	             }
	                
	                public void  printhello2() {
	                	driver.findElement(printoperations).sendKeys("print(Hello,World!)");
	 	                 }
	                public void runapplication() {
	                	 driver.findElement(runapplications).click();
	                 }

	                
	                 public void clickPracticeQuestions() {
	                   driver.findElement(practiceQuestions).click();
	                    }
	

	    	}
	    	 
	    	
	    


 







