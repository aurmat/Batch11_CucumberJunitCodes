package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import pages.SBPage;
import utilities.Config;
import utilities.Driver;

public class SB_Steps {
    SBPage sbPage = new SBPage();

    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_SmartBear_Tester_account_and_on_Order_page() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        sbPage.inputButton.sendKeys(Config.getProperty("username"));
        sbPage.passwdButton.sendKeys(Config.getProperty("password"));
        sbPage.loginBUtton.click();
    }

    @When("User fills out the form as followed from the table below")
    public void user_fills_out_the_form_as_followed_from_the_table_below() {
        sbPage.ordersButton.click();

    }

    @When("User selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String string) {
        sbPage.product.sendKeys("MyMoney");
    }

    @When("User enters {string} to quantity")
    public void user_enters_to_quantity(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("User enters {string} to street")
    public void user_enters_to_street(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("User enters {string} to city")
    public void user_enters_to_city(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("User enters {string} to state")
    public void user_enters_to_state(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("User enters {string} to zip")
    public void user_enters_to_zip(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("User selects {string} as card type")
    public void user_selects_as_card_type(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("User enters {string} to card number")
    public void user_enters_to_card_number(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("User enters {string} date”to expiration date")
    public void user_enters_date_to_expiration_date(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("User clicks process button")
    public void user_clicks_process_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}
