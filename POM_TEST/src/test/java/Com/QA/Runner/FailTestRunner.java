package Com.QA.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="@target/rerun.txt"
		,glue={"Com.QA.Step_Defination"},
		plugin ={"pretty","html:test-output",
				"rerun:target/rerun.txt" },
		monochrome = true 
			)








public class FailTestRunner {

}
