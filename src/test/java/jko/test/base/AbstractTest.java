package jko.test.base;


import jko.test.enums.BrowserType;
import jko.test.factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public abstract class AbstractTest {
    private WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driver = new DriverFactory().initDriver(BrowserType.CHROME);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://www.redmine.org");
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
