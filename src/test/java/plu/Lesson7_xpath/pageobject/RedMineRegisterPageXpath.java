package plu.Lesson7_xpath.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;
import plu.pageobject.BasePage;

public class RedMineRegisterPageXpath extends BasePage {

    @FindBy(how = How.ID, using = "user_login")
    private WebElement userLogin;

    @FindBy(how = How.ID, using = "user_password")
    private WebElement userPassword;

    @FindBy(how = How.ID, using = "user_password_confirmation")
    private WebElement userPasswordConfirmation;

    @FindBy(how = How.ID, using = "user_firstname")
    private WebElement userFirstName;

    @FindBy(how = How.ID, using = "user_lastname")
    private WebElement userLastName;

    @FindBy(how = How.ID, using = "user_mail")
    private WebElement userMail;

    @FindBy(how = How.ID, using = "user_language")
    private WebElement userLanguage;

    @FindBy(how = How.ID, using = "user_custom_field_values_3")
    private WebElement userCustomFieldValues3;

    @FindBy(how = How.XPATH, using = "//*[@name='commit']")
    private WebElement submitButton;

    @FindBy(how = How.ID, using = "flash_notice")
    private WebElement flashNotice;

    public RedMineRegisterPageXpath(WebDriver driver) {
        super(driver);
    }

    public void insertUserLogin (String userLoginText){
        userLogin.sendKeys(userLoginText);
    }
    public void insertUserPassword(String userPasswordText){
        userPassword.sendKeys(userPasswordText);
    }
    public void insertUserPasswordConfirmation (String userPasswordConfirmationText){
        userPasswordConfirmation.sendKeys(userPasswordConfirmationText);
    }
    public void insertFirstName (String userFirstNameText){
        userFirstName.sendKeys(userFirstNameText);
    }
    public void insertLastName (String userLastNameText){
        userLastName.sendKeys(userLastNameText);
    }
    public void insertUserMail (String userMailText){
        userMail.sendKeys(userMailText);
    }
    public void insertUserLanguage (String userLanguageText){
        userLanguage.sendKeys(userLanguageText);
    }
    public void insertUserCustomFieldValues3 (String userCustomFieldValues3Text){
        userCustomFieldValues3.sendKeys(userCustomFieldValues3Text);
    }
    public void clickSubmitButton(){
        submitButton.click();
    }
    public void getFlashNotice(){
        System.out.println(flashNotice.getText());
    }

    public void isOpen() {
        new WebDriverWait(getDriver(), 20).until(ExpectedConditions -> submitButton.isDisplayed());
    }
}
