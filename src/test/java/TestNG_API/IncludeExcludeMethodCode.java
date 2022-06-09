package TestNG_API;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlInclude;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class IncludeExcludeMethodCode {

    public void includeExcludeTest(){
        List<XmlSuite> suites = new ArrayList<XmlSuite>();
        List<XmlClass> classes = new ArrayList<XmlClass>();
        XmlSuite suite = new XmlSuite();
        suite.setName("Include Exclude Method suite");
        XmlTest test = new XmlTest(suite);
        test.setName("Include Exclude Method test");
//Test class to be included for test execution
        XmlClass clz = new XmlClass("TestNG_API.IncludeExcludeTest");
//Test methods to be included
//        XmlInclude methodOne= new XmlInclude("testMethodOne");
//        XmlInclude methodTwo= new XmlInclude("testMethodTwo");
//        XmlInclude methodThree= new XmlInclude("testMethodThree");
//Creating a list of included methods and adding the methods instances to it
//        List<XmlInclude> includes = new ArrayList<XmlInclude>();
//        includes.add(methodOne);
//        includes.add(methodTwo);
//        includes.add(methodThree);
        List<String> excludes = new ArrayList<String>();
        excludes.add("testMethodThree");
//Setting the included methods for the class
        clz.setExcludedMethods(excludes);
//        clz.setIncludedMethods(includes);

        classes.add(clz);
        test.setXmlClasses(classes);
        suites.add(suite);
        TestNG tng = new TestNG();
        tng.setXmlSuites(suites);
        tng.run();
    }
    public static void main(String[] args){
        IncludeExcludeMethodCode testConfig= new IncludeExcludeMethodCode();
        testConfig.includeExcludeTest();
    }

}
