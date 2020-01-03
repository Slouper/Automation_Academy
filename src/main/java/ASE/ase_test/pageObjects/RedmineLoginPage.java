package ASE.ase_test.pageObjects;

import ASE.ase_test.base.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RedmineLoginPage extends AbstractPage {

    @FindBy(how = How.ID, using = "username")
    private WebElement userName;

    @FindBy(how = How.NAME, using = "password")
    private WebElement password;

    @FindBy(how = How.NAME, using = "login")
    private WebElement loginButton;


    //super driver z abstraktni tridy
    public RedmineLoginPage(WebDriver driver) {
        super(driver);
    }

//    public String getEmailValue() {
//        return email.getAttribute("value");
//    }


    @Override
    protected boolean isOpen(WebElement element) {
        return element.isDisplayed();
    }

    @Override
    protected boolean isOpen() {
        return userName.isDisplayed() && password.isDisplayed();
    }

    public RedmineLoginPage enterUserName(String userNameExpression) {
        userName.sendKeys(userNameExpression);
        return this;
    }

    public RedmineLoginPage enterPassword(String passwordExpression) {
        password.sendKeys(passwordExpression);
        return this;
    }

    public RedmineResultPage clickOnLoginButton() {
        loginButton.click();
        return new RedmineResultPage(getDriver());
    }

}
