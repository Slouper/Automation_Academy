package jko.test;

import jko.test.base.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RedmineLoginPage extends AbstractPage {

    @FindBy(how = How.XPATH, using = "//*[@id='username']")
    private WebElement userNameInput;

    @FindBy(how = How.XPATH, using = "//*[@id='password']")
    private WebElement passwordInput;

    @FindBy(how = How.XPATH, using = "//*[@name='login']")
    private WebElement loginButton;

    RedmineLoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected boolean isOpen() {
        return userNameInput.isDisplayed();
    }

    RedmineLoginPage fillUserName(String userName) {
        userNameInput.sendKeys(userName);
        return this;
    }

    RedmineLoginPage fillPassword(String password) {
        passwordInput.sendKeys(password);
        return this;
    }

    RedmineHomePage clickOnLoginButton() {
        loginButton.click();
        return new RedmineHomePage(getDriver());
    }
}
