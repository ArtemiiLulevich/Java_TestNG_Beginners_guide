package Annotations;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
    /**
     * Following method takes one parameter as input. Value of the
     * said parameter is defined at suite level.
     */
    @Parameters({ "suite-param" })
    @Test
    public void parameterTestOne(String param) {
        System.out.println("Test one suite param is: " + param);
    }
    /**
     * Following method takes one parameter as input. Value of the
     * said parameter is defined at test level.
     */
    @Parameters({ "test-two-param" })
    @Test
    public void parameterTestTwo(String param) {
        System.out.println("Test two param is: " + param);
    }
    /**
     * Following method takes two parameters as input. Value of the
     * test parameter is defined at test level. The suite level
     * parameter is overridden at the test level.
     */
    @Parameters({ "suite-param", "test-three-param" })
    @Test
    public void parameterTestThree(String param,
                                  String paramTwo) {
        System.out.println("Test three suite param is: " + param);
        System.out.println("Test three param is: " + paramTwo);
    }

    @Parameters({"optional-value"})
    @Test
    public void optionTest(@Optional("optional value")
                                   String value){
        System.out.println("This is: "+value);
    }

    @Parameters({"suite-param", "test-four-param"})
    @Test
    public void twoParametersTest(String value1,
                                  @Optional("bla bla") String value2) {
        System.out.printf("Value1 is: %s\nValue2 is: %s\n", value1, value2);
    }
}
