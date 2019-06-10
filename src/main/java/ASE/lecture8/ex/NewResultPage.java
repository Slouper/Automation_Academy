package ASE.lecture8.ex;

import ASE.lecture8.ex.base.AseAbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewResultPage extends AseAbstractPage {

    @FindBy(how = How.XPATH, using = "//a[@class='Result-title-link'][1]")
    private WebElement firstResultLink;

    //super driver z abstraktni tridy
    public NewResultPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected boolean isOpen() {
        return firstResultLink.isDisplayed();
    }


//    public void clickOnFirstResultLink() {
//        firstResultLink.click();
//    }

    public WebBrowserAutomationPage clickOnFirstResultLink(){
        firstResultLink.click();
        return new WebBrowserAutomationPage(getDriver());

    }

}
