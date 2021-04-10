package tests.arrays;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            stringArrayList.add("value " + i);
        }

        for (String s : stringArrayList) {
            System.out.println(s);
        }
        System.out.println("\n");

        for (int i = 0; i < 10; i++) {
            stringArrayList.add("value " + i);
        }

        for (String s : stringArrayList) {
            System.out.println(s);
        }

    }

}
