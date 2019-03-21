package plu.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    private WebDriver driver;

    public BasePage(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public abstract void isOpen();

    protected WebDriver getDriver() {
        return driver;
    }
}
