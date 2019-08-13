package dma.Lekce8.cv.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage8 {

    private WebDriver driver;

    protected AbstractPage8() {
    }

    protected abstract boolean isOpen();

    public WebDriver getDriver() {
        //vygenerováno ALT+INSERT = getter
        return driver;
    }

    public AbstractPage8(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
