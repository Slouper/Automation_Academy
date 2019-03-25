package marek.pageObject_HW8;

import marek.pageObject.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class RedmineRegisterPage8 extends AbstractPage {

    @FindBy(how = How.XPATH, using = "//*[@id='user_login']")
    private WebElement userLogin;

    @FindBy(how = How.XPATH, using = "//*[@id='user_password']")
    private WebElement userPassword;

    @FindBy(how = How.XPATH, using = "//*[@id='user_password_confirmation']")
    private WebElement userPasswordConfirmation;

    @FindBy(how = How.XPATH, using = "//*[@id='user_firstname']")
    private WebElement userFirstName;

    @FindBy(how = How.XPATH, using = "//*[@id='user_lastname']")
    private WebElement userLastName;

    @FindBy(how = How.XPATH, using = "//*[@id='user_mail']")
    private WebElement userMail;

    @FindBy(how = How.XPATH, using = "//*[@id='user_custom_field_values_3']")
    private WebElement customField;


    @FindBy(how = How.XPATH, using = "//*[@name='commit']")
    private WebElement commit;


    public RedmineRegisterPage8(WebDriver driver) {
        super(driver);
    }

    public void FillValues(String marek, String pwd, String name, String last, String mail, String field) {

        userLogin.sendKeys(marek);
        userPassword.sendKeys(pwd);
        userPasswordConfirmation.sendKeys(pwd);
        userFirstName.sendKeys(name);
        userLastName.sendKeys(last);
        userMail.sendKeys(mail);
        customField.sendKeys(field);
        commit.click();



    }
    }
