package hooks;

import io.cucumber.java.*;

public class DriverFactory {
    private int value=2;

    @Before()
    public void setUp() {
        System.out.println("BaseTest.setUp");
        value = (int)(Math.random()*10+1);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @After()
    public void tearDown() {
        System.out.println("BaseTest.tearDown");
    }

    @BeforeAll(order=10)
    public static void beforeAllTen() {
        System.out.println("BaseTest.beforeAll-->order:10");
    }

    @AfterAll(order=10)
    public static void afterAllTen() {
        System.out.println("BaseTest.afterAll-->order:10");
    }

    @BeforeAll(order=20)
    public static void beforeAllTwenty() {
        System.out.println("BaseTest.beforeAll-->order:20");
    }

    @AfterAll(order=20)
    public static void afterAllTwenty() {
        System.out.println("BaseTest.afterAll-->order:20");
    }

    @BeforeStep()
    public void beforeStep() {
        System.out.println("DriverFactory.beforeStep");
    }

    @AfterStep()
    public void afterStep() {
        System.out.println("DriverFactory.afterStep");
    }

    @Override
    public String toString() {
        return "DriverFactory{" +
                "value=" + value +
                '}';
    }
}
