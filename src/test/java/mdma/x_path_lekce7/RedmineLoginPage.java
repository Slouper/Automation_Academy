package mdma.x_path_lekce7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RedmineLoginPage extends AbstractPage {

    @FindBy(how = How.XPATH, using = "//input[@name='username']")
    private WebElement usernameInput;

    @FindBy(how = How.XPATH, using = "//input[@name='password']")
    private WebElement passwordInput;

    @FindBy(how = How.XPATH, using = "//input[@name='login']")
    private WebElement loginButton;

    public RedmineLoginPage(WebDriver driver) { super(driver); }

    @Override
    public void isOpen() {

    }

    public void fillUsernameInput (String username) {
        usernameInput.sendKeys(username);
    }

    public void fillPasswordInput (String password) {
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}
