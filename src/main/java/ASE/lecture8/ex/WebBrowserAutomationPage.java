package ASE.lecture8.ex;

import ASE.lecture8.ex.base.AseAbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class WebBrowserAutomationPage extends AseAbstractPage {
    @FindBy(how = How.XPATH, using = "//*[@id='mainContent']/h2[1]")
    private WebElement articleTitle;

    public WebBrowserAutomationPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected boolean isOpen() {
        return articleTitle.isDisplayed();
    }


    public String getArticleTitleValue(){
        return articleTitle.getText();
    }

}
