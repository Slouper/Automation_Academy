package lma.xpathhw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class XpathHomePage extends XpathAbstract {

    @FindBy(how = How.CLASS_NAME, using = "login")
    private WebElement xpathLoginButton;

    public XpathHomePage(WebDriver driver){
        super(driver);
    }
    public void xpathLoginButton(){
        xpathLoginButton.isDisplayed();
        xpathLoginButton.click();
    }
    protected void isOpen() {
        getWait().until(ExpectedConditions -> xpathLoginButton.isDisplayed());
    }
}
