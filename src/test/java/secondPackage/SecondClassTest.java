package secondPackage;

import firstPackage.FirstClassTest;
import org.testng.annotations.Test;

public class SecondClassTest {

    @Test
    public void firstTest() {
        System.out.printf("Class %s. First test method.\n", SecondClassTest.class);
    }

    @Test
    public void secondTest() {
        System.out.printf("Class %s. Second test method.\n", SecondClassTest.class);
    }
}
