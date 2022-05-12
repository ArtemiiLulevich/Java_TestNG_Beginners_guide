package Annotations;

import org.testng.annotations.Test;

public class TimeSuiteTest {
    @Test
    public void timeTestOne() throws InterruptedException{
        Thread.sleep(1000);
        System.out.println("Time test method one");
    }
    @Test
    public void timeTestTwo() throws InterruptedException{
        Thread.sleep(400);
        System.out.println("Time test method two");
    }

    @Test(timeOut=200)
    public void timeTestThree() throws InterruptedException{
        Thread.sleep(300);
        System.out.println("Time test method one");
    }
}
