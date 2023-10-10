package testRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features", glue="stepDefinitions", monochrome= true, tags= "@tag1")

public class TestRunner extends AbstractTestNGCucumberTests {

}
