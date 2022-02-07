package runners;

import io.cucumber.junit.*;
import org.junit.runner.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@amazonSearch",
        dryRun = false //You write true here first to see if there is a missing step/
        // method in the stepdefinition. After
        // everything is complete, change it to false to start the testing.
)

public class Runner {

}
