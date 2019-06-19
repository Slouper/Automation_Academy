package ASE.lecture7.hw.pageObjects;

import ASE.lecture7.hw.base.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewtoursRegisterPage extends AbstractPage {

    @FindBy(how = How.NAME, using = "firstName")
    private WebElement firstName;

    @FindBy(how= How.NAME, using="lastName")
    private WebElement lastName;

    @FindBy(how= How.NAME, using="phone")
    private WebElement phone;

    @FindBy(how= How.ID, using="userName")
    private WebElement userName;

    @FindBy(how= How.XPATH, using="//input[@name='address1']")
    private WebElement address;

    @FindBy(how= How.NAME, using="city")
    private WebElement city;

    @FindBy(how= How.NAME, using="state")
    private WebElement state;

    @FindBy(how= How.NAME, using="postalCode")
    private WebElement postalCode;

    @FindBy(how= How.NAME, using="country")
    private WebElement country;

    @FindBy(how= How.ID, using="email")
    private WebElement email;

    @FindBy(how= How.NAME, using="password")
    private WebElement password;

    @FindBy(how= How.NAME, using="confirmPassword")
    private WebElement confirmPassword;

    //super driver z abstraktni tridy
    public NewtoursRegisterPage(WebDriver driver) {
        super(driver);
    }

    public String getEmailValue(){
        return email.getAttribute("value");
    }


    @Override
    protected boolean isOpen(WebElement element){
        return element.isDisplayed();
    }

    @Override
    protected boolean isOpen() {
        return confirmPassword.isDisplayed() && country.isDisplayed();
    }

    public NewtoursRegisterPage enterFirstName(String firstNameExpression){
        firstName.sendKeys(firstNameExpression);
        return this;
    }

    public NewtoursRegisterPage enterLastName(String lastNameExpression){
        lastName.sendKeys(lastNameExpression);
        return this;
    }

    public NewtoursRegisterPage enterPhone(String phoneExpression){
        phone.sendKeys(phoneExpression);
        return this;
    }

    public NewtoursRegisterPage enterUserName(String userNameExpression){
        userName.sendKeys(userNameExpression);
        return this;
    }

    public NewtoursRegisterPage enterAddress(String addressExpression){
        address.sendKeys(addressExpression);
        return this;
    }

    public NewtoursRegisterPage enterCity(String cityExpression){
        city.sendKeys(cityExpression);
        return this;
    }

    public NewtoursRegisterPage enterState(String stateExpression){
        state.sendKeys(stateExpression);
        return this;
    }

    public NewtoursRegisterPage enterPostalCode(String postalCodeExpression){
        postalCode.sendKeys(postalCodeExpression);
        return this;
    }

    public NewtoursRegisterPage enterCountry(String countryExpression){
        country.sendKeys(countryExpression);
        return this;
    }


    public NewtoursRegisterPage enterEmail(String emailExpression){
        email.sendKeys(emailExpression);
        return this;
    }

    public NewtoursRegisterPage enterPassword(String passwordExpression){
        password.sendKeys(passwordExpression);
        return this;
    }

    public NewtoursRegisterPage confirmPassword(String confirmPasswordExpression){
        confirmPassword.sendKeys(confirmPasswordExpression);
        return this;
    }

}
