package ASE.lecture8.ex;

import ASE.lecture8.ex.base.AseAbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Ase_WebBrowserAutomationPage extends AseAbstractPage {
    @FindBy(how = How.XPATH, using = "//*[@id='mainContent']/h2[1]")
    private WebElement articleTitle;

    public Ase_WebBrowserAutomationPage(WebDriver driver) {
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
