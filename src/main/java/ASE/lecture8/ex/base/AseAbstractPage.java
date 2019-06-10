package ASE.lecture8.ex.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

//alt+insert vyvola konstruktor

public abstract class AseAbstractPage {
    private WebDriver driver;

    protected abstract boolean isOpen();

    public AseAbstractPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebDriver getDriver() {
        return driver;
    }

}
