package xpathhw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        new WebDriverWait(getDriver(), 20).until(ExpectedConditions -> xpathTimeReportCheck.isDisplayed());
    }
}
