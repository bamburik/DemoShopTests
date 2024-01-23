package com.bamburov.tests;

import com.bamburov.steps.Steps;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import java.io.ByteArrayInputStream;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.screenshot;

public class BaseTest {
    protected static Steps steps;

    @BeforeSuite(alwaysRun = true)
    public static void beforeAll() {
        steps = new Steps();
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            Allure.addAttachment("Screen", new ByteArrayInputStream(screenshot(OutputType.BYTES)));
        }
        closeWebDriver();
    }

    protected static Steps Do() {
        return steps;
    }
}
