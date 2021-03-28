package tests;

import modificators_example.ModificatorsExample;
import org.junit.jupiter.api.Test;
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
