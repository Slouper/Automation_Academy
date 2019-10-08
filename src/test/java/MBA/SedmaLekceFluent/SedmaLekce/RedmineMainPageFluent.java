package MBA.SedmaLekceFluent.SedmaLekce;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RedmineMainPageFluent extends AbstractPageFluent {

    @FindBy(how = How.XPATH, using = "//div[@id='top-menu']//a[@class='help']")
    private WebElement helpAnchor;

    WebDriver driver;

    public RedmineMainPageFluent(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public RedmineHelpPageFluent clickOnHelpAnchor() {
        helpAnchor.click();
        return new RedmineHelpPageFluent (driver);
    }


}
