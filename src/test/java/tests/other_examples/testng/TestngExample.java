package tests.other_examples.testng;

import listeners.CustomListener;
import org.testng.Assert;
import org.testng.annotations.*;

import static java.lang.Thread.sleep;

@Listeners(CustomListener.class)
public class TestngExample {

    @BeforeSuite(alwaysRun = true)
    public void setUpBeforeSuite() {
        System.out.println("I am setUpBeforeSuite");
    }

    @BeforeTest(alwaysRun = true)
    public void setUpBeforeTest() {
        System.out.println("I am setUpBeforeTest");
    }

    //TODO аннотации BeforeGroups и AfterGroups начиная с версии TestNG 7.1.0 и выше работают только при запуске через
    // xml файл с обязательным указанием какие группы должны быть включены в фильтр

    @BeforeGroups("TestngExample")
    public void setUpBeforeGroups() {
        System.out.println("I am setUpBeforeGroups TestngExample");
    }

    @BeforeGroups("urlValidation")
    public void setUpBeforeGroups2() {
        System.out.println("I am setUpBeforeGroups urlValidation");
    }

    @BeforeClass(alwaysRun = true)
    public void setUpBeforeClass() {
        System.out.println("I am setUpBeforeClass");
    }

    @BeforeMethod(alwaysRun = true)
    public void setUpBeforeMethod() {
        System.out.println("I am setUpBeforeMethod");
    }

    @Test(groups = "TestngExample", priority = 2, dependsOnMethods = "test1")
    public void test2() {
        System.out.println("I am test2");
        Assert.assertEquals(2, 2);
        if (2 != 2) {
            Assert.fail("O, no!!! 2 != 2");
        }
    }

    @Test(groups = "TestngExample", priority = 3)
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

    @AfterGroups("TestngExample")
    public void setUpAfterGroups() {
        System.out.println("I am setUpAfterGroups TestngExample");
    }

    @AfterGroups("urlValidation")
    public void setUpAfterGroups2() {
        System.out.println("I am setUpAfterGroups urlValidation");
    }

}
