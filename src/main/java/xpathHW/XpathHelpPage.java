package xpathHW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XpathHelpPage extends XpathAbstract {

    @FindBy(how = How.XPATH, using = "//a[text()='Spent-time details']/parent::li/following::a[1]")
    private WebElement xpathTimeReport;

    public XpathHelpPage(WebDriver driver) {
        super(driver);
    }

    public void xpathTimeReport() {
        xpathTimeReport.click();
    }

    protected void isOpen() {
        new WebDriverWait(getDriver(), 20).until(ExpectedConditions -> xpathTimeReport.isDisplayed());
    }
}
