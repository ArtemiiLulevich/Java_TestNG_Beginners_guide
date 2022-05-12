package Annotations;

import DataProviders.DataProviderClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderClassTest {

    @DataProvider(name="data-provider")
    public Object [][] dataProviderMethod() {
        return new Object[][] {
                {"data one"},
                {"data two"}
        };
    }

    @Test(dataProvider = "data-provider", enabled = false)
    public void testMethod(String data) {
        System.out.println("Data is: " + data);
    }

    @Test(dataProvider = "data-provider2", dataProviderClass = DataProviderClass.class)
    public void testMethodExternalDataProvider(String data) {
        System.out.println("Data is: " + data);
    }

}
