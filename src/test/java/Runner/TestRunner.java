package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/ArrayPage.feature",
		glue= {"StepDefinitions","Hooks"}
		)

public class TestRunner {

}
