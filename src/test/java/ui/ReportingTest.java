package ui;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportingTest {

    @Test(priority = 1)
    public void test1() {
        System.out.println("Test 1");
        Reporter.log("Test 1 TestNG Report");
    }

    @Test(priority = 2)
    public void test2() {
        System.out.println("Test 2");
        Reporter.log("Test 2 TestNG Report");
    }


}
