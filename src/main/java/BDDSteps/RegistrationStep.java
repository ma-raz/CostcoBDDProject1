package BDDSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegistrationStep extends PageBase {

    @When("^User click Register link$")
    public void user_click_Register_link() throws Throwable {
        WebElement element = driver.findElement(By.id("header_sign_in"));
        element.click();
    }

    @When("^User click on Create Account$")
    public void user_click_on_Create_Account() throws Throwable {
        WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Create Account')]"));
        element.click();
    }

    @Then("^Registration Page will display$")
    public void registration_Page_will_display() throws Throwable {
        String title = driver.getTitle();
        Assert.assertEquals("Register Account",title);

    }

    @Then("^User enter email address as \"([^\"]*)\"$")
    public void user_enter_email_address_as(String arg1) throws Throwable {
        WebElement element = driver.findElement(By.id("register_email1"));
        element.sendKeys("ma_raz@yahoo.com");

    }

    @Then("^User enter password as \"([^\"]*)\"$")
    public void user_enter_password_as(String arg1) throws Throwable {
        WebElement element = driver.findElement(By.id("logonPassword"));
        element.sendKeys("amar1234@");
    }

    @Then("^user enter confirm password as \"([^\"]*)\"$")
    public void user_enter_confirm_password_as(String arg1) throws Throwable {
        WebElement element = driver.findElement(By.id("logonPasswordVerify"));
        element.sendKeys("amar1234@");
    }

    @When("^User click Register button$")
    public void user_click_Register_button() throws Throwable {
        WebElement element = driver.findElement(By.xpath("//input[@class = 'primary' and @type = 'submit']"));
        element.click();
    }

    @Then("^User will get welcome message$")
    public void user_will_get_welcome_message() throws Throwable {
        String title = driver.getTitle();
        Assert.assertEquals("Welcome to Costco Wholesale",title);
        //Welcome to Costco Wholesale

    }

}
