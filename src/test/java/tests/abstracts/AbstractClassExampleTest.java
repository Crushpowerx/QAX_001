package tests.abstracts;

import org.junit.jupiter.api.Test;

public class AbstractClassExampleTest extends AbstractClassExample {

    @Test
    public void runAbstractClassExampleTest() {
        System.out.println(getSum(2, 2));
        System.out.println(getSum(3, 3));
        printSum(2, 4);
    }

    @Override
    int getSum(int var1, int var2) {
        return var1 + var2;
    }

}
