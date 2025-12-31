package com.cogmento;


import com.cogmento.base.BaseTest;
import com.cogmento.driver.DriverManager;
import org.testng.annotations.Test;

import static com.cogmento.constants.FrameworkConstants.URL;

/**
 * Unit test for simple App.
 */
public class AppTest extends BaseTest {


    @Test
    public void openPage(){
        DriverManager.getDriver().get(URL);
    }
}
