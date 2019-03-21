package plu.Lesson7_xpath.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedMineMainPageXpath extends BasePageXpath {

    @FindBy(how = How.XPATH, using = "//div[@id='top-menu']//a[@class='help']")
    private WebElement helpAnchor;


    public RedMineMainPageXpath(WebDriver driver) {
        super(driver);
    }

    public void clickOnHelpAnchor () {

        helpAnchor.click();
    }

    public void isOpen() {
        new WebDriverWait(getDriver(), 20).until(ExpectedConditions -> helpAnchor.isDisplayed());
    }
}
