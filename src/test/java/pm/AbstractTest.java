package pm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class AbstractTest {

    private WebDriver driver;

    @BeforeClass
    public void startDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\chrome_driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/");
    }

    @AfterClass
    public void quitDrivers() {
        driver.quit();
    }

    protected WebDriver getDriver() {
        return driver;
    }
}
