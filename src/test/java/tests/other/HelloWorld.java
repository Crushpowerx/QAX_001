package tests.other;

public class HelloWorld {

    public static void main(String[] args) {
        String helloWorld = "Hello world ";
        Long var3Long = 123L;
        float var4Float = 123.1f;
        double var5Double = 123.11d;
        boolean condition = false;
        String var6 = null;
        String var7 = "";
        String var8 = "null2";
        String conditionAsString = String.valueOf(condition);
        String var3String = String.valueOf(var3Long);
        String var4String = String.valueOf(var4Float);
        String var5String = String.valueOf(var5Double);
        int var1Integer = 1;
        String var1String = String.valueOf(var1Integer);
        String var2String = "12345";
        int var2Integer = Integer.parseInt(var2String);
        printText(helloWorld + var1String + " " + var2Integer + " !!!");
        printText(var3String);
        printText(var4String);
        printText(var5String);
        printText(conditionAsString);
        printText(var6);
        printText(String.valueOf(var7.isEmpty()));
        printText(var8);
    }

    public static void printText(String text) {
        System.out.println(text);
    }

}

