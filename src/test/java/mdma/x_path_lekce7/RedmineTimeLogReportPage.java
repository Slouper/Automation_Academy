package mdma.x_path_lekce7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedmineTimeLogReportPage extends AbstractPage {
    @FindBy(how = How.XPATH, using = "//a[text()='Spent-time details']/parent::li/following::a[1]")
    private WebElement TimelogReport;

    public RedmineTimeLogReportPage (WebDriver driver) {
        super(driver);
    }

    public void clickOnTimelogReport() {

        TimelogReport.click();
    }

    @Override
    public void isOpen() {

    }

//    @Override
//    public void isOpen() {new WebDriverWait(getDriver()).until(ExpectedConditions.visibilityOfElementLocated(By.name("Redmine Timelog Report")));

//    }
}
