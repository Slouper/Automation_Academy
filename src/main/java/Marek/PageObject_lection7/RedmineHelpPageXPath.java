package Marek.PageObject_lection7;

import Marek.PageObject.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RedmineHelpPageXPath extends AbstractPage {

    @FindBy(how = How.XPATH, using = "//a[text()='Spent-time details']/parent::li/following::a[1]")
    private WebElement spentTimeReport;


    public RedmineHelpPageXPath(WebDriver driver) {
        super(driver);
    }

    public void ClickSpentTimeReport() {
        spentTimeReport.click();
    }
}
