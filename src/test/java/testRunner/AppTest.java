package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@io.cucumber.testng.CucumberOptions(features = {"FeatureFiles"},
monochrome = true,
glue = {"stepDefenitions"}
,plugin = {"pretty","html:target/report/cucumber","json:target/report/cucumber.json"
		,"junit:target/report/cucumber.xml"})
public class AppTest extends AbstractTestNGCucumberTests {

}
