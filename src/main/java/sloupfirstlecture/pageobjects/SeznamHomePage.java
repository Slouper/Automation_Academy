package sloupfirstlecture.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * @author petr.sloup
 */
public class SeznamHomePage {

    @FindBy(how = How.XPATH, using = "//*[@name='q']")
    private WebElement searchInputField;

    @FindBy(how = How.XPATH, using = "//button[contains(@class,'search-form__button')]")
    private WebElement searchButton;

    public SeznamHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void searchExpressionOnSeznamHomePage(String searchedExpression) {
        searchInputField.sendKeys(searchedExpression);
        searchButton.click();
    }

}
