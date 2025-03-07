package TestRun;
 
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions
(
features= {"src/test/java/Features"},
glue= {"StepDef","Hooks"},
dryRun=false,
monochrome=true,
plugin= {"pretty","json:target/cucumber-reports/Cucumber.json"}
)
 
public class TestRun {
 
}
