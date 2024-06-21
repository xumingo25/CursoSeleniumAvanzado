package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)


@CucumberOptions(
        features= "src/test/java/features",
        glue= {"seleniungluecode"},

        plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        snippets = CAMELCASE//,
        //tags = "@Data or ~@Regresion"

)


public class Testrunner {
}
