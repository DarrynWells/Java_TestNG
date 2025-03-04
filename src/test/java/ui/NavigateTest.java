package ui;

import org.testng.annotations.Test;

@Test(groups = "navigation")
public class NavigateTest {

    @Test(priority = 1, groups = {"regression", "smoke"})
    public void navigateHomePage() {
        System.out.println("Navigate to homepage");
    }

    @Test(priority = 2, groups = {"regression"})
    public void navigateLoginPage() {
        System.out.println("Navigate to LoginPage");
    }

    @Test(priority = 3, enabled = false)
    public void brokenTest() {
        System.out.println("Broken Test");
    }

}
