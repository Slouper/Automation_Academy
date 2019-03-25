package fluenthw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FluentLoginPage extends FluentAbstract{
    @FindBy(how = How.XPATH, using = "//input[@id='username']")
    private WebElement fluentUsernameLogin;

    @FindBy(how = How.XPATH, using = "//input[@id='password']")
    private WebElement fluentUsernamePassword;

    @FindBy(how = How.XPATH, using = "//input[@name='login']")
    private WebElement fluentClickLoginButton;

    public FluentLoginPage(WebDriver driver) {
        super(driver);
    }

    public FluentLoginPage fluentUsernameLogin(String Expression) {
        fluentUsernameLogin.sendKeys(Expression);
        return this;
    }

    public FluentLoginPage fluentUsernamePassword(String Expression) {
        fluentUsernamePassword.sendKeys(Expression);
        return this;
    }

    public FluentMainPage fluentClickLoginButton() {
        fluentClickLoginButton.click();
        return new FluentMainPage(getDriver());
    }
}
