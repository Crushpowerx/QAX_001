package tests.interfaces;

import org.junit.jupiter.api.Test;

public class InterfaceExampleTest implements InterfaceExample {
    int var4 = 4;

    public int addVar4(int var) {
        return var + var4;
    }

    @Override
    public int getSum(int var1, int var2) {
        return var1 + var2;
    }

    @Override
    public void printSum(int var1, int var2) {
        System.out.println(var1 + var2);
    }

    @Test
    public void runInterfaceExampleTest() {
        System.out.println(addVar3(2));
        System.out.println(addVar4(2));
        System.out.println(InterfaceExample.addVar4(2));
        System.out.println(getSum(2, 2));
        printSum(InterfaceExample.var4, var4);
    }

}
