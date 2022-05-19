package FactoryTests;

import org.testng.annotations.Factory;

public class FactoryExampleTest {

//    @Factory
//    public Object[] factoryMethod(){
//        return new Object[]{
//                new ExampleTest("one"),
//                new ExampleTest("two")
//        };
//    }

    @Factory
    public Object[] factoryMethod(){
        return new Object[]{
                new ExampleTest(1),
                new ExampleTest(2)
        };
    }

}
