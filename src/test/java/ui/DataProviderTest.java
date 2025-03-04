package ui;

import common.DataProviders;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @Test(dataProvider = "dataSet")
    public void testWithDataProvider(String username, String password) {
        System.out.println(username + ": " + password);
    }

    @DataProvider
    public Object[][] dataSet() {
        Object[][] dataSet= new Object[4][2];
        dataSet[0][0] = "user1";
        dataSet[0][1] = "password1";
        dataSet[1][0] = "user2";
        dataSet[1][1] = "password2";
        dataSet[2][0] = "user3";
        dataSet[2][1] = "password3";
        dataSet[3][0] = "user4";
        dataSet[3][1] = "password4";
        return dataSet;
    }

    @Test(dataProvider = "customName")
    public void testWithDataProvider2(String username, String password, String test) {
        System.out.println(username + ": " + password + ": " + test);
    }

    @DataProvider(name = "customName")
    public Object[][] dataSet2() {
        return new Object[][] {{"username", "password", "test"}
                ,{"username2", "password2", "test2"}
                ,{"username3", "password3", "test3"}};
    }

    @Test(dataProvider = "people", dataProviderClass = DataProviders.class)
    public void testWithDataProvider3(String firstname, String surname, String age) {
        System.out.println(firstname + ": " + surname + ": " + age);
    }

    @Test(dataProvider = "people", dataProviderClass = DataProviders.class)
    public void testWithDataProvider4(String firstname, String surname) {
        System.out.println(firstname + ": " + surname);
    }

}
