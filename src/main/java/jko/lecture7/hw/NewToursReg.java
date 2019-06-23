package jko.lecture7.hw;

import PSL.lecture8.lc.base.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewToursReg extends AbstractPage {

    @FindBy(how = How.XPATH, using = "//*[@name='firstName']")
    private WebElement firstName;

    @FindBy(how = How.XPATH, using = "//*[@name='lastName']")
    private WebElement lastName;

    @FindBy(how = How.XPATH, using = "//*[@name='phone']")
    private WebElement phone;

    @FindBy(how = How.XPATH, using = "//*[@name='userName']")
    private WebElement userName;

    @FindBy(how = How.XPATH, using = "//*[@name='address1']")
    private WebElement address1;

    @FindBy(how = How.XPATH, using = "//*[@name='address2']")
    private WebElement address2;

    @FindBy(how = How.XPATH, using = "//*[@name='city']")
    private WebElement city;

    @FindBy(how = How.XPATH, using = "//*[@name='state']")
    private WebElement state;

    @FindBy(how = How.XPATH, using = "//*[@name='postalCode']")
    private WebElement postalCode;

    @FindBy(how = How.XPATH, using = "//*[@name='email']")
    private WebElement email;

    @FindBy(how = How.XPATH, using = "//*[@name='password']")
    private WebElement password;

    @FindBy(how = How.XPATH, using = "//*[@name='confirmPassword']")
    private WebElement confirmPassword;

    @Override
    protected boolean isOpen() {
        return firstName.isDisplayed();
    }

    public NewToursReg(WebDriver driver) {
        super(driver);
    }


    public NewToursReg fillFirstName(String firstName) {
        this.firstName.sendKeys(firstName);
        return this;
    }

    public NewToursReg fillLastName(String lastName) {
        this.lastName.sendKeys(lastName);
        return this;
    }

    public NewToursReg fillPhone(String phone) {
        this.phone.sendKeys(phone);
        return this;
    }

    public NewToursReg fillUserName(String userName) {
        this.userName.sendKeys(userName);
        return this;
    }

    public NewToursReg fillAddress1(String address1) {
        this.address1.sendKeys(address1);
        return this;
    }

    public NewToursReg fillAddress2(String address2) {
        this.address2.sendKeys(address2);
        return this;
    }

    public NewToursReg fillCity(String city) {
        this.city.sendKeys(city);
        return this;
    }

    public NewToursReg fillState(String state) {
        this.state.sendKeys(state);
        return this;
    }

    public NewToursReg fillPostalCode(String postalCode) {
        this.postalCode.sendKeys(postalCode);
        return this;
    }

    public NewToursReg fillEmail(String email) {
        this.email.sendKeys(email);
        return this;
    }

    public NewToursReg fillPassword(String password) {
        this.password.sendKeys(password);
        return this;
    }

    public NewToursReg fillConfirmPassword(String confirmPassword) {
        this.confirmPassword.sendKeys(confirmPassword);
        return this;
    }
}
