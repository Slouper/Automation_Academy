package plu.homeworkFluentInterface.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RedMineLoginPageHw8 extends BasePageHw8 {

    @FindBy(how = How.XPATH, using = "//input[@id='username']")
    private WebElement userNameXpath;

    @FindBy(how = How.XPATH, using = "//input[@id='password']")
    private WebElement passwordXpath;

    @FindBy(how = How.XPATH, using = "//input[@type='submit']")
    private WebElement loginButtonXpath;

    @FindBy (how = How.ID, using = "flash_error")
    private WebElement flashError;

    public RedMineLoginPageHw8(WebDriver driver) {
        super(driver);
    }

    public RedMineLoginPageHw8 fillUsernameInput(String username) {

        userNameXpath.sendKeys(username);
        return this;
    }

    public RedMineLoginPageHw8 fillPasswordInput(String password) {

        passwordXpath.sendKeys(password);
        return this;
    }

    public RedMineMainPageHw8 clickLoginButtonXpath(WebDriver driver) {

        loginButtonXpath.click();
        return new RedMineMainPageHw8(driver);
    }
}
