package dma.test_24_06_2019;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RedimeLogin {
    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//*[@id='username']")
    private WebElement clickUserName;

    @FindBy(how = How.XPATH, using = "//*[@id='password']")
    private WebElement clickPassword;

    @FindBy(how = How.XPATH, using = "//*[@name='login']")
    private WebElement clickLogin;

    public RedimeLogin(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public RedimeLogin clickLogin() {
        clickLogin.click();
        return new RedimeLogin(driver);
    }

    public RedimeLogin clickUserName() {
        clickUserName.sendKeys("dmalek");
        return new RedimeLogin(driver);
    }

    public RedimeLogin clickPassword() {
        clickPassword.sendKeys("dmalek");
        return new RedimeLogin(driver);
    }


}