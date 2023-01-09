package Runner;

import Base.CutomizeTestNGCucmberRunner;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = "src/test/resources/Feature",
		glue = { "stepDef", "Hooks" },
		plugin = { "pretty",
				"html:build/test-results/html-report.html",
				"json:build/test-results/json-report.json"}
)

public class Runner extends CutomizeTestNGCucmberRunner {

}
