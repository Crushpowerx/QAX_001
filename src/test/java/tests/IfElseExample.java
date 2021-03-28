package tests;

public class IfElseExample {

    public static void main(String[] args) {
        String var6 = null;
        String var7 = "";
        int var3 = 18;
        int var4 = 19;
        System.out.println(checkForNull(var6));
        System.out.println(checkForNull(var7));
        System.out.println(checkAge1(var3));
        System.out.println(checkAge1(var4));
        System.out.println(checkAge2(var3));
        System.out.println(checkAge2(var4));
    }

    public static boolean checkForNull(String text) {
        return text == null;
    }

    public static boolean checkAge1(int age) {
        if (age == 18) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkAge2(int age) {
        return age == 18;
    }

}
