package marek.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class RedmineLoginPage extends AbstractPage {


    @FindBy(how = How.XPATH, using = "//*[@class='register']")
    private WebElement register;

    @FindBy(how = How.XPATH, using = "//*[@id='username']")
    private WebElement userName;

    @FindBy(how = How.XPATH, using = "//*[@id='password']")
    private WebElement password;

    @FindBy(how = How.XPATH, using = "//*[@name='login']")
    private WebElement login;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Účet byl úspěšně vytvořen')]")
    private WebElement created;

    @FindBy(how = How.XPATH, using = "//*[@id='flash_error']")
    private WebElement error;

    public RedmineLoginPage(WebDriver driver) {
        super(driver);
    }

    public void SearchRegister() {
        register.click();
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

    public WebElement SearchCreated() {
        return created;
    }

    public WebElement SearchError() {
        return error;
    }

}
