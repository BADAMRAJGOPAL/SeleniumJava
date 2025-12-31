package com.cogmento.base;

import com.cogmento.driver.DriverFactory;
import com.cogmento.driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected BaseTest() {
        // optional setup
    }
    @BeforeMethod
    public static void setUp() {
        DriverFactory.initDriver();
        DriverManager.getDriver().manage().window().maximize();

    }

    @AfterMethod
    public static void tearDown() {
        DriverFactory.quitDriver();
    }
}
