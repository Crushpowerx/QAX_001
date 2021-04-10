package tests.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static global.Global.globalCountry;
import static global.Global.resetGlobalVariablesAfterClass;

public class FactorySimplyTest1 {
    String country;

    public FactorySimplyTest1(String country) {
        this.country = country;
    }

    @BeforeMethod
    public void setUp2() {
        globalCountry = country;
    }

    @Test
    public void testMethod1() {
        System.out.println("testMethod1 with country - " + globalCountry);
    }

    @Test
    public void testMethod2() {
        System.out.println("testMethod2 with country - " + globalCountry);
    }

    @AfterClass
    public void tearDownAfterClass() {
        resetGlobalVariablesAfterClass();
    }

}
