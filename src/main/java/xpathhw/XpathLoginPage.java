package xpathhw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XpathLoginPage extends XpathAbstract {

    @FindBy(how = How.XPATH, using = "//input[@id='username']")
    private WebElement xpathUsernameLogin;

    @FindBy(how = How.XPATH, using = "//input[@id='password']")
    private WebElement xpathUsernamePassword;

    @FindBy(how = How.XPATH, using = "//input[@name='login']")
    private WebElement xpathClickLoginButton;

    public XpathLoginPage(WebDriver driver) {
        super(driver);
    }

    public void xpathUsernameLogin(String Expression) {
        xpathUsernameLogin.sendKeys(Expression);
    }

    public void xpathUsernamePassword(String Expression) {
        xpathUsernamePassword.sendKeys(Expression);
    }

    public void xpathClickLoginButton() {
        xpathClickLoginButton.click();

    }
    protected void isOpen() {
        new WebDriverWait(getDriver(), 20).until(ExpectedConditions -> xpathClickLoginButton.isDisplayed());
    }
}
