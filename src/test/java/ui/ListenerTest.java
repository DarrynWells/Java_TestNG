package ui;

import org.testng.annotations.Test;

public class ListenerTest {

    @Test(priority = 1, description = "This is a test using a listener")
    public void testUsingListener() throws Exception {
        System.out.println("Forcing failure to execute OnFailure listener");
        throw new Exception();
    }

}
