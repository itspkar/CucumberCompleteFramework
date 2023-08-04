package testRunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src//test//resources//featureFiles//EbayfirstScenario.feature",
		glue = "stepDefinations"
)

public class TestRunner {

}
