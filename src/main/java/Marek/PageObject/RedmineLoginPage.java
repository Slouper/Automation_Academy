package Marek.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class RedmineLoginPage extends RedmineRegisterPage {


    @FindBy(how = How.XPATH, using = "//*[@class='register']")
    private WebElement register;

    @FindBy(how = How.XPATH, using = "//*[@id='username']")
    private WebElement userName;

    @FindBy(how = How.XPATH, using = "//*[@id='password']")
    private WebElement password;

    @FindBy(how = How.XPATH, using = "//*[@name='login']")
    private WebElement login;

    public RedmineLoginPage(WebDriver driver) {
        super(driver);
    }

    public void SearchRegister() {
        register.click();
    }

    public void SearchUserLogin(){
        userName.sendKeys(user);
    }

    public void SearchUserPassword(String expression){
        password.sendKeys(expression);
    }

    public void SearchLogin(){
        login.click();
    }

}
