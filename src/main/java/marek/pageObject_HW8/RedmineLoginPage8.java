package marek.pageObject_HW8;

import marek.pageObject.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class RedmineLoginPage8 extends AbstractPage {


    @FindBy(how = How.XPATH, using = "//input[@id='username']")
    private WebElement userName;

    @FindBy(how = How.XPATH, using = "//input[@id='password']")
    private WebElement password;

    @FindBy(how = How.XPATH, using = "//input[@name='login']")
    private WebElement login;

    public RedmineLoginPage8(WebDriver driver) {
        super(driver);
    }

    public RedmineMainPage8 inputLoginAnchor(WebDriver driver, String user, String pwd){
        userName.sendKeys(user);
        password.sendKeys(pwd);
        login.click();
        return new RedmineMainPage8(driver);
    }
}
