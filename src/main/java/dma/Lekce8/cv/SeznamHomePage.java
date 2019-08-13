package dma.Lekce8.cv;

import dma.Lekce8.cv.base.AbstractPage8;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SeznamHomePage extends AbstractPage8 {

    @FindBy(how = How.XPATH, using = "//*[@name='q']")
    private WebElement searchInputField;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    private WebElement searchButton;

    @Override
    protected boolean isOpen() {
        return searchInputField.isDisplayed();
    }

    public SeznamHomePage(WebDriver driver) {
        super(driver);
    }

  //  public SeznamHomePage(WebDriver driver) {
  //      this.driver = driver;
  //      PageFactory.initElements(driver,this);
  //      //potřebuje driver - který je definovaný nadtím konstruktorem,odkud (z této stránky)=this)
    //      nevyužito, kvůli přepoužití kontruktoru z abstractPage

    public ResultsPage clickSearchButton () {
        searchButton.click();
        //jako by volal driver.searchbutton().click();
        return new ResultsPage(getDriver());
    }
    public SeznamHomePage enterSearchedExpression(String searchExpression) {
        searchInputField.sendKeys(searchExpression);
        return this;
    }
}