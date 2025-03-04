package common;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class DataProviders {

    @DataProvider(name = "people")
    public Object[][] dataSet3(Method method) {
        if (method.getName().equals("testWithDataProvider4")) {
            return new Object[][]{{"John", "Smith"}
                    , {"Cloe", "Sky"}
                    , {"Benjamin", "Button"}};
        } else {
            return new Object[][]{{"John", "Smith", "27"}
                    , {"Cloe", "Sky", "25"}
                    , {"Benjamin", "Button", "30"}};
        }
    }

}
