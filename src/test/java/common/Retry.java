package common;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
    private int retryCount = 1;
    private static final int maxRetryCount = 3;

    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            System.out.println("Retrying test attempt: " + retryCount);
            retryCount++;
            return true;
        }
        return false;
    }
}
