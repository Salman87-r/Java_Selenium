package StepDefinations;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/Features/LoginFeature.feature",glue= {"StepDefinations"},
monochrome=true ,
plugin={"pretty","junit:target/JunitReports/report.xml",
		"json:target/Json/report.json",
		"html:target/Html/HtmlReports"})

public class TestRunner {

}
