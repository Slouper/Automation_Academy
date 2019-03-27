package lma.xpathhw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

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
        getWait().until(ExpectedConditions -> xpathTimeReport.isDisplayed());
    }
}
