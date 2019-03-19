package plu.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedMineLoginPage extends BasePage {

    @FindBy(how = How.ID, using = "username")
    private WebElement userName;

    @FindBy(how = How.ID, using = "password")
    private WebElement password;

    @FindBy(how = How.XPATH, using = "//*[@name='login']")
    private WebElement loginButton;

    @FindBy (how = How.ID, using = "flash_error")
    private WebElement flashError;

    public RedMineLoginPage(WebDriver driver) {
        super(driver);
    }

    public void setUserName(String userNameText) {
        userName.sendKeys(userNameText);
    }
    public void setPassword(String passwordText) {
        password.sendKeys(passwordText);
    }
    public void clickLoginButton() {
        loginButton.click();
    }
    public void getFlashError(){
        System.out.println(flashError.getText());
    }

    protected void isOpen() {
        new WebDriverWait(getDriver(), 20).until(ExpectedConditions -> loginButton.isDisplayed());
    }
}
