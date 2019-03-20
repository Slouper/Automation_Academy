package RedmineHW;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RedmineLoginPage extends RedmineAbstract {

    @FindBy(how = How.XPATH, using = "//input[@id='username']")
    private WebElement usernameLogin;

    @FindBy(how = How.XPATH, using = "//input[@id='password']")
    private WebElement usernamePassword;

    @FindBy(how = How.XPATH, using = "//input[@name='login']")
    private WebElement clickLoginButton;

    public RedmineLoginPage(WebDriver driver) {
        super(driver);
    }

    public void usernameLogin(String Expression) {
        usernameLogin.sendKeys(Expression);
    }

    public void usernamePassword(String Expression) {
        usernamePassword.sendKeys(Expression);
    }

    public void clickLoginButton() {
        clickLoginButton.click();
    }
}