package PSL.lecture7.pc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class WebBrowserAutomationPage {

    @FindBy(how = How.XPATH, using = "//*[@id='mainContent']/h2[1]")
    private WebElement articleTitle;

    public WebBrowserAutomationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String getArticleTitleValue() {
        return articleTitle.getText();
    }

}
