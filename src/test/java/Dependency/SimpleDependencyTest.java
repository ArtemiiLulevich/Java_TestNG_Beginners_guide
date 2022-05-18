package Dependency;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleDependencyTest {

    @Test(dependsOnMethods={"testTwo"})
//    @Test(dependsOnMethods={"testTwo","testThree"})
    public void testOne(){
        System.out.println("Test method one");
    }
    @Test
    public void testTwo(){
        System.out.println("Test method two");
        Assert.fail("fail");
    }

    @Test
    public void testThree(){
        System.out.println("Test method three");
    }

}
