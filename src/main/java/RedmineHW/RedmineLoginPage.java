package RedmineHW;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RedmineLoginPage extends RedmineAbstract {

    @FindBy(how = How.ID, using = "username")
    private WebElement usernameLogin;

    @FindBy(how = How.ID, using = "password")
    private WebElement usernamePassword;

    @FindBy(how = How.XPATH, using = "//*[@id=\"login-form\"]/form/table/tbody/tr[4]/td[2]/input")
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