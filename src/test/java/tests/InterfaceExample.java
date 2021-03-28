package tests;

public interface InterfaceExample {
    int var3 = 2;
    int var4 = 2;

    int getSum(int var1, int var2);

    void printSum(int var1, int var2);

    default int addVar3(int var) {
        return var + var3;
    }

    static int addVar4(int var) {
        return var + var4;
    }

}
