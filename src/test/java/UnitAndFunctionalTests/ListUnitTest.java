package UnitAndFunctionalTests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class ListUnitTest {

    ArrayList<String> listObj = new ArrayList<String>();
    @BeforeClass
    public void beforeClass(){
        listObj.add("Sample-0");
        listObj.add("Sample-1");
        listObj.add("Sample-2");
    }
    @Test
    public void verifyDataBasedOnIndex(){
        String data = listObj.get(0);
        Assert.assertEquals(data, "Sample-0","Data dont match");
    }
    @Test(expectedExceptions=IndexOutOfBoundsException.class)
    public void verifyForWrongIndex(){
        listObj.get(4);
    }
    @Test
    public void verifySize(){
        Assert.assertTrue(listObj.size()==3,"Size dont match");
    }

    @Test
    public void verifyContains() {
        Assert.assertTrue(listObj.contains("Sample-0"), "Doesn't contain.");
    }

    @Test(priority = 2)
    public void verifyClear() {
        listObj.clear();
        Assert.assertEquals(listObj.size(), 0, "Dont clear");
    }

    @Test(priority = 1)
    public void verifyRemove() {
        listObj.remove("Sample-2");
        Assert.assertFalse(listObj.contains("Sample-2"), "Dont remove");
    }

}
