package tests.arrays;

import java.util.Arrays;

public class ArrayExample2 {
    public static void main(String[] args) {
        String[][] arrayString2 = new String[2][2];
        arrayString2[0][0] = "value 0";
        arrayString2[0][1] = "value 1";
        arrayString2[1][0] = "value 2";
        arrayString2[1][1] = "value 3";
        for (String[] s1 : arrayString2) {
            for (String s2 : s1) {
                System.out.println(s2);
            }
        }
        System.out.println(Arrays.deepToString(arrayString2));
    }
}
