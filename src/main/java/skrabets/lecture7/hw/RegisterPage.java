package skrabets.lecture7.hw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
  private WebDriver wd;

  @FindBy(how = How.XPATH, using = "//table/tbody//tr//td//input[@name='firstName']")
  private WebElement firstNameInputField;

  @FindBy(how = How.XPATH, using = "//table/tbody//tr//td//input[@name='lastName']")
  private WebElement lastNameInputField;

  @FindBy(how = How.XPATH, using = "//table/tbody//tr//td//input[@name='phone']")
  private WebElement phoneInputField;

  @FindBy(how = How.XPATH, using = "//table/tbody//tr//td//input[@name='userName']")
  private WebElement emailInputField;

  @FindBy(how = How.XPATH, using = "//table/tbody//tr//td//input[@name='address1']")
  private WebElement addressFirstInputField;

  @FindBy(how = How.XPATH, using = "//table/tbody//tr//td//input[@name='address2']")
  private WebElement addressSecondInputInputField;

  @FindBy(how = How.XPATH, using = "//table/tbody//tr//td//input[@name='city']")
  private WebElement cityInputField;

  @FindBy(how = How.XPATH, using = "//table/tbody//tr//td//input[@name='state']")
  private WebElement stateInputField;

  @FindBy(how = How.XPATH, using = "//table/tbody//tr//td//input[@name='postalCode']")
  private WebElement PostalCodeInputField;

  @FindBy(how = How.XPATH, using = "//table/tbody//tr//td//select[@name='country']")
  private WebElement countryList;

  @FindBy(how = How.XPATH, using = "//table/tbody//tr//td//input[@name='email']")
  private WebElement userNameInputField;

  @FindBy(how = How.XPATH, using = "//table/tbody//tr//td//input[@name='password']")
  private WebElement passwordInputField;

  @FindBy(how = How.XPATH, using = "//table/tbody//tr//td//input[@name='confirmPassword']")
  private WebElement confirmPasswordInputField;

  public RegisterPage(WebDriver wd){
    this.wd = wd;
    PageFactory.initElements(wd, this);
  }

  public RegisterPage inputFristName(String firstName){
    firstNameInputField.sendKeys(firstName);
    return this;
  }

  public RegisterPage inputLastName(String lastName){
    lastNameInputField.sendKeys(lastName);
    return this;

  }

  public RegisterPage inputPhone(String phone){
    phoneInputField.sendKeys(phone);
    return this;
  }

  public RegisterPage inputEmail(String email){
    emailInputField.sendKeys(email);
    return this;
  }

  public RegisterPage inputAddress1(String address1){
    addressFirstInputField.sendKeys(address1);
    return this;
  }

  public RegisterPage inputAddress2(String address2){
    addressSecondInputInputField.sendKeys(address2);
    return this;
  }

  public RegisterPage inputCity(String city){
    cityInputField.sendKeys(city);
    return this;
  }

  public RegisterPage inputState(String state){
    stateInputField.sendKeys(state);
    return this;
  }

  public RegisterPage inputPostalCode(String postalCode){
    PostalCodeInputField.sendKeys(postalCode);
    return this;
  }

  public RegisterPage selectCountry(String country){
    new Select(countryList).selectByVisibleText(country);
    return this;
  }

  public RegisterPage inputUserName(String userName){
    userNameInputField.sendKeys(userName);
    return this;
  }

  public RegisterPage inputPasword(String password){
    passwordInputField.sendKeys(password);
    return this;
  }
  public RegisterPage confirmPasword(String confirmPasword){
    confirmPasswordInputField.sendKeys(confirmPasword);
    return this;
  }
}
