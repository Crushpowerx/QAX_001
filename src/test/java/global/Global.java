package global;

public class Global {
    public static String globalCountry = "";

    public static void resetGlobalVariablesAfterMethod() {
        globalCountry = "";
    }

    public static void resetGlobalVariablesAfterClass() {
        globalCountry = "";
    }

}
