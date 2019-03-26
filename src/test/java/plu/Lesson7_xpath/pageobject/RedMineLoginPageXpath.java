package plu.Lesson7_xpath.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedMineLoginPageXpath extends BasePageXpath {

    @FindBy(how = How.XPATH, using = "//input[@id='username']")
    private WebElement userNameXpath;

    @FindBy(how = How.XPATH, using = "//input[@id='password']")
    private WebElement passwordXpath;

    @FindBy(how = How.XPATH, using = "//input[@type='submit']")
    private WebElement loginButtonXpath;

    @FindBy (how = How.ID, using = "flash_error")
    private WebElement flashError;

    public RedMineLoginPageXpath(WebDriver driver) {
        super(driver);
    }

    public void fillUsernameInput(String username) {

        userNameXpath.sendKeys(username);
    }

    public void fillPasswordInput(String password) {
        passwordXpath.sendKeys(password);
    }

    public void clickLoginButtonXpath() {

        loginButtonXpath.click();
    }

    public void getFlashError(){

        System.out.println(flashError.getText());
    }

    public void isOpen() {
        new WebDriverWait(getDriver(), 20).until(ExpectedConditions -> loginButtonXpath.isDisplayed());
    }
}
