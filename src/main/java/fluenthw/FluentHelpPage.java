package fluenthw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FluentHelpPage extends FluentAbstract{

    @FindBy(how = How.XPATH, using = "//a[text()='Spent-time details']/parent::li/following::a[1]")
    private WebElement fluentTimeReport;

    public FluentHelpPage(WebDriver driver) {
        super(driver);
    }

    public FluentReportPage fluentTimeReport() {
        fluentTimeReport.click();
        return new FluentReportPage(getDriver());
    }

}
