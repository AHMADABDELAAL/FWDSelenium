package Hooks;

import Base.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class hook extends DriverManager {

	@BeforeStep
	public void beforeStep() {
	}

	@AfterStep
	public void afterStep() {
	}

	@Before
	public void beforeScenario(Scenario scenario) {
		log.info("[STARTED] Scenario: " + scenario.getName());
	}

	@After
	public void afterScenario(Scenario scenario) {
		log.info("[ENDED] Scenario: " + scenario.getName());
	}
}
