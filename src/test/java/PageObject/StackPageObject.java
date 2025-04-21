package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StackPageObject {
  
  
              // WebDriver driver = new ChromeDriver();
                // public void ex() {
	           //  driver.findElement(By.xpath(")
	 
	WebDriver driver;

	    public StackPageObject (WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver,this);
	    }
	   
	               //or we can write below also
	                //By operationsInStack = By.linkText("Operations in Stack");
	             // By implementation = By.linkText("Implementation");
	              //By applications = By.linkText("Applications");
	               //By practiceQuestions = By.linkText("Practice Questions");

	              //public void clickOperationsInStack() {
	                     //driver.findElement(operationsInStack).click();
	                    //}

	            // public void clickImplementation() {
	                 // driver.findElement(implementation).click();
	                // }

	               // public void clickApplications() {
	              //  driver.findElement(applications).click();
	             //}

	               //  public void clickPracticeQuestions() {
	                  // driver.findElement(practiceQuestions).click();
	                    // }
	
	    // Elements initialized using @FindBy annotations
	    
	    @FindBy(linkText ="Operations in Stack")
	     WebElement operationsinstacklink;
	    
	   
	    @FindBy(xpath = "//a[text()='Try here>>>']")
	    WebElement tryhereoperations;
	    
	    @FindBy(xpath ="//button[text()='Run']")
	    WebElement runoperations;
	
	    //---------------------------------------
	    
	    
	    @FindBy(linkText ="Implementation")
	     WebElement implementationlink;
	  
	    @FindBy(xpath ="//a[text()='Try here>>>']")
	    WebElement tryimplementations;
	    
	    @FindBy(xpath ="//button[text()='Run']")
	    WebElement runimplementations;
	    
	    //---------------------------------------

	    @FindBy(linkText ="Applications")
	     WebElement applicationslink;
	    
	    @FindBy(xpath ="//a[text()='Try here>>>']")
	    WebElement tryapplications;
	    
	    @FindBy(xpath ="//button[text()='Run']")
	    WebElement runapplications;
	    
	    
	    //---------------------------------------
	    
	    
	    
	    @FindBy(linkText ="Practice Questions")
	    WebElement practicequestionslink;
	 
	    		
	    // Methods to interact with the elements
	    
	    public void clickoperation () {
	    	operationsinstacklink.click();
	    }
	    	
	    	public void clickimplementation () {
		    	implementationlink.click();	
	    	
	    	}
	    	
	    	public void clickapplications () {
	    		 applicationslink.click();	
	    	
	    	}
	    	

	    	public void clickpracticequestions() {
	    		practicequestionslink.click();
	    	} 
	    	
	    	
	    	public void tryhereoperations() {
	    		tryhereoperations.click();
	    	} 
	    	
	    	public void runopertns() {
	    		runoperations.click();
	    	}
	    	
	    	public void tryherimplemnts() {
	    		 tryimplementations.click();
	    	} 
	    	
	    	public void runimplements() {
	    		runimplementations.click();
	    	}
	    	public void tryhereappli() {
	    		 tryapplications.click();
	    	} 
	    	
	    	public void runapplictns() {
	    		runapplications.click();
	    	}
	    	
	    	public void practicestack() {
	    		 practicequestionslink.click();
	    		 	
	    	}
	    	 
	    	
	    }


 







