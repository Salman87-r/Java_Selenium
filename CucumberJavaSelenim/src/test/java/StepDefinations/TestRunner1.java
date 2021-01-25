package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/FeaturesTags",
glue= {"StepDefinations"},tags= "@smoke and @regression")
public class TestRunner1 {

}
