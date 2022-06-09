package TestNG_API;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.util.ArrayList;
import java.util.List;

public class includeExcludeGroupCode {

    public void includeExcludeTest(){
        List<XmlSuite> suites = new ArrayList<XmlSuite>();
        List<XmlClass> classes = new ArrayList<XmlClass>();
        XmlSuite suite = new XmlSuite();
        suite.setName("Include Exclude Group suite");
        XmlTest test = new XmlTest(suite);
        test.setName("Include Exclude Group test");
        XmlClass clz = new XmlClass("TestNG_API.IncludeExcludeGroupTest");
                classes.add(clz);
        test.setXmlClasses(classes);
//Including and excluding groups
        test.addIncludedGroup("group-one");
        test.addExcludedGroup("group-two");
        suites.add(suite);
        TestNG tng = new TestNG();
        tng.setXmlSuites(suites);
        tng.run();
    }

    public static void main(String[] args){
        includeExcludeGroupCode testConfig = new includeExcludeGroupCode();
        testConfig.includeExcludeTest();
    }

}
