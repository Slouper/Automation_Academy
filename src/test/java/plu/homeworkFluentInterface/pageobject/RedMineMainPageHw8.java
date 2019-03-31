package plu.homeworkFluentInterface.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RedMineMainPageHw8 extends BasePageHw8 {

    @FindBy(how = How.XPATH, using = "//div[@id='top-menu']//a[@class='help']")
    private WebElement helpAnchor;


    public RedMineMainPageHw8(WebDriver driver) {

        super(driver);
    }

    public RedMineHelpPageHw8 clickOnHelpAnchor () {

        helpAnchor.click();
        return new RedMineHelpPageHw8(getDriver());
    }
}
