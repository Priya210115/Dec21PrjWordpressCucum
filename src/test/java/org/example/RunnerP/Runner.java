package org.example.RunnerP;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/Priya2020/Documents/Harness/TestProj/cucum21Dec/Dec21PrjWordpressCucum/src/main/java/org/example/Features",glue={"org.example.stepDefination"},
monochrome = true,
plugin= {"html:Reports\\HTMLReports","json:Reports\\JsonReports1\\cucumber.json",
"junit:Reports\\JunitReports\\cucumber.xml"})

public class Runner {
}
