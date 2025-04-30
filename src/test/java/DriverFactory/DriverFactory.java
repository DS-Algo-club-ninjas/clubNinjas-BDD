package DriverFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utilities.ConfigFileReader;

public class DriverFactory {
	
static WebDriver driver;
	
	public static WebDriver createDriver() {
		ConfigFileReader ConfigFileReader = new ConfigFileReader();
		String browser = ConfigFileReader.getBrowser();
		if (driver==null) {
		switch (browser) {	    
        case "chrome" : 
        	driver = new ChromeDriver();
	    	break;
        case "firefox" : 
        	driver = new FirefoxDriver();
    		break;
        case "edge" : 
        	driver = new EdgeDriver();
    		break;
        default:
            throw new RuntimeException("Unsupported webdriver: " + driver);
        }	
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		//System.out.println("driver in create driver " +driver);
		return driver;
	}
	
	public static WebDriver getDriver() {
		if(driver == null) driver = createDriver();
		return driver;
	}

	public static void quitDriver() {
		driver.quit();
		driver=null;
		
	}


}
