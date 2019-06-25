package dma.Lekce8.cv;

import dma.Lekce8.cv.base.AbstractPage8;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ResultsPage extends AbstractPage8 {
    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//a[@class='Result-title-link'][1]")
    private WebElement firstResultLink;


    // public ResultsPage(WebDriver driver) {
    //   PageFactory.initElements(driver,this);


    @Override
    protected boolean isOpen() {
        return firstResultLink.isDisplayed();
    }

    public ResultsPage(WebDriver driver) {
        super(driver);
        //}
        //    public WebBrowserAutomationPage clickOnFirstResultsLink () {
        //    firstResultLink.click();
        //    return new WebBrowserAutomationPage(driver);
    }
}
