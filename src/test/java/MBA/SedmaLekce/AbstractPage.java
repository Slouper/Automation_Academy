package MBA.SedmaLekce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {

    protected WebDriver driver;

    public AbstractPage(WebDriver driver ) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        isOpen();
    }

    public WebDriver getDriver() {
        return driver;
    }
    public abstract void isOpen();
}
