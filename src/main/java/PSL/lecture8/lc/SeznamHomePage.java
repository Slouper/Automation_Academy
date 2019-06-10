package PSL.lecture8.lc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import PSL.lecture8.lc.base.AbstractPage;

public class SeznamHomePage extends AbstractPage {

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

    public ResultsPage clickOnSearchButton() {
        searchButton.click();
        return new ResultsPage(getDriver());
    }

    public SeznamHomePage enterSearchedExpression(String searchedExpression) {
        searchInputField.sendKeys(searchedExpression);
        return this;
    }
}
