package lma.xpathhw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class XpathAbstract {
    private WebDriver driver;

    public XpathAbstract(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    protected abstract void isOpen();

        protected WebDriverWait getWait() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        return wait;
        }

    protected WebDriver getDriver() {
        return driver;
    }
}
