package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/com.weborder/CucumberString.feature"},
        glue = "steps/com",
        dryRun = false


)

public class cukesRunner {





}
