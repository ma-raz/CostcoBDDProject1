package BDDSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Warehouselocation extends PageBase {

    @When("^User move cursor to find a Warehouse link$")
    public void user_move_cursor_to_find_a_Warehouse_link()  {
        delayFor(3000);
        WebElement element = driver.findElement(By.xpath("//a[@id='warehouse-locations-dropdown'and @class='header-menu-dropdown']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();

    }

    @Then("^Find warehouse page should be dropdown$")
    public void find_warehouse_page_should_be_dropdown()  {
        String title = driver.getTitle();
        Assert.assertEquals("Welcome to Costco Wholesale",title);
        System.out.println(title);
        delayFor(2000);
    }

    @Then("^User enter the city name\"([^\"]*)\"$")
    public void user_enter_the_city_name(String arg1) {
        WebDriverWait wait=new WebDriverWait(driver,50);
        WebElement element =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='warehouse-search-field-desktop']")));
        element.sendKeys("Manhattan");
        delayFor(2000);

    }

    @Then("^User click find a warehouse button$")
    public void user_click_find_a_warehouse_button()  {
        WebElement element = driver.findElement(By.xpath("//form[@id='warehouse_locator_search-desktop']//input[@class='btn btn-primary'and@type='submit']"));
        delayFor(2000);
        element.click();
    }

    @Then("^Store location will be display$")
    public void store_location_will_be_display()  {
        String title = driver.getTitle();
        delayFor(3000);
        Assert.assertEquals("Find a Costco warehouse- Costco",title);

    }


    @Then("^User click Gas station check box$")
    public void user_click_Gas_station_check_box()  {
        WebElement element = driver.findElement(By.xpath("//label[@title='Gas Station' and @for='hasGas-desktop']"));
        element.click();

    }

    @Then("^User click Tire center check box$")
    public void user_click_Tire_center_check_box() {
        WebElement element = driver.findElement(By.xpath("//label[@title='Tire Service' and @for='hasTires-desktop']"));
        element.click();

    }


    @Then("^User click Optical check box$")
    public void user_click_Optical_check_box()  {
        WebElement element = driver.findElement(By.xpath("//form[@id='warehouse_locator_search-desktop']//label[@title='Optical Dept']"));
        delayFor(3000);
        element.click();
    }

    @Then("^User click pharmacy check box$")
    public void user_click_pharmacy_check_box() {
        WebElement element = driver.findElement(By.xpath("//form[@id='warehouse_locator_search-desktop']//label[@title='Pharmacy']"));
        delayFor(3000);
        element.click();

    }
    @Then("^User enter state name as \"([^\"]*)\"$")
    public void user_enter_state_name_as(String arg1)  {
        WebElement element = driver.findElement(By.xpath("//a[@id='warehouse-locations-dropdown']"));
        element.sendKeys("New York");
        delayFor(2000);
    }

    @Then("^User enter zip as \"([^\"]*)\"$")
    public void user_enter_zip_as(String arg1)  {
        WebElement element = driver.findElement(By.xpath("//input[@id='warehouse-search-field-desktop']"));
        element.sendKeys("10461");
    }
    @Then("^User enter city name as \"([^\"]*)\"$")
    public void user_enter_city_name_as(String arg1)  {
        WebElement element = driver.findElement(By.xpath("//a[@id='warehouse-locations-dropdown']"));
        element.sendKeys("xxxxx");
    }

    @Then("^Unsuccess message will be display$")
    public void unsuccess_message_will_be_display()  {
        WebElement element = driver.findElement(By.xpath(".//div[@id='error-container']/div[1]"));
        String text = element.getText();
        System.out.println("TEXT IS  :"+text);
        String expected = "We were unable to find a Costco warehouse near your location. Please try searching again.";
        if(text.contains(expected)){
            System.out.println("Match");
        }else {
            System.out.println("Don't match");
        }
    }


}
