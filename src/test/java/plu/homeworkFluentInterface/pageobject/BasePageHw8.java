package plu.homeworkFluentInterface.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePageHw8 {
    private WebDriver driver;

    public BasePageHw8(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    protected WebDriver getDriver() {
        return driver;
    }
}
