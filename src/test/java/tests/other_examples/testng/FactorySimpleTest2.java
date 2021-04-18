package tests.other_examples.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static global.Global.globalCountry;
import static global.Global.resetGlobalVariablesAfterClass;

public class FactorySimpleTest2 {
    String country;

    public FactorySimpleTest2(String country) {
        this.country = country;
    }

    @BeforeMethod
    public void setUp2() {
        globalCountry = country;
    }

    @Test
    public void testMethod3() {
        System.out.println("testMethod3 with country - " + globalCountry);
    }

    @Test
    public void testMethod4() {
        System.out.println("testMethod4 with country - " + globalCountry);
    }

    @AfterClass
    public void tearDownAfterClass() {
        resetGlobalVariablesAfterClass();
    }

}
