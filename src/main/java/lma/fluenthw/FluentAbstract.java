package lma.fluenthw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class FluentAbstract {
    private WebDriver driver;

    public FluentAbstract(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    protected WebDriver getDriver() {
        return driver;
    }
}
