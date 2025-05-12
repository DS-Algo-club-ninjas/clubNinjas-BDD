package Runner;

import java.io.IOException;
import java.util.logging.Logger;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import Utilities.*;

@CucumberOptions(

		features = "src/test/resources/features/RegisterPage.feature",
		glue = { "StepDefinitions", "Hooks" },
		monochrome = true,
		plugin = { "pretty", "html:target/dsAlgo.html","json:target/dsAlgo.json",
						"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" , 
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						"com.aventstack.chaintest.plugins.ChainTestCucumberListener:"}
				//reporting purpose,
						 )
public class TestRunnerCrossBrowser extends AbstractTestNGCucumberTests {
	@BeforeClass
	@Parameters({ "browser" })
	public void defineBrowser(@Optional("chrome") String browser) throws IOException {
				
		CrossBrowserReader.setBrowserType(browser);
		LoggerLoad.info("Print Browser value:" +browser);
	}

	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {

		return super.scenarios();
	}


}
