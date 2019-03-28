package marek.pageObject_HW8;

import marek.pageObject.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class RedmineMainPage8 extends AbstractPage {

    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//div[@id='top-menu']//a[@class='help']")
    private WebElement helpAnchor;


    public RedmineMainPage8(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public RedmineHelpPage8 clickOnHelpAnchor(){
        helpAnchor.click();
        return new RedmineHelpPage8(driver);
    }
}
