package plu.Lesson7_xpath.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedMineHelpPageXpath extends BasePageXpath {

    @FindBy(how = How.XPATH, using = "//div[@id='top-menu']//a[@class='help']")
    private WebElement helpAnchor;

    @FindBy (how = How.XPATH, using= "//a[text()='Spent-time details']/parent::li/following::a[1]")
    private WebElement spentTimeDetails;

    @FindBy (how = How.XPATH, using="//a[@name='Redmine-Timelog-Report']/following::h1[text()='Redmine Timelog Report']")
    private WebElement redmineTimeLogReportTitle;


    public RedMineHelpPageXpath(WebDriver driver) {
        super(driver);
    }

    public void clickOnHelpAnchor() {

        helpAnchor.click();
    }

    public void clickSpentTimeDetails(){

        spentTimeDetails.click();
    }

    public void isOpen() {

        new WebDriverWait(getDriver(), 20).until(ExpectedConditions -> helpAnchor.isDisplayed());
    }

    public void isTitleDisplayed(){
        new WebDriverWait(getDriver(),20).until(ExpectedConditions -> redmineTimeLogReportTitle.getText());
    }
}
