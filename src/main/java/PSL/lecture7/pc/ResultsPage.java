package PSL.lecture7.pc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ResultsPage {
    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//a[@class='Result-title-link'][1]")
    private WebElement firstResultLink;

    public ResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebBrowserAutomationPage clickOnFirstResultLink() {
        firstResultLink.click();
        return new WebBrowserAutomationPage(driver);
    }
}
