package Hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import DriverFactory.DriverFactory;
import Utilities.ConfigFileReader;
import Utilities.CrossBrowserReader;
import Utilities.LoggerLoad;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	private static WebDriver driver;
	ConfigFileReader configFileReader = new ConfigFileReader();

	@Before
	public void setup() {
		String browser = ConfigFileReader.getBrowser();//Should comment this line to execute without crossbrowser 
		//String browser = CrossBrowserReader.getBrowserType();//Should Uncomment this line for Crossbrowser testing
		
		LoggerLoad.info("Print the browser in hooks:" +browser);
		if (browser != null) {
			DriverFactory.createDriver(browser);
			DriverFactory.getDriver().get(ConfigFileReader.getDSAlgoURL());
		} 
		else {
			throw new RuntimeException("Browser not defined");
		}
	}
	
	@After
	public static void teardown(Scenario scenario) throws Throwable {
		driver = DriverFactory.getDriver();
		if (scenario.isFailed()) {
			LoggerLoad.error("Steps failed. Taking Screenshot");
		    byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		    scenario.attach(screenshot, "image/png", "screenshot");
		}
		
		if (driver != null) {
			DriverFactory.quitDriver();
		}
	}

}
