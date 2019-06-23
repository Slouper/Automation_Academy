package PSL.lecture9.lc.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import PSL.lecture8.lc.enums.BrowserType;
import PSL.lecture8.lc.factory.DriverFactory;

public abstract class AbstractTest {
    private WebDriver driver;

    @BeforeTest
    public void beforTest() {
        driver = new DriverFactory().initDriver(BrowserType.CHROME);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.seznam.cz");
    }

    @AfterTest
    public void afterTest() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
