package CustomListener;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleClassTest {

    @Test
    public void testMethodOne(){
        Assert.assertTrue(true);
    }
    @Test
    public void testMethodTwo(){
        Assert.assertTrue(false);
    }
    @Test(dependsOnMethods={"testMethodTwo"})
    public void testMethodThree(){
        Assert.assertTrue(true);
    }

}
