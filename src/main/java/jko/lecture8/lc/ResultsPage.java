package jko.lecture8.lc;

import jko.lecture8.lc.base.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ResultsPage extends AbstractPage {


    @FindBy(how = How.XPATH, using = "//a[@class='Result-title-link'][1]")
    private WebElement firstResultLink;

    @Override
    protected boolean isOpen() {
        return firstResultLink.isDisplayed();
    }

    public ResultsPage(WebDriver driver) {
        super(driver);
    }


    public WebBrowserAutomationPage clickOnFirstResultLink() {
        firstResultLink.click();
        return new WebBrowserAutomationPage(getDriver());
    }
}
