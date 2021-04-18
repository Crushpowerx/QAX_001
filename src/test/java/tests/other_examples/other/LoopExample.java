package tests.other_examples.other;

public class LoopExample {
    public static void main(String[] args) {
        loop1();
        loop2();
        loop3();
        loop4();
    }

    public static void loop1() {
        for (int i = 0; i < 10; i++) {
            System.out.println("*");
        }
        System.out.println("\n");
        for (int i = 10; i > 0; i--) {
            System.out.println("i = " + i);
        }
    }

    public static void loop2() {
        int i = 0;
        while (i < 10) {
            System.out.println("Hello!");
            i++;
        }
    }

    public static void loop3() {
        String[] stringArray = new String[]{"a", "b", "c"};
        for (String var : stringArray) {
            System.out.println(var);
        }
    }

    public static void loop4() {
        String[] stringArray = new String[]{"a", "b", "c"};
        int length = stringArray.length;
        for (int i = 0; i < length; i++) {
            System.out.println(stringArray[i]);
        }
    }

}
