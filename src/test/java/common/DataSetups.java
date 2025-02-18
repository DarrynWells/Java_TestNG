package common;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DataSetups {

    @BeforeSuite
    public void setup() {
        System.out.println("Perform some system setup");
    }

    @AfterSuite
    public void tearDown() {
        System.out.println("Perform some system tear down");
    }

}
