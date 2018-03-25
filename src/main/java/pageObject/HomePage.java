package pageObject;

import BDDSteps.PageBase;
import org.junit.Assert;

public class HomePage extends PageBase {

    public  void notAValidUser(){
        driver.manage().deleteAllCookies();
    }

    public void browseToTheSite(){
        driver.navigate().to("https://www.costco.com/");
    }
    public void verifyHomePageTitle(){
        String title = driver.getTitle();
        Assert.assertEquals("Welcome to Costco Wholesale",title);
    }

}
