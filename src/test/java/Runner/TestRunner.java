package Runner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)

@CucumberOptions(
		plugin = {"pretty", "html:target/dsAlgo.html","json:target/dsAlgo.json",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" , 
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"com.aventstack.chaintest.plugins.ChainTestCucumberListener:"}, //reporting purpose
		monochrome=false,  //console output color
		//tags = "@RunThis",// "@Sanity or @personalLeave", //tags from feature file
		features = {"src/test/resources/features/RegisterPage.feature"}, //location of feature files
		glue= {"StepDefinitions", "Hooks"}) //location of step definition files


public class TestRunner extends AbstractTestNGCucumberTests {
	
	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
				
		return super.scenarios();
    }

}