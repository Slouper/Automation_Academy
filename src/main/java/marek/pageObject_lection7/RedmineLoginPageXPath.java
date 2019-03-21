package marek.pageObject_lection7;

import marek.pageObject.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class RedmineLoginPageXPath extends AbstractPage {


    @FindBy(how = How.XPATH, using = "//input[@id='username']")
    private WebElement userName;

    @FindBy(how = How.XPATH, using = "//input[@id='password']")
    private WebElement password;

    @FindBy(how = How.XPATH, using = "//input[@name='login']")
    private WebElement login;

    public RedmineLoginPageXPath(WebDriver driver) {
        super(driver);
    }

    public void SearchUserLogin(String user){
        userName.sendKeys(user);
    }

    public void SearchUserPassword(String pwd){
        password.sendKeys(pwd);
    }

    public void SearchLogin(){
        login.click();
    }



}
