package tests.other_examples.arrays;

import org.testng.annotations.Test;
import utils.ArrayUtils;

public class ArrayExampleTest extends ArrayUtils {

    @Test
    public void runArrayExampleTest() {
        String[] arrayString = createArray(10);
        fillArray2(arrayString, "value ");
        printArray(arrayString);
    }

}
