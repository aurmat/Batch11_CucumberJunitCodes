package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.FreeRidesPage;
import utilities.Driver;

public class ThunderPhoenix_Steps {

    FreeRidesPage freeRidesPage =new FreeRidesPage();


    @When("User is on ThunderPhoenix web application")
    public void user_is_on_ThunderPhoenix_web_application() {
        Driver.getDriver().get("https://mariwka94.wixsite.com/thunderphoenix");
    }

    @Then("User clicks on Register Now button \\(Free Rides To North Sides)")
    public void user_clicks_on_Register_Now_button_Free_Rides_To_North_Sides() {
        freeRidesPage.registerNow.click();
    }

    @Then("User should be on the Free Rides To North Side page")
    public void user_should_be_on_the_Free_Rides_To_North_Side_page() {
    Assert.assertTrue(freeRidesPage.freeRidesPageText.isDisplayed());
    }

    @Then("User should click on Buy Tickets button")
    public void user_should_click_on_Buy_Tickets_button() throws InterruptedException{
        Thread.sleep(2000);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        actions.moveToElement(freeRidesPage.plusButton).click().perform();
        Driver.getDriver().switchTo().frame("//button[@data-hook='plus-button']");

        freeRidesPage.buyTickets.click();
    }

    @Then("User should be able to select quantity and Checkout")
    public void user_should_be_able_to_select_quantity_and_Checkout() throws InterruptedException {
        Thread.sleep(2000);
        //freeRidesPage.plusButton.click();
        Thread.sleep(2000);
        freeRidesPage.checkOutButton.click();
    }

    @Then("User should be able to Register")
    public void user_should_be_able_to_Register() throws InterruptedException{
        freeRidesPage.firstName.sendKeys("Thunder");
        freeRidesPage.lastName.sendKeys("Phoenix");
        freeRidesPage.email.sendKeys("thundercyberphoenix@gmail.com");
        Thread.sleep(2000);
        freeRidesPage.continueButton.click();
        Thread.sleep(2000);
        freeRidesPage.chooseGmail.click();
    }

    @Then("User should be on the Thank You page")
    public void user_should_be_on_the_Thank_You_page() {
        Assert.assertTrue(freeRidesPage.thankYouText.isDisplayed());
    }

    @Then("User should add the event to the calendar choosing the calendar type")
    public void user_should_add_the_event_to_the_calendar_choosing_the_calendar_type()throws InterruptedException{
        Thread.sleep(2000);
       freeRidesPage.addToCalendar.click();
    }

    @Then("User should get the email confirmation")
    public void user_should_get_the_email_confirmation() throws InterruptedException {
        Thread.sleep(2000);
    freeRidesPage.saveButton.click();
    }

}
