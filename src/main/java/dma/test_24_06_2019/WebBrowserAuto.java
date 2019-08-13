package dma.test_24_06_2019;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class WebBrowserAuto {
    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//*[@class='home']")
    private WebElement homePage;

    public WebBrowserAuto searchLogin() {
        homePage.click();
        return this;
    }

    @FindBy(how = How.XPATH, using = "//*[@class='issues']")
    private WebElement ukoly;

    public WebBrowserAuto ukoly() {
        ukoly.click();
        return this;
    }
    @FindBy(how = How.XPATH, using = "//select[@name='op[status_id]']")
    private WebElement status;

    public WebBrowserAuto status() {
        status.click("uzavřený");
        return this;
    }
}
