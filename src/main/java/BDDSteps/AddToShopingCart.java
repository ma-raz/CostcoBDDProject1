package BDDSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AddToShopingCart extends  PageBase {

    @Given("^As a valid user$")
    public void As_a_valid_user(){
        WebElement element = driver.findElement(By.xpath(".//*[@id='search-results']/div[2]/div/div[2]/div[2]/a/div/div[3]/input"));
        element.click();
    }


    @When("^User move cursor to grocery$")
    public void user_move_cursor_to_grocery()  {
        delayFor(4000);
        WebElement element = driver.findElement(By.xpath(".//*[@id='Home_Ancillary_0']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();

    }

    @Then("^grocery page will be drop down$")
    public void grocery_page_will_be_drop_down()  {
        WebElement element = driver.findElement(By.xpath("//div[@class='col-sm-3 col-md-3']//a[contains(text(),'Kirkland Signature')]"));
        //delayFor(1000);
        String text = element.getText();
        System.out.println(text);
        String expected = "Kirkland Signature";
        delayFor(1000);
        if(text.contains(expected)){
            System.out.println("Match");
        }else {
            System.out.println("Don't Match");
        }

    }

    @And("^User select a category as \"([^\"]*)\"$")
    public void user_select_a_category_as(String arg1)  {
        WebElement element = driver.findElement(By.xpath(".//*[@id='Home_Ancillary_Popover_0-container']/div/div[1]/ol/li[4]/a"));//
       // .//*[@id='Home_Ancillary_Popover_0-container']/div/div[1]/ol/li[3]/a
        element.click();


    }
/*   @When("^Popup window will open$")
    public void popup_window_will_open()  {
        WebElement image = driver.findElement(By.xpath(".//*[@id='delivery-popup-badge']/img"));
        Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript
                ("return arguments[0].complete && typeof arguments[0].naturalWidth " +
                        "!= \"undefined\" && arguments[0].naturalWidth > 0", image);
        if (!ImagePresent) {
            System.out.println("Image not displayed.");
        } else {
            System.out.println("Image displayed.");
        }

    }*/
     @When("^Popup window will open$")
       public void popup_window_will_open()  {

         WebElement element = driver.findElement(By.xpath("//div[@class= 'col-md-5 hidden-xs hidden-sm']/p[@class='added-to-cart success']"));
         String text = element.getText();
         String expected = "Item Added to Cart";
         if(text.contains(expected)){
             System.out.println("Match");
         }else {
             System.out.println("Don't Match");
         }


}


    @Then("^User enter zipcode as \"([^\"]*)\"$")
    public void user_enter_zipcode_as(String arg1)  {
      WebElement element = driver.findElement(By.xpath(".//*[@id='postal-code-input']"));
        delayFor(3000);
      element.sendKeys("10461");
        delayFor(3000);


    }
    @Then("^User click set delivery zip code$")
    public void user_click_set_delivery_zip_code()  {
        WebElement element = driver.findElement(By.xpath(".//*[@id='postal-code-submit']"));
        element.click();

    }

    @When("^User select a product$")
    public void user_select_a_product() {
        WebElement element = driver.findElement(By.xpath(".//*[@id='100381569_tile_desc']/a"));
        scrollToElement(element);
        element.click();
        delayFor(3000);
    }

    @When("^User click Add to cart button$")
    public void user_click_Add_to_cart_button() {
        WebElement element = driver.findElement(By.xpath(".//*[@id='add-to-cart']/input"));
        scrollToElement(element);
        delayFor(2000);
        element.click();
        delayFor(3000);

    }
    @Then("^User click view cart button$")
    public void user_click_view_cart_button() {
        WebElement element = driver.findElement(By.xpath(".//*[@id='costcoModalText']/div[2]/div[2]/a/button"));
        scrollToElement(element);
        element.click();

    }
    @Then("^shopping cart page will open$")
    public void shopping_cart_page_will_open() {
        String title = driver.getTitle();
        Assert.assertEquals("Shopping Cart",title);


    }





/*
    @Then("^A popup window will open$")
    public void a_popup_window_will_open()  {

    }
*/

/*    @Then("^User click view cart button$")
    public void user_click_view_cart_button() {
        WebElement element = driver.findElement(By.xpath(".//*[@id='costcoModalText']/div[2]/div[2]/a/button"));
        scrollToElement(element);
        element.click();

    }

    @Then("^shopping cart page will open$")
    public void shopping_cart_page_will_open() {
        String title = driver.getTitle();
        Assert.assertEquals("Shopping Cart",title);


    }*/


/*    @Then("^Water & Beverages page will be display$")
    public void water_Beverages_page_will_be_display()  {


    }

*/


}
