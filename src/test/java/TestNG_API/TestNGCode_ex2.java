package TestNG_API;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlPackage;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.util.ArrayList;
import java.util.List;

public class TestNGCode_ex2 {

    public void packageTest () {

        List<XmlSuite> suites = new ArrayList<>();
        List<XmlClass> classes = new ArrayList<>();

        XmlSuite suite = new XmlSuite();
        suite.setName("Package suite");

        XmlTest test = new XmlTest(suite);
        test.setName("Package test");

        XmlPackage xmlPackage = new XmlPackage("Annotations");

        List<XmlPackage> packages = new ArrayList<>();
        packages.add(xmlPackage);

        test.setPackages(packages);

        suites.add(suite);
        TestNG tng = new TestNG();
        tng.setXmlSuites(suites);
        tng.run();
    }

    public static void main(String[] args) {
        TestNGCode_ex2 packageTest = new TestNGCode_ex2();

        packageTest.packageTest();
    }


}
