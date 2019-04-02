package MBA.SedmaLekce;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RedmineMainPage extends AbstractPage {

    @FindBy(how = How.XPATH, using = "//div[@id='top-menu']//a[@class='help']")
    private WebElement helpAnchor;


    public RedmineMainPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnHelpAnchor() {
        helpAnchor.click();
    }


}
