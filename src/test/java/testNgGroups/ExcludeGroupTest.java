package testNgGroups;

import org.testng.annotations.Test;

public class ExcludeGroupTest {
    @Test(groups={"include-group"})
    public void testMethodOneInclude(){
        System.out.println("Test method one belonging to group.");
    }
    @Test(groups={"include-group"})
    public void testMethodTwoInclude(){
        System.out.println("Test method two belonging to a group.");
    }
    @Test(groups={"include-group","exclude-group"})
    public void testMethodThreeIncludeExclude(){
        System.out.println("Test method three belonging to two groups.");
    }
}
