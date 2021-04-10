package tests.arrays;

import org.junit.jupiter.api.Test;
import utils.ArrayUtils;

public class ArrayExampleTest extends ArrayUtils {

    @Test
    public void runArrayExampleTest() {
        String[] arrayString = createArray(10);
        fillArray2(arrayString, "value ");
        printArray(arrayString);
    }

}
