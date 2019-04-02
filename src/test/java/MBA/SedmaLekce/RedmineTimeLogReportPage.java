package MBA.SedmaLekce;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class RedmineTimeLogReportPage extends AbstractPage {

    @FindBy(how = How.XPATH, using = "//a[text()='Spent-time details']/parent::li/following::a[1]")
    private WebElement TimelogReport;

    public RedmineTimeLogReportPage(WebDriver driver) {
        super(driver);
    }

    public RedmineTimeLogReportPage clickOnTimelogReport() {
        TimelogReport.click();
        return this;
    }


}