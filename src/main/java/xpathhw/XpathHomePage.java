package xpathhw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XpathHomePage extends XpathAbstract {

    @FindBy(how = How.CLASS_NAME, using = "login")
    private WebElement xpathLoginButton;

    public XpathHomePage(WebDriver driver){
        super(driver);
    }
    public void xpathLoginButton(){
        xpathLoginButton.click();
    }
    protected void isOpen() {
        new WebDriverWait(getDriver(), 20).until(ExpectedConditions -> xpathLoginButton.isDisplayed());
    }
}
