package jko.lecture8.lc.base;

import jko.lecture8.lc.enums.BrowserType;
import jko.lecture8.lc.factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class AbstractTest {

    public WebDriver getDriver() {
        return driver;
    }

    private WebDriver driver;

    @BeforeTest
    public void beforTest() {
        new DriverFactory().initDriver(BrowserType.CHROME);
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
}
