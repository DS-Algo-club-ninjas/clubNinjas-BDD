package Hooks;

import org.openqa.selenium.WebDriver;

import DriverFactory.DriverFactory;
import Utilities.ConfigFileReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	private static WebDriver driver;
	ConfigFileReader configFileReader = new ConfigFileReader();

	@Before
	public void setup() {
		String browser = ConfigFileReader.getBrowser();
		
		if (browser != null) {
			browser = ConfigFileReader.getBrowser();
			//System.out.println("brower null in hooks setup");
			driver = DriverFactory.createDriver();
			driver.get(ConfigFileReader.getDSAlgoURL());
			//System.out.println("driver.get(url) in hooks");
		} 
	}
	
	@After
	public static void teardown() throws Throwable {
		if (driver != null) {
			DriverFactory.quitDriver();
			//System.out.println("quit driver in teardown hooks");
		}
	}

}
