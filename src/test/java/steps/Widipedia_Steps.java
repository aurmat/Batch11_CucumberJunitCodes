package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.WikiPage;
import utilities.Config;
import utilities.Driver;

public class Widipedia_Steps {
    WikiPage wikiPage = new WikiPage();

    @When("User is on Wikipedia page")
    public void user_is_on_Wikipedia_page() throws InterruptedException{
        Driver.getDriver().get(Config.getProperty("wikiURL"));
        Thread.sleep(2000);

    }
    @Given("User is on Wikipedia homepage")
    public void user_is_on_Wikipedia_homepage() {
        Driver.getDriver().get(Config.getProperty("wikiURL"));
    }

    @When("User types {string} in the search box")
    public void user_types_in_the_search_box(String string) throws InterruptedException {
       wikiPage.searchField.sendKeys(string);


    }


    @When("User clicks search button")
    public void user_clicks_search_button() {
        wikiPage.searchButton.click();
    }

    @Then("User Sees {string} is in the title")
    public void user_Sees_is_in_the_title(String string) {
        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle= string + " - Wikipedia";
        Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle));
    }

    @Then("User sees {string} is in the main header")
    public void user_sees_is_in_the_main_header(String mainHeader) {
        String expectedHeader=mainHeader;
        String actualHeader=wikiPage.mainHeader.getText();
        Assert.assertEquals(expectedHeader, actualHeader);

    }

    @Then("User sees {string} is in the image header")
    public void user_sees_is_in_the_image_header(String imageHeader) {
        String expectedImageHeader = imageHeader;
        String actualImageHeader = wikiPage.imageHeader.getText();

        Assert.assertEquals(expectedImageHeader, actualImageHeader);

    }
}
