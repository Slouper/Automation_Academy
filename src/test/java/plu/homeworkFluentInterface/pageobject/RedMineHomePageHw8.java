package plu.homeworkFluentInterface.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RedMineHomePageHw8 extends BasePageHw8 {

    @FindBy(how = How.XPATH, using = "//a[@class='login']")
    private WebElement loginAnch;

    public RedMineHomePageHw8(WebDriver driver) {
        super(driver);
        driver.get("http://www.redmine.org/");
    }

    public RedMineLoginPageHw8 clickOnLoginAnchor(){
        loginAnch.click();
        return new RedMineLoginPageHw8(getDriver());
    }
}
