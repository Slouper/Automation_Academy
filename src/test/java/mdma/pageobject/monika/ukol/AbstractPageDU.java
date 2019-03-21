package mdma.pageobject.monika.ukol;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPageDU {
    protected WebDriver driver;

    public AbstractPageDU(WebDriver driver ) {
        PageFactory.initElements(driver, this);
        this.driver = driver;

    }

    public WebDriver getDriver() {
        return driver;
    }


}
