package myRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="src/test/resources/feature",
//		features="src/test/resources/feature/login.feature",
		glue={"stepdefinition","hooks"},       // only pkgname 
		dryRun=false,   // if only wanr to run feature file to see method are implemented or not
		tags="@all",
			plugin= {"pretty",
				"html:target/Reports/cuucmberHTMLReport.html",
				"json:target/Reports/cucumberReport.json",
				"junit:target/Reports/cucumberReport.xml"})

public class TestRunner {
	
	

}

