package FactoryTests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class DataProviderTest {

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class executed");
    }

    @Test(dataProvider="dataMethod", dependsOnMethods = "testMethodTwo")
    public void testMethod(String param){
        System.out.println("The parameter value is: "+param);
    }

    @Test
    public void testMethodTwo() {
        System.out.println("Blablabal");
    }

    @DataProvider
    public Object[][] dataMethod(){
        return new Object[][]{
                {"one"},
                {"two"}
        };
    }

}
