package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class Google_Steps {

    @When("User is on Google search page")
    public void user_is_on_Google_search_page() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().get("https://google.com");
    }

    @Then("User searches for apples")
    public void user_searches_for_apples() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().findElement(By.name("q")).sendKeys("apples" + Keys.ENTER);
    }

    @Then("User should see inside of the title")
    public void user_should_see_inside_of_the_title() {
        // Write code here that turns the phrase above into concrete actions
        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle="apples";

        Assert.assertTrue(actualTitle.contains(expectedTitle));



    }
    @When("User searches for the word {string}")
    public void user_searches_for_the_word(String word) { //string is a word we want to search for
      WebElement searchBox=  Driver.getDriver().findElement(By.name("q"));
        searchBox.sendKeys(word + Keys.ENTER);
    }

    @Then("User should see the word {string} inside of the title")
    public void user_should_see_the_word_inside_of_the_title(String word) {
        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle=word;

        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }
    @Given("User tests with words {string} {string} {string}")
    public void user_tests_with_words(String string, String string2, String string3) {

    }

    @Then("User checks numbers {int} and {int}")
    public void user_checks_numbers_and(Integer int1, Integer int2) {

    }

}
