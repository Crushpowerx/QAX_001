package tests.junit;

import org.junit.jupiter.api.*;

import static java.lang.Thread.sleep;

public class JUnitExample {

    @BeforeAll
    public static void setUpBeforeAll() {
        System.out.println("I am method setUpBeforeAll");
    }

    @BeforeEach
    public void setUpBeforeEach() throws InterruptedException {
        System.out.println("I am method setUpBeforeEach");
        sleep(1000);
    }

    @Test
    public void test1() {
        System.out.println("I am test1");
    }

    @Test
    public void test2() {
        System.out.println("I am test2");
    }

    @Test
    public void test3() {
        System.out.println("I am test3");
    }

    @Test
    public void test4() {
        System.out.println("I am test4");
    }

    @Test
    public void test5() {
        System.out.println("I am test5");
    }

    @AfterEach
    public void tearDownAfterEach() {
        System.out.println("I am method tearDownAfterEach");
    }

    @AfterAll
    public static void tearDownAfterAll() {
        System.out.println("I am method tearDownAfterAll");
    }

}
