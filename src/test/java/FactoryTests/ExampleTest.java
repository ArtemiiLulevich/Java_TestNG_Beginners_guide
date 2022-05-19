package FactoryTests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ExampleTest {

//    private String param="";
//
//    public ExampleTest(String param){
//        this.param=param;
//    }
//    @BeforeClass
//    public void beforeClass(){
//        System.out.println("Before class executed.");
//    }
//
//    @Test
//    public void testMethod(){
//        System.out.println("The the parameter value is: "+param);
//    }

    private int param;
    public ExampleTest(int param){
        this.param = param;
    }
    @Test(dependsOnMethods={"testMethodTwo"})
    public void testMethodOne(){
        System.out.println("Test method one with param values: "+
                this.param);
    }
    @Test
    public void testMethodTwo(){
        System.out.println("Test method two with param values: "+
                this.param);
    }

}
