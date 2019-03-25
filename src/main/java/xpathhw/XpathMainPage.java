package xpathhw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XpathMainPage extends XpathAbstract {

    @FindBy(how = How.XPATH, using = "//div[@id='top-menu']//a[@class='help']")
    private WebElement xPathHelpButton;

    public XpathMainPage(WebDriver driver) {
        super(driver);
    }

    public void xPathHelpButton() {
        xPathHelpButton.click();
    }

    protected void isOpen() {
        new WebDriverWait(getDriver(), 20).until(ExpectedConditions -> xPathHelpButton.isDisplayed());
    }
}
