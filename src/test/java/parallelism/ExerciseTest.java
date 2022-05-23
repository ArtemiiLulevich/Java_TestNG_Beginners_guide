package parallelism;

import org.testng.annotations.*;

public class ExerciseTest {

    @BeforeClass
    public void beforeMethod(){
        long id = Thread.currentThread().getId();
        System.out.println("Before class-method. Thread id is: "+id);
    }

    @Test(threadPoolSize=3, invocationCount=6, timeOut=1000)
    public void testMethod(){

        long id = Thread.currentThread().getId();
        System.out.println("Test method executing on thread with id:"+id);

    }

    @AfterClass
    public void afterMethod(){
        long id = Thread.currentThread().getId();
        System.out.println("After class-method. Thread id is: "+id);
    }


}
