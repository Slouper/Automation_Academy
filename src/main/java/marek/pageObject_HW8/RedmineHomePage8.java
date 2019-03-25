package marek.pageObject_HW8;

import marek.pageObject.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class RedmineHomePage8 extends AbstractPage {


    public Object clickOnLoginAnchor;
    @FindBy(how = How.XPATH, using = "//a[@class='login']")
    private WebElement loginAnchor;

    public RedmineHomePage8(WebDriver driver) {super(driver);}

    //public void SearchLoginAnchor() {loginAnchor.click();}

    //z nove lekce pro zjednoduseni-vratim si to, s cim chci pracovat - pak s LoginPage
    public RedmineLoginPage8 clickOnLoginAnchor(WebDriver driver){
        loginAnchor.click();
        return new RedmineLoginPage8(driver);
    }

}
