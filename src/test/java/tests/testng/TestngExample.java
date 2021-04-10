package tests.testng;

import org.testng.annotations.*;

import java.io.IOException;

import static java.lang.Thread.sleep;

public class TestngExample {

    @BeforeSuite(alwaysRun = true)
    public void setUpBeforeSuite() {
        System.out.println("I am setUpBeforeSuite");
    }

    @BeforeTest(alwaysRun = true)
    public void setUpBeforeTest() {
        System.out.println("I am setUpBeforeTest");
    }

    @BeforeClass(alwaysRun = true)
    public void setUpBeforeClass() {
        System.out.println("I am setUpBeforeClass");
    }

    @BeforeMethod(alwaysRun = true)
    public void setUpBeforeMethod() {
        System.out.println("I am setUpBeforeMethod");
    }

    @Test(groups = "TestngExample", priority = 1, expectedExceptions = {IOException.class})
    public void test1() throws IOException {
        System.out.println("I am test1");
//        throw new IOException();
    }

    @Test(groups = "TestngExample", priority = 2, dependsOnMethods = "test1")
    public void test2() {
        System.out.println("I am test2");
    }

    @Test(groups = "TestngExample", priority = 3, invocationCount = 30, invocationTimeOut = 2000)
    public void test3() throws InterruptedException {
        sleep(1000);
        System.out.println("I am test3");
    }

    @Test(groups = "TestngExample", priority = 4)
    public void test4() {
        System.out.println("I am test4");
    }

    @Test(groups = "TestngExample", priority = 6)
    public void test5() {
        System.out.println("I am test5");
    }

    @Test(groups = "urlValidation", priority = 5)
    public void test6group2() {
        System.out.println("I am test6group2");
    }

    @AfterSuite(alwaysRun = true)
    public void setUpAfterSuite() {
        System.out.println("I am setUpAfterSuite");
    }

    @AfterTest(alwaysRun = true)
    public void setUpAfterTest() {
        System.out.println("I am setUpAfterTest");
    }

    @AfterClass(alwaysRun = true)
    public void setUpAfterClass() {
        System.out.println("I am setUpAfterClass");
    }

    @AfterMethod(alwaysRun = true)
    public void setUpAfterMethod() {
        System.out.println("I am setUpAfterMethod");
    }

    //TODO разобраться почему не работает!!!

    @BeforeGroups(groups = "TestngExample", alwaysRun = true)
    public void setUpBeforeGroups() {
        System.out.println("I am setUpBeforeGroups");
    }

    @BeforeGroups("urlValidation")
    public void setUpBeforeGroups2() {
        System.out.println("I am setUpBeforeGroups");
    }

    @AfterGroups(groups = "TestngExample", alwaysRun = true)
    public void setUpAfterGroups() {
        System.out.println("I am setUpAfterGroups");
    }

    @AfterGroups("urlValidation")
    public void setUpAfterGroups2() {
        System.out.println("I am setUpAfterGroups2");
    }

}
