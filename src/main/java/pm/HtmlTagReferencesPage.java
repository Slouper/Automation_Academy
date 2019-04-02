package pm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HtmlTagReferencesPage extends AbstractPage {

    @FindBy(how = How.XPATH, using = "//*[@id='htmltags']//a[@href='tag_track.asp']")
    private WebElement tagTrack;
    @FindBy(how = How.ID, using = "searchstring")
    private WebElement searchString;
    @FindBy(how = How.XPATH, using = "//*[@id=\"sncmp-banner-btn-agree\"]\n")
    private WebElement podelanaKukina;


    public HtmlTagReferencesPage(WebDriver driver) {
        super(driver);
        wait.until(ExpectedConditions.visibilityOf(searchString));
    }

    public void clickOnTagTrack() {
        tagTrack.click();
    }

    public HtmlTagReferencesPage moveToTagTrack() {
        getActions().moveToElement(tagTrack).perform();
        return this;
    }

    public HtmlTagReferencesPage clickOnPodelanaKukina() {
        podelanaKukina.click();
        return this;
    }
}
