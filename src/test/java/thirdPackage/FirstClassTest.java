package thirdPackage;

import org.testng.annotations.Test;

public class FirstClassTest {

    @Test
    public void firstTest() {
        System.out.printf("Class %s. First test method.\n", FirstClassTest.class);
    }

    @Test
    public void secondTest() {
        System.out.printf("Class %s. Second test method.\n", FirstClassTest.class);
    }
}
