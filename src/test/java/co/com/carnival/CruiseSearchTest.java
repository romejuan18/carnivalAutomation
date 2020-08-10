package co.com.carnival;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    plugin = {"pretty"},
    features = "src/test/resources/co/com/carnival/features/search_cruise.feature",
    glue = {"com.definitions"},
    tags = {"@CarnivalTest"})
public class CruiseSearchTest {}
