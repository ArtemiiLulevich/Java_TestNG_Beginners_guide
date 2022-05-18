package Dependency;

import org.testng.annotations.Test;

public class InheritedDependencyTest extends SimpleDependencyTest{
    @Test(dependsOnMethods={"testOne"})
    public void testFour(){
        System.out.println("Test four method in Inherited test");
    }
    @Test
    public void testFive(){
        System.out.println("Test five method in Inherited test");
    }
    //dc21f5cddddf72ec30d8f2a71b38bc4fca4517e0
}
