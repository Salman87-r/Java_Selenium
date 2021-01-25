package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="Feature/Cammandline.feature",glue= {"TestRunnercammand"},
plugin = {"json:target/cucumber.json"},
monochrome = true)
public class TestRunner {

}
