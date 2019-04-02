package plu.homeworkFluentInterface.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedMineHelpPageHw8 extends BasePageHw8 {

    @FindBy(how = How.XPATH, using = "//div[@id='top-menu']//a[@class='help']")
    private WebElement helpAnchor;

    @FindBy (how = How.XPATH, using= "//a[text()='Spent-time details']/parent::li/following::a[1]")
    private WebElement spentTimeDetails;

    @FindBy (how = How.XPATH, using="//a[@name='Redmine-Timelog-Report']/following::h1[text()='Redmine Timelog Report']")
    private WebElement redmineTimeLogReportTitle;


    public RedMineHelpPageHw8(WebDriver driver) {
        super(driver);
    }

    public RedMineHelpPageHw8 clickOnHelpAnchor() {

        helpAnchor.click();
        return this;
    }

    public RedMineSpentTimeDetailsPageHw8 clickSpentTimeDetails(){

        spentTimeDetails.click();
        return new RedMineSpentTimeDetailsPageHw8(getDriver());
    }
}
