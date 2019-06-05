package ASE.lecture7.ex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Ase_WebBrowserAutomationPage {
    @FindBy(how = How.XPATH, using = "//*[@id='mainContent']/h2[1]")
    private WebElement articleTitle;

    public Ase_WebBrowserAutomationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String getArticleTitleValue(){
        return articleTitle.getText();
    }

}
