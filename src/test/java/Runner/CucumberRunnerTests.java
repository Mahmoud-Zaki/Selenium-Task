package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = "src/test/resources/Features/AddDonation.feature",
        glue = "Steps",
        plugin = {})

public class CucumberRunnerTests extends AbstractTestNGCucumberTests {
}