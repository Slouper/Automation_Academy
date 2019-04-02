package lma.finalobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HtmlTagReferencePage extends AbstractPage {

    @FindBy(how = How.XPATH, using = "//*[@id='sncmp-banner-btn-agree']")
    private WebElement cookieButton;

    @FindBy(how = How.XPATH, using = "//*[@id='htmltags']/table/tbody/tr[114]/td[1]/a")
    private WebElement tagTrack;

    public HtmlTagReferencePage(WebDriver driver) {
        super(driver);
        getWait().until(ExpectedConditions.visibilityOf(tagTrack));
    }


    public HtmlTagReferencePage cookieButton() {
        cookieButton.click();
        return this;
    }

    public TrackTagPage tagTrack() {
        tagTrack.click();
        return new TrackTagPage(getDriver());
    }
}