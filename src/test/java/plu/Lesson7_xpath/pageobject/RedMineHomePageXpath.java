package plu.Lesson7_xpath.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;
import plu.pageobject.BasePage;

public class RedMineHomePageXpath extends BasePage {

    @FindBy(how = How.XPATH, using = "//a[@class='login']")
    private WebElement registerAnch;

    public RedMineHomePageXpath(WebDriver driver) {
        super(driver);
    }

    public void clickOnLoginAnchor(){
        registerAnch.click();

    }

   public void isOpen() {
        new WebDriverWait(getDriver(), 20).until(ExpectedConditions -> registerAnch.isDisplayed());
    }
}
