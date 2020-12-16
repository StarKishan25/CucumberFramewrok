package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)

@CucumberOptions(
	features="C:/Users/Star Kishan/eclipse-workspace/CucmberFramework/src/main/java/Features/login.feature",
	glue = "StepDefinitions", //path of step def file
	//plugin = { "pretty","html:C:/Users/Star Kishan/eclipse-workspace/CucmberFramework/target/Output report.html" },
	format = {"pretty","html:C:/Users/Star Kishan/eclipse-workspace/CucmberFramework/target/Output report.html"},
	monochrome = true, //displays the console o/p in readable format
	strict = true, // it checks any steps is not defined in step def file
	dryRun = true //checks all steps have step def or not

)

public class TestRunner {

}

