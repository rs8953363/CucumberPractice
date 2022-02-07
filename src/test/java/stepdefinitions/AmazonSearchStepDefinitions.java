package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import pages.*;
import utilities.*;

public class AmazonSearchStepDefinitions {
    AmazonPage amazonPage = new AmazonPage();

    @Given("user goes to Amazon webpage")
    public void user_goes_to_amazon_webpage() {
        System.out.println("First step");
        Driver.getDriver().get("https://amazon.com");
    }

    @Given("user types iphone in the search box")
    public void user_types_iphone_in_the_search_box() {
        System.out.println("Second step");
        amazonPage.searchBox.sendKeys("iphone"+ Keys.ENTER);
    }
    @Then("user results are shown on the screen")
    public void user_results_are_shown_on_the_screen() {
        System.out.println("Third step");
        String numberOfResults = amazonPage.numberOfResults.getText();
        System.out.println(numberOfResults);
    }

}
