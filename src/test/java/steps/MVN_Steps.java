package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class MVN_Steps {

    @When("User is on MVN home page")
    public void user_is_on_MVN_home_page() {
        Driver.getDriver().get("https://mvnrepository.com/");
    }

    @When("User searches for {string}")
    public void user_searches_for(String word) {
        Driver.getDriver().findElement(By.name("q")).sendKeys(word + Keys.ENTER);
    }

    @Then("User verifies {string} is first text")
    public void user_verifies_is_first_text(String word) {
        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle=word;

        Assert.assertTrue(actualTitle.contains(expectedTitle));
        Driver.closeDriver();
    }

}
