package utils;

public class ArrayUtils {

    public String[] createArray(int arrayLength) {
        return new String[arrayLength];
    }

    public void fillArray(String[] arrayString, String value) {
        for (int i = 0; i < arrayString.length; i++) {
            arrayString[i] = value + i;
        }
    }

    public void fillArray2(String[] arrayString, String value) {
        for (String s : arrayString) {
            s = value;
            System.out.println(s);
        }
    }

    public void printArray(String[] arrayString) {
        for (String s : arrayString) {
            System.out.println(s);
        }
    }


}
