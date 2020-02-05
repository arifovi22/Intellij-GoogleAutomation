

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"CucumberFeature"},
        glue={"cucumberStepsDeffinations"},
        plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports"},
        strict = true,

        monochrome=true,

        tags={"@Test1,@Test2"})




public class CucumberRun extends AbstractTestNGCucumberTests  {
}
