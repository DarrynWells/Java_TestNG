package ui;

import common.Retry;
import org.testng.annotations.Test;

public class RetryTest {

    @Test(priority = 1, retryAnalyzer = Retry.class)
    public void testRetryFailure() throws Exception {
        System.out.println("Forcing failure");
        throw new Exception();
    }

}
