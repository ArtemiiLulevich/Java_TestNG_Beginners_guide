package FactoryTests;

import org.testng.annotations.Factory;

public class ParameterFactoryTest {

    @Factory
    public Object[] paramFactory(){
        return new Object[]{
                new ParameterTest(0),
                new ParameterTest(1)
        };
    }

}
