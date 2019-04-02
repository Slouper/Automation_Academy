package lma.fluenthw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FluentReportPage extends FluentAbstract{

    @FindBy(how = How.XPATH, using = "//a[text()='Redmine Timelog Report']")
    private WebElement fluentTimeReportCheck;

    public FluentReportPage(WebDriver driver) {
        super(driver);
        getWait().until(ExpectedConditions.visibilityOf(fluentTimeReportCheck));
    }

    public FluentReportPage fluentTimeReportCheck() {
        fluentTimeReportCheck.isDisplayed();
        return this;
    }
}
