package global;

public class Global {
    public static String globalCountry = "";
    public static String globalRandomLetters = "";
    public static String globalDevice = "";
    public static boolean globalIsMobileDevice = false;
    public static boolean globalModeDebug = false;

    public static void resetGlobalVariablesAfterClass() {
        globalCountry = "";
    }

}
