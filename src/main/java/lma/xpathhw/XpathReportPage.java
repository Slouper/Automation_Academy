package lma.xpathhw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class XpathReportPage extends XpathAbstract{

    @FindBy(how = How.XPATH, using = "//a[text()='Redmine Timelog Report']")
    private WebElement xpathTimeReportCheck;

    public XpathReportPage(WebDriver driver) {
        super(driver);
    }

    public void xpathTimeReportCheck() {
        xpathTimeReportCheck.isDisplayed();
    }

    protected void isOpen() {
        getWait().until(ExpectedConditions -> xpathTimeReportCheck.isDisplayed());
    }
}
