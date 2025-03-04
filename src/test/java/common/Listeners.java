package common;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Testcase is starting...");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("On Test Failure running...");
    }
}
