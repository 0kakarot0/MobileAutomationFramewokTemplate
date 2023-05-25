package tests;

import org.testng.annotations.Test;
import testBase.PageObjects;

public class ExampleTest extends PageObjects {

    @Test
    public void firstTest() {
        extentReport.createTest("firsttest", "Abc");
        String stepResult = login.click();
        extentReport.logStepResult(stepResult);
    }
}