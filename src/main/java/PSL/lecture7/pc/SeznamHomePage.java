package PSL.lecture7.pc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SeznamHomePage {
    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//*[@name='q']")
    private WebElement searchInputField;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    private WebElement searchButton;

    public SeznamHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public ResultsPage clickOnSearchButton() {
        searchButton.click();
        return new ResultsPage(driver);
    }

    public SeznamHomePage enterSearchedExpression(String searchedExpression) {
        searchInputField.sendKeys(searchedExpression);
        return this;
    }
}
