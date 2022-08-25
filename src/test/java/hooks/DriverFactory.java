package hooks;

import io.cucumber.java.*;

public class DriverFactory {
    private int value=2;

    @Before("@api")
    public void setUpApi() {
        System.out.println("BaseTest.setUp-->Runs only for Api");
    }


    @Before()
    public void setUp() {
        System.out.println("BaseTest.setUp-->Not specified an order");
        value = (int)(Math.random()*10+1);
    }

    @Before(order=100)
    public void setUp100() {
        System.out.println("BaseTest.setUp-->Order-->100");
        value = (int)(Math.random()*10+1);
    }

    @Before(order=200)
    public void setUp200() {
        System.out.println("BaseTest.setUp-->Order-->200");
    }
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @After("@api")
    public void tearDownApi() {
        System.out.println("BaseTest.tearDown-->Only runs for api tag");
    }



    @After()
    public void tearDown() {
        System.out.println("BaseTest.tearDown-->Not specified an order");
    }


    @After(order=100)
    public void tearDown100() {
        System.out.println("BaseTest.tearDown-->Order-->100");
    }

    @After(order=200)
    public void tearDown200() {
        System.out.println("BaseTest.tearDown-->Order-->200");
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
