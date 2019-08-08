package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SBPage {

    public SBPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "ctl00_MainContent_username")
    public WebElement inputButton;

    @FindBy(id = "ctl00_MainContent_password")
    public WebElement passwdButton;

    @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement loginBUtton;

    @FindBy(xpath = "//li//a[contains(text(), 'Order')]")
    public WebElement ordersButton;

    @FindBy(id="ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement product;


}
