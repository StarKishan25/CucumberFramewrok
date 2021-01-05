package Runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import Base.JVMreport;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)

@CucumberOptions(
	features="C:/Users/Star Kishan/eclipse-workspace/CucmberFramework/src/main/java/Features/login.feature",
	glue = "StepDefinitions", //path of step def file
	//plugin = { "pretty","html:C:/Users/Star Kishan/eclipse-workspace/CucmberFramework/target/Output report.html" },
//	format = {"pretty","html:C:/Users/Star Kishan/eclipse-workspace/CucmberFramework/target/Output report.html"},
	monochrome = true, //displays the console o/p in readable format
	strict = true, // it checks any steps is not defined in step def file
	dryRun = true, //checks all steps have step def or not
	plugin = { "pretty","json:C:/Users/Star Kishan/eclipse-workspace/CucmberFramework/JVM/ramk.json"},
	snippets = SnippetType.CAMELCASE	

)

public class TestRunner {
	
	@AfterClass
	public static void afterclass() {
			JVMreport.generateJVMreport("C:/Users/Star Kishan/eclipse-workspace/CucmberFramework/JVM/ramk.json");
	}
	
}

