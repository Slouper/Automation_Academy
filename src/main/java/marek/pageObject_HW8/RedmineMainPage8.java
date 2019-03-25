package marek.pageObject_HW8;

import marek.pageObject.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class RedmineMainPage8 extends AbstractPage {


    @FindBy(how = How.XPATH, using = "//div[@id='top-menu']//a[@class='help']")
    private WebElement helpAnchor;


    public RedmineMainPage8(WebDriver driver) {
        super(driver);
    }

    public RedmineReportPage8 clickOnHelpAnchor(WebDriver driver){
        helpAnchor.click();
        return new RedmineReportPage8(driver);
    }
}
