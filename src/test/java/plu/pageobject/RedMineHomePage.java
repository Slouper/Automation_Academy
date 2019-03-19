package plu.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedMineHomePage extends BasePage {

    @FindBy(how = How.LINK_TEXT, using = "Register")
    private WebElement registerButton;

    public RedMineHomePage(WebDriver driver) {
        super(driver);
    }

    public void clickRegisterButton(){
        registerButton.click();

    }

   public void isOpen() {
        new WebDriverWait(getDriver(), 20).until(ExpectedConditions -> registerButton.isDisplayed());
    }
}
