package ui;

import org.testng.annotations.Test;

public class RetryTest2 {

    // The same as Retry test 1 but there is no need to specify retry method. Instead RetryListener will be used
    @Test()
    public void testRetryFailureTwo() throws Exception {
        System.out.println("Forcing failure");
        throw new Exception();
    }

}
