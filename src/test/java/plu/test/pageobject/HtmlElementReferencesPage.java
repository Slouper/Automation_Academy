package plu.test.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;
import plu.pageobject.BasePage;

public class HtmlElementReferencesPage extends BasePage {

    @FindBy(how = How.XPATH, using = "//td[@class='html5badge']//a[@href='tag_track.asp'][contains(text(),'<track>')]")
    private WebElement trackElement;


    public HtmlElementReferencesPage(WebDriver driver) {
        super(driver);
    }

    public void clickTrackElement(){
        trackElement.click();

    }

   public void isOpen() {
        new WebDriverWait(getDriver(), 20).until(ExpectedConditions -> trackElement.isDisplayed());
    }
}
