package Runner;

import Base.CutomizeTestNGCucmberRunner;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "src/test/resources/Feature/FWD.feature",
		glue = { "stepDef", "Hooks" }
		)

public class Runner extends CutomizeTestNGCucmberRunner {

}
