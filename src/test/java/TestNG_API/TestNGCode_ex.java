package TestNG_API;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.util.ArrayList;
import java.util.List;

public class TestNGCode_ex {

    public void simpleTestNGTest(){
//List of xml suites to be considered for test execution
        List<XmlSuite> suites = new ArrayList<>();
//List of classes to be considered for test execution
        List<XmlClass> classes = new ArrayList<>();
//Defines a simple xml suite with a name
        XmlSuite suite = new XmlSuite();
        suite.setName("Simple Config suite");
//Defines a xml test for a suite and with a said name
        XmlTest test = new XmlTest(suite);
        test.setName("Simple config test");
//A single xml class to be considered for execution
        XmlClass clz = new XmlClass("TestNG_API.SampleTestNgCodeTest");
        classes.add(clz);
//Sets the list of classes to be considered for execution for a test
        test.setXmlClasses(classes);

        List<XmlClass> classes1 = new ArrayList<>();
        XmlTest test1 = new XmlTest(suite);
        test1.setName("My own test");
        XmlClass clz1 = new XmlClass("Annotations.TestClass");
        classes1.add(clz1);
        test1.setXmlClasses(classes1);

//Adds a single suite to the list suites
        suites.add(suite);
//Defining a testng instance
        TestNG tng = new TestNG();
//Sets the List of xml suites to be considered for execution
        tng.setXmlSuites(suites);
//Runs the configured testng tests.
        tng.run();

    }

    public static void main(String[] args){
        TestNGCode_ex smpCd= new TestNGCode_ex();
        smpCd.simpleTestNGTest();
    }

}
