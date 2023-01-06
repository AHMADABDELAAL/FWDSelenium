package Runner;

import Base.CutomizeTestNGCucmberRunner;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "src/test/resources/Feature",
		glue = { "stepDef", "Hooks" }
		)

public class Runner extends CutomizeTestNGCucmberRunner {

}
