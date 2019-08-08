package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WikiPage {

    public WikiPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="searchInput")
    public WebElement searchField;


    @FindBy(xpath = "//i[@class='sprite svg-search-icon']")
    public WebElement searchButton;

    @FindBy(xpath = "//h1[@id='firstHeading']")
    public WebElement mainHeader;

    @FindBy(xpath = "//div[@class='fn']")
    public WebElement imageHeader;
}
