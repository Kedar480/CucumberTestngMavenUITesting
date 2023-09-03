package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		
		features = {"src\\test\\resources\\Features\\login.feature"},//path of the feature file to be executed
		
		glue = {"StepDefinition", "hooks"}, // package name where we have the glue code available
		
		plugin = {"pretty"}
				
	)

public class Runner extends AbstractTestNGCucumberTests {

}
