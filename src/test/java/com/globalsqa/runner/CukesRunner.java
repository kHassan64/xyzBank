package com.globalsqa.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
        features = "src/test/resources/features",
        glue = "com/globalsqa",
        tags = "@Deposit"
)
public class CukesRunner extends AbstractTestNGCucumberTests {

}
