package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//saying run this class using cucumber
@CucumberOptions(
        plugin = {"html:target/cucumberReports", "json:target?report.json"},
        features = "C:\\Users\\Albina\\Desktop\\ChicagoB11cucumberjunit\\src\\test\\resources\\features",
        glue = "steps", //showing the package steps
        tags = "@wikipedia",
        dryRun = false //default is false, this checks if this has implementation if its not there it generates the template
)



public class Runner {
}
