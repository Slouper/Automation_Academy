package sloup.C_bestpractice_lecture_6.preparation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SeznamHomePage extends BasePage {

    @FindBy(how = How.XPATH, using = "//*[@name='q']")
    private WebElement searchInputField;

    @FindBy(how = How.XPATH, using = "//button[contains(@class,'search-form__button')]")
    private WebElement searchButton;

    @Override
    public void checkPageIsOpen() {
        isElementPresent(searchInputField);
    }

    public SeznamSearchResultsPage searchExpressionOnSeznamHomePage(String searchedExpression) {
        searchInputField.sendKeys(searchedExpression);
        searchButton.click();
        // Create page sends such object type which takes from method return type -> SeznamSearchResultsPage
        return createPage(); // SeznamSearchResultsPage
    }
}
