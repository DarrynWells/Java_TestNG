package ui;

import common.DataSetups;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class LoginTest extends DataSetups {

    @BeforeTest
    public void beforeTest() {
        System.out.println("This executes before the test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("This executes after the test");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Executes before every test method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Executes after every method");
    }

    @Test(priority = 1, description = "This is a login test")
    public void loginTest() {
        System.out.println("Login is successful");
        Assert.assertEquals("Login", "Login");
    }

    @Test(priority = 2)
    public void logoutTest() {
        System.out.println("logout is successful");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(1,2, "Soft Assert");
        softAssert.assertEquals("Login", "Logout", "Verification failed");

        // Reports all the assertions at the end of the testcase
//        softAssert.assertAll();
    }

    @Test(priority = 3)
    @Parameters({"browser"}) // Coming from runner.xml
    public void browserType(String browserType) {
        System.out.println("Browser used is: " + browserType);
    }


}
