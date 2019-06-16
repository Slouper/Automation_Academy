package ASE.lecture7.hw.base;

import ASE.lecture7.hw.pageObjects.NewtoursHomePage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
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
        driver.quit();
    }

}
