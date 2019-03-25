package xpathhw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class XpathAbstract {
    private WebDriver driver;

    public XpathAbstract(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    protected abstract void isOpen();

    protected WebDriver getDriver() {
        return driver;
    }
}
