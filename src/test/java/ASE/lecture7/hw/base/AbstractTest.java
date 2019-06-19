package ASE.lecture7.hw.base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public abstract class AbstractTest {
    public ChromeDriver getDriver() {
        return driver;
    }

    private ChromeDriver driver;

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.get("http://newtours.demoaut.com");
    }

    @AfterTest
    public void afterTest() {
        mySleep(3);
        driver.quit();
    }

    private void mySleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
