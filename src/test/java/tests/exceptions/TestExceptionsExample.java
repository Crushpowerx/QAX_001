package tests.exceptions;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestExceptionsExample {

    @Test(groups = "TestngExample", priority = 1, expectedExceptions = {IOException.class})
    public void test1() throws IOException {
        System.out.println("I am test1");
        throw new IOException();
    }

    @Test
    public void test2() {
        int[] array1 = new int[5];
        try {
            for (int i = 0; i < 6; i++) {
                array1[i] = i;
                System.out.println(array1[i]);
            }
        } catch (ArrayIndexOutOfBoundsException ignored) {
        }
        Assert.assertEquals(array1[0], 0);
    }

}
