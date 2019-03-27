package lma.redminehw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RedmineRegisterPage extends RedmineAbstract{

    @FindBy(how = How.ID, using = "user_login")
    private WebElement userLogin;

    @FindBy(how = How.ID, using = "user_password")
    private WebElement userPassword;

    @FindBy(how = How.ID, using = "user_password_confirmation")
    private WebElement userPasswordConfirmation;

    @FindBy(how = How.ID, using = "user_firstname")
    private WebElement userFirstname;

    @FindBy(how = How.ID, using = "user_lastname")
    private WebElement userLastname;

    @FindBy(how = How.ID, using = "user_mail")
    private WebElement userMail;

    @FindBy(how = How.XPATH, using = "//*[@id=\"user_language\"]/option[13]")
    private WebElement userLanguageSelect;

    @FindBy(how = How.ID, using = "user_custom_field_values_3")
    private WebElement userIrcNick;

    @FindBy(how = How.XPATH, using = "//*[@id=\"new_user\"]/input")
    private WebElement clickRegisterButton;

    public RedmineRegisterPage(WebDriver driver) {
        super(driver);
    }

    public void userLogin(String Expression) {
        userLogin.sendKeys(Expression);
    }

    public void userPassword(String Expression) {
        userPassword.sendKeys(Expression);
    }

    public void userPasswordConfirmation(String Expression) {
        userPasswordConfirmation.sendKeys(Expression);
    }

    public void userFirstname(String Expression) {
        userFirstname.sendKeys(Expression);
    }

    public void userLastname(String Expression) {
        userLastname.sendKeys(Expression);
    }

    public void userMail(String Expression) {
        userMail.sendKeys(Expression);
    }

    public void userLanguageSelect() {
        userLanguageSelect.click();
    }

    public void userIrcNick(String Expression) {
        userIrcNick.sendKeys(Expression);
    }

    public void clickRegisterButton() {
        clickRegisterButton.click();
    }
}