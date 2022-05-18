package Dependency.xml;

import org.testng.annotations.Test;

public class SimpleXMLDependencyTest {

    @Test(groups={"dependent-group"})
    public void groupTestOne(){
        System.out.println("Group Test method one");
    }
    @Test(groups={"test-group"})
    public void groupTestTwo(){
        System.out.println("Group test method two");
    }
    @Test(groups={"test-group"})
    public void groupTestThree(){
        System.out.println("Group Test method three");
    }

}
