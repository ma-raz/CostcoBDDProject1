package BDDSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObject.HomePage;
import pageObject.SigninPage;
import utils.WebElementUtils;

public class SigninSteps extends PageBase{

    HomePage homePage = new HomePage();
    SigninPage signinPage = new SigninPage();

    @Given("^Not a valid user$")
    public void not_a_valid_user() {
        homePage.notAValidUser();


    }

    @When("^User browse to the site$")
    public void user_browse_to_the_site(){
        homePage.browseToTheSite();


    }

    @Then("^Costco home page will be display$")
    public void costco_home_page_will_be_display(){
        homePage.verifyHomePageTitle();

    }

    @When("^User click Signin link$")
    public void user_click_Signin_link()  {
        signinPage.clickSigninLink();


    }

    @Then("^Signin page will be dispaly$")
    public void signin_page_will_be_dispaly() {
        signinPage.verifySigninPagetitle();


    }

    @When("^User enter valid email address as \"([^\"]*)\"$")
    public void user_enter_valid_email_address_as(String arg1){
        signinPage.enterEmailAdress();


    }

    @When("^User enter valid password as \"([^\"]*)\"$")
    public void user_enter_valid_password_as(String arg1){
        signinPage.enterPassword();

    }

    @When("^User click signin button$")
    public void user_click_signin_button() {
        signinPage.clickSigninButton();

    }

    @Then("^My account page will be display$")
    public void my_account_page_will_be_display(){
     /*   String title = driver.getTitle();
        Assert.assertEquals("Welcome to Costco Wholesale",title);*/

     homePage.verifyHomePageTitle();


    }


}






