package plu.Lesson7_xpath.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePageXpath {
    private WebDriver driver;

    public BasePageXpath(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

   // public abstract void isOpen();

    protected WebDriver getDriver() {
        return driver;
    }
}
