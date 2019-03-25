package fluenthw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FluentReportPage extends FluentAbstract{

    @FindBy(how = How.XPATH, using = "//a[text()='Redmine Timelog Report']")
    private WebElement fluentTimeReportCheck;

    public FluentReportPage(WebDriver driver) {
        super(driver);
    }

    public FluentReportPage fluentTimeReportCheck() {
        fluentTimeReportCheck.isDisplayed();
        return this;
    }
}
