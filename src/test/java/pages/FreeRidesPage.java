package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FreeRidesPage {

    public FreeRidesPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//button[.='Register Now'])[1]")
    public WebElement registerNow;

   @FindBy(xpath = "//button[.='Buy Tickets']")
    public WebElement buyTickets;

   @FindBy(xpath = "//button[@data-hook='plus-button']")
   public WebElement plusButton;

   @FindBy(xpath = "//button[@data-hook='reserve-tickets-button']")
    public WebElement checkOutButton;

   @FindBy(id ="firstName")
    public WebElement firstName;

   @FindBy(id="lastName")
    public WebElement lastName;

   @FindBy(id="email")
    public WebElement email;

   @FindBy(xpath = "//button[@data-hook='form-button']")
    public WebElement continueButton;

   @FindBy(xpath = "//h2[@class='evTitleFont formTitleColor _3PEI4']")
   public WebElement thankYouText;

   @FindBy(xpath = "//button[@data-hook='add-to-calendar']")
    public WebElement addToCalendar;

   @FindBy(xpath = "//a[@data-hook='calendar-gmail']")
    public WebElement chooseGmail;

    @FindBy(id = "xSaveBu")
    public WebElement saveButton;

    @FindBy(xpath = "//h2[.='Free Rides to North Side!!!']")
    public WebElement freeRidesPageText;

}
