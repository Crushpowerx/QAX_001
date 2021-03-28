package tests;

import java.util.*;

public class ArrayListAndSetExample {

    public static void main(String[] args) {
        ArrayList<String> arrayListExample = new ArrayList<>();
        arrayListExample.add("var1");
        arrayListExample.add("var2");
        arrayListExample.add("var2");
        arrayListExample.add("var3");
        arrayListExample.add("var4");
        arrayListExample.add("var5");
        arrayListExample.add("var5");
        arrayListExample.add("var6");
        System.out.println("arrayListExample with duplicates: " + arrayListExample + "\n");

        Set<String> stringSet = new HashSet<>(arrayListExample);
        arrayListExample.clear();
        arrayListExample.addAll(stringSet);
        arrayListExample.sort(Comparator.naturalOrder());
        System.out.println("arrayListExample with out duplicates: " + arrayListExample + "\n");

        Iterator<String> itr = arrayListExample.iterator();
        while (itr.hasNext()) {
            String itrNext = itr.next();
            System.out.println("element " + itrNext + " will be removed");
            itr.remove();
            System.out.println("arrayListExample with out this element: " + arrayListExample + "\n");
        }

    }

}
