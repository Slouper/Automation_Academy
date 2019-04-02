package lma.finalobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TrackTagPage extends AbstractPage {

    @FindBy(how = How.XPATH, using = "//*[text()='Example']")
    private WebElement firstExample;

    public TrackTagPage(WebDriver driver) {
        super(driver);
        getWait().until(ExpectedConditions.visibilityOf(firstExample));
    }

    public void firstExample() {
        firstExample.getText();
    }
}
