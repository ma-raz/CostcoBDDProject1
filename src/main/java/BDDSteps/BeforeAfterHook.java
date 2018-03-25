package BDDSteps;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.DriverFactory;
import utils.WebElementUtils;

import java.util.concurrent.TimeUnit;


public class BeforeAfterHook extends WebElementUtils{
    @Before
    public void setup() {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);

        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        delayFor(4000);
        DriverFactory.getInstance().removeDriver();
    }

}
