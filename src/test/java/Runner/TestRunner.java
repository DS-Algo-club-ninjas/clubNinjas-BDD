package Runner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
//@CucumberOptions(
//		features = "src/test/resources/features/ArrayPage.feature",
//		glue= {"StepDefinitions","Hooks"}
//		)

@CucumberOptions(
		plugin = {"pretty", "html:target/bharathi.html"}, //reporting purpose
		monochrome=false,  //console output color
		//tags = "@Sanity or @personalLeave", //tags from feature file
		features = {"src/test/resources/features/ArrayPage.feature"}, //location of feature files
		glue= "StepDefinitions") //location of step definition files


public class TestRunner extends AbstractTestNGCucumberTests {
	
	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
				
		return super.scenarios();
    }

}
