package DataProviders;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

    @DataProvider(name = "data-provider2")
    public static Object[][] externalDataProvider() {
        return new Object[][] {
                {"data one"},
                {"data two"}
        };
    }


}


