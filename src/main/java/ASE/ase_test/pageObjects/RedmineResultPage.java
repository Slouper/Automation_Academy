package ASE.ase_test.pageObjects;

import ASE.ase_test.base.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RedmineResultPage extends AbstractPage {

    @FindBy(how = How.XPATH, using = "//a[@class='issues']")
    private WebElement tasks;

    @FindBy(how = How.ID, using = "operators_status_id")
    private WebElement statusWrap;

    @FindBy(how = How.XPATH, using = "//option[@value='c']")
    private WebElement statusClosed;

    @FindBy(how = How.XPATH, using = "//a[@class='icon icon-checked']")
    private WebElement useIt;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'31567')]")
    private WebElement taskNumberFive;


    @Override
    protected boolean isOpen() {
        return true;
    }


    public RedmineResultPage(WebDriver driver) {
        super(driver);
    }

    public RedmineResultPage clickOnTasks() {
        tasks.click();
        return new RedmineResultPage(getDriver());
    }

    public RedmineResultPage clickOnStatusWrap() {
        statusWrap.click();
        return new RedmineResultPage(getDriver());
    }

    public RedmineResultPage clickOnStatusClosed() {
        statusClosed.click();
        return new RedmineResultPage(getDriver());
    }

    public RedmineResultPage clickOnUseIt() {
        useIt.click();
        return new RedmineResultPage(getDriver());
    }

    public WebElement getElementOnResultPage() {
        return taskNumberFive;
    }
}

