package jko.lecture8.lc;

import jko.lecture8.lc.base.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class WebBrowserAutomationPage extends AbstractPage {

    @FindBy(how = How.XPATH, using = "//*[@id='mainContent']/h2[1]")
    private WebElement articleTitle;

    @Override
    protected boolean isOpen() {
        return articleTitle.isDisplayed();
    }

    public WebBrowserAutomationPage(WebDriver driver) {
        super(driver);
    }


    public String getArticleTitleValue() {
        return articleTitle.getText();
    }

}
