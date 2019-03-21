package marek.pageObject_lection7;

import marek.pageObject.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class RedmineMainPageXPatch extends AbstractPage {


    @FindBy(how = How.XPATH, using = "//div[@id='top-menu']//a[@class='help']")
    private WebElement helpAnchor;


    public RedmineMainPageXPatch(WebDriver driver) {
        super(driver);
    }

    public void clickOnHelpAnchore() {
        helpAnchor.click();
    }
}
