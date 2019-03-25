package redminehw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RedmineHomePage extends RedmineAbstract {

    @FindBy(how = How.CLASS_NAME, using = "register")
    private WebElement registerButton;

    public RedmineHomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnRegister() {
        registerButton.click();
    }
}