package ASE.lecture7.hw.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {
    private WebDriver driver;

    protected abstract boolean isOpen();
    protected boolean isOpen(WebElement element){
        return element.isDisplayed();
    }

    //konstruktor
    public AbstractPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebDriver getDriver() {
        return driver;
    }

}
