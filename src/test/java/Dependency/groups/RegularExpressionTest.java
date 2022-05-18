package Dependency.groups;

import org.testng.annotations.Test;

public class RegularExpressionTest {
    @Test(dependsOnGroups={"starts-with.*", "ends.*"})
    public void regularExpMethod(){
        System.out.println("Dependent method");
    }
    @Test(groups={"starts-with-one"})
    public void startsWithMethodOne(){
        System.out.println("Starts with method one");
    }
    @Test(groups={"starts-with-two"})
    public void startsWithMethodTwo(){
        System.out.println("Starts with method two");
    }


    @Test(groups={"ends-with-one"})
    public void startsWithMethodThree(){
        System.out.println("Starts with method 3");
    }
    @Test(groups={"ends-with-two"})
    public void startsWithMethodFour(){
        System.out.println("Starts with method 4");
    }

}
