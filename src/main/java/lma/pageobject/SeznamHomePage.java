package lma.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SeznamHomePage extends AbstractPage {

    @FindBy(how = How.XPATH, using = "//*[@name='q']")
    private WebElement searchInput;

    @FindBy(how = How.XPATH, using = "//button[contains(@class,'search-form__button')]")
    private WebElement searchButton;

    // Alt + insert - constructor
    public SeznamHomePage(WebDriver driver) {
        super(driver);
    }

    //Metoda
    public void searchExpression(String Expression) {
        searchInput.sendKeys(Expression);
        searchButton.click();
    }
}
