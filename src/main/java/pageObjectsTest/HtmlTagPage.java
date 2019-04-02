package pageObjectsTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HtmlTagPage extends AbstractPage {




    public HtmlTagPage(WebDriver driver) {
        super(driver);
        getWait().until(ExpectedConditions.visibilityOf(trackTag));
    }



    @FindBy (how = How.XPATH, using = "//*[@id='sncmp-banner-btn-agree']")
    private WebElement cookies;

    @FindBy(how = How.XPATH, using = "//*[@id='htmltags']/table/tbody/tr[114]/td[1]/a")
    private WebElement trackTag;

    public HtmlTagPage clickOnTrackTag(WebDriver driver) {
        cookies.click();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN)
                .perform();


        trackTag.click();
        return this;
    }
}
