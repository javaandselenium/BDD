package testscripts;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="./src/test/resources/testcase1.feature",
glue= {"StepDefinitions"})
public class Login {

}
