package PSL.lecture8.lc;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import PSL.lecture8.lc.base.AbstractPage;

public class ResultsPage extends AbstractPage {

    @FindBy(how = How.XPATH, using = "//a[@class='Result-title-link'][1]")
    private WebElement firstResultLink;

    @Override
    protected boolean isOpen() {
        return firstResultLink.isDisplayed();
    }

    public WebBrowserAutomationPage clickOnFirstResultLink() {
        firstResultLink.click();
        return new WebBrowserAutomationPage();
    }
}
