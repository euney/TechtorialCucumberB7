package runner.etsy;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = {"steps/com/etsy", "steps/Hooks"},
        dryRun = false,
        tags = "@outline"

)


public class EtsyRunner {

}
