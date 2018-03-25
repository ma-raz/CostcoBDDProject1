package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //tags = { "@smoke" },         /* smoke test only */
        //tags = { "@smoke,@debug" }, /* debug or smoke test */
        //tags = { "@smoke","@debug" },  /* debug and smoke test */
        //monochrome = true,
        features = //"src/test/resources/features/Registration.feature",
                    // "src/test/resources/features/Signin.feature",
                     //"src/test/resources/features/AddProductToCart.feature",
                   //"src/test/resources/features/BrowseProducts.feature",
                   //"src/test/resources/features/ProductAddToCart.feature",
                   //"src/test/resources/features/Search.feature",
                   //"src/test/resources/features/FilterSearch.feature",
                   //"src/test/resources/features/ViewWareHouseSavings.feature",
                   "src/test/resources/features/Warehouselocation.feature",
                   //"src/test/resources/features/CustomerService.feature",
                  // "src/test/resources/features/ImagePage.feature",
        glue = {"BDDSteps"},

        //monochrome = true,
        //dryRun = true,
        plugin={
                "pretty:target/cucumber-test-report/cucumber-pretty.txt",
                "html:target/cucumber-test-report",
                "json:target/cucumber-test-report/cucumber-report.json",
                "junit:target/cucumber-test-report/test-report.xml",
                "json:target/test-report.json"
        }
)

// To see html report follow the path >> click on target >> index.html (right click) >> open in browser >> select chrome

public class BDDRunner {


}