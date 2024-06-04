package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//dryRun = true it is a feature in the @CucumberOptions to run the tests in dry mode
@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\Features",
glue= "Steps"
,tags = "@test1",
plugin={"pretty","html:target/First.html"})



public class runner { 
	
	
}



