package tests.base;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    public void onTestStart(ITestResult result) {
        System.out.printf("Test started:  %s \n", result.getName());
    }

    public void onTestSuccess(ITestResult result) {

        System.out.printf("Test success:  %s \n", result.getName());
    }

    public void onTestFailure(ITestResult result) {
        //TODO Make screenshot
        System.out.printf("Test failed:  %s \n", result.getName());
    }

}
