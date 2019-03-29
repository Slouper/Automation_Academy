package MBA.SedmaLekceFluent.SedmaLekce;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class RedmineHelpPageFluent extends AbstractPageFluent {

    @FindBy(how = How.XPATH, using = "//a[text()='Spent-time details']/parent::li/following::a[1]")
    private WebElement TimelogReport;

    WebDriver driver;

    public RedmineHelpPageFluent(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void clickOnTimelogReport() {

        TimelogReport.click();
    }

}