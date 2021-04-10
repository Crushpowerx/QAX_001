package tests.other;

import static tests.other.NonStaticExample.getSumStatic;

public class NonStaticExample2 {

    public void printSum() {
        System.out.println(getSumStatic(2, 2));
    }

    public void printSum2() {
        NonStaticExample nonStaticExample = new NonStaticExample();
        System.out.println(nonStaticExample.getSumNonStatic(2, 2));
    }

}
