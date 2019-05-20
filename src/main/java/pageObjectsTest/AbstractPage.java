package pageObjectsTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractPage {

    private WebDriverWait wait;
    private WebDriver driver;




    public AbstractPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

        {
            this.driver = driver;
        }

        wait = new WebDriverWait(driver, 20);
    }


    public WebDriverWait getWait() {
        return wait;
    }

    protected WebDriver getDriver() {
        return driver;
    }
}

