package dma.Lekce8.cv;

import dma.Lekce8.cv.base.AbstractPage8;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class WebBrowserAutomationPage extends AbstractPage8 {

    @FindBy(how = How.XPATH, using = "//div[@id='mainContent']/h2[1]")
    private WebElement artitcleTitle;

    @Override
    protected boolean isOpen() {
        return artitcleTitle.isDisplayed();
    }

    public WebBrowserAutomationPage(WebDriver driver) {
        PageFactory.initElements(driver,this);

    }
    public String getArtitcleTitleValue () {
        return artitcleTitle.getText();
    }
}