package marek.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SeznamHomePage extends AbstractPage {

    @FindBy(how = How.NAME, using = "q")
    private WebElement searchInput;

    @FindBy(how = How.XPATH, using = "//*[@type='submit']")
    private WebElement searchButton;

    public SeznamHomePage(WebDriver driver) {
        super(driver);
    }

    public void searchExpression(String expression) {
        searchInput.sendKeys(expression);
        searchButton.click();


    }
}
