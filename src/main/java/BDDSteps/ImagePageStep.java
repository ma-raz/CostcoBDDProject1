package BDDSteps;

import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utils.SeleniumUtils;

import java.util.List;

public class ImagePageStep extends PageBase {

    @Then("^Costco home page will be visible$")
    public void costco_home_page_will_be_visible()  {


    }

    @Then("^User can see all the images$")
    public void user_can_see_all_the_images()  {
        WebElement imageFile = driver.findElement(By.xpath(".//*[@id='slick-slide02']/img[1]"));
        Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript
                ("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", imageFile);
        if (!ImagePresent) {
            System.out.println("Image not displayed.");
        } else {
            System.out.println("Image displayed.");
        }

        List<WebElement> allImages = driver.findElements(By.tagName("img"));
        int countAllImages = allImages.size();
        System.out.println("Total number of images is  :"+countAllImages);

        for(int x =0;x >= countAllImages;x++){
            System.out.println(allImages.get(x));
            }
        }

    }


