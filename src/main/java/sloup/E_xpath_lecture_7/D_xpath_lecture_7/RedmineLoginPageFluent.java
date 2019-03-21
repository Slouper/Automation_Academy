package sloup.E_xpath_lecture_7.D_xpath_lecture_7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RedmineLoginPageFluent extends AbstractPageXpathFluent {

    @FindBy(how = How.XPATH, using = "//input[@name='username']")
    private WebElement usernameInput;

    @FindBy(how = How.XPATH, using = "//input[@name='password']")
    private WebElement passwordInput;

    @FindBy(how = How.XPATH, using = "//input[@name='login']")
    private WebElement loginButton;

    public RedmineLoginPageFluent(WebDriver driver) {
        super(driver);
    }

    public RedmineLoginPageFluent fillUsernameInput(String username) {
        usernameInput.sendKeys(username);
        return this;
    }

    public RedmineLoginPageFluent fillPasswordInput(String password) {
        passwordInput.sendKeys(password);
        return this;
    }

    public RedmineMainPageFluent clickLoginButton(WebDriver driver) {
        loginButton.click();
        return new RedmineMainPageFluent(driver);
    }
}
