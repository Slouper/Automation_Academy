package mdma.x_path_lekce7;

import mdma.pageobject.monika.test.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeznamHomePage extends AbstractPage {

    @FindBy(how = How.NAME, using = "q")
    private WebElement searchInput;

    @FindBy(how = How.XPATH, using = "//*[@id=\"hp-app\"]/div/div[1]/div[2]/div/div/div[3]/header/div[2]/div/div[2]/div[1]/form/button")
    private WebElement searchButton;

    public SeznamHomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void isOpen() {
        new WebDriverWait(getDriver(), 20).until(ExpectedConditions.visibilityOf(searchButton));
    }

    public void searchExpression(String expression) {
        searchInput.sendKeys(expression);
        searchButton.click();
    }

}


