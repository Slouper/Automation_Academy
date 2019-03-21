package mdma.pageobject.monika.ukol;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import javax.swing.*;

public class RedmineRegistrePage extends AbstractPageDU {
    public RedmineRegistrePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//input[@name='user[login]']")
    private WebElement login;

    public void insertLogin(String input) {
        login.sendKeys(input);
    }

    @FindBy(how = How.XPATH, using = "//input[@name='user[password]']")
    private WebElement password;

    public void insertPassword(String input) {
        password.sendKeys(input);
    }

    @FindBy(how = How.XPATH, using = "//input[@name='user[password_confirmation]']")
    private WebElement password_confirmation;

    public void insertPassword_confirmation(String input) {
        password_confirmation.sendKeys(input);
    }

    @FindBy(how = How.XPATH, using = "//input[@name='user[firstname]']")
    private WebElement name;

    public void insertName(String input) {
        name.sendKeys(input);
    }

    @FindBy(how = How.XPATH, using = "//input[@name='user[lastname]']")
    private WebElement lastName;

    public void insertLastName(String input) {
        lastName.sendKeys(input);
    }

    @FindBy(how = How.XPATH, using = "//input[@name='user[mail]']")
    private WebElement email;

    public void insertEmail(String input) {
        email.sendKeys(input);
    }

    @FindBy(how = How.NAME, using = "commit")
    private WebElement button;

    public void clickEnter() {
        button.click();
    }


}
