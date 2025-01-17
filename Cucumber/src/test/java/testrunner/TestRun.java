package testrunner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions
   (
	features="./Feature/Loginpage.feature",
	glue="stepdefinations",
	monochrome=true,
	dryRun=true,
	plugin={"pretty","html:target/cucumber"}
    )
	
public class TestRun { 
}
