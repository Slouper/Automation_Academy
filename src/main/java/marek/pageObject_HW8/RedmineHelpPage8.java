package marek.pageObject_HW8;

import marek.pageObject.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RedmineHelpPage8 extends AbstractPage {

    @FindBy(how = How.XPATH, using = "//a[text()='Spent-time details']/parent::li/following::a[1]")
    private WebElement spentTimeReport;


    public RedmineHelpPage8(WebDriver driver) {
        super(driver);
    }

    public RedmineReportPage8 ClickReportAnchor(WebDriver driver){
        spentTimeReport.click();
        return new RedmineReportPage8(driver);
    }
}
