package jko.lecture7.hw.base;

import PSL.lecture8.lc.enums.BrowserType;
import PSL.lecture8.lc.factory.DriverFactory;
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
        driver.get("http://newtours.demoaut.com/mercuryregister.php");
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
