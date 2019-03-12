package sloup.C_bestpractice_lecture_6.lecture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class AbstractTest {
    private WebDriver driver;

    @BeforeClass
    public void startDriver() {
        driver = new ChromeDriver();
    }

    @AfterClass
    public void quitDrivers() {
        driver.quit();
    }

    protected WebDriver getDriver() {
        return driver;
    }
}
