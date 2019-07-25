package steps;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import utilities.Driver;

public class Amazon_Steps {

    @When("User is on Amazon application")
    public void user_is_on_Amazon_application() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().get("https://amazon.com");
    }

    @Then("User should see Amazon in title")
    public void user_should_see_Amazon_in_title() {
        // Write code here that turns the phrase above into concrete actions
       String actualTitle=Driver.getDriver().getTitle();
       String expectedTitle="Amazon";

        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
    @Then("User searches for something")
    public void user_searches_for_something() {
        // Write code here that turns the phrase above into concrete actions
       Assert.fail();
    }

}
