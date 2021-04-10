package tests.inheritance;

import modificators_example.ModificatorsExample;
import org.testng.annotations.Test;
import tests.arrays.ArrayExampleTest;
import utils.ArrayUtils;

public class InheritanceExample extends ModificatorsExample {
    ArrayUtils arrayUtils = new ArrayExampleTest();

    @Test
    public void runArrayExampleTest() {
        String[] arrayString = arrayUtils.createArray(10);
        arrayUtils.fillArray2(arrayString, "value " + var1 + var3);
        arrayUtils.printArray(arrayString);
    }

}
