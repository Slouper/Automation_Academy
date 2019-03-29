package MBA.SedmaLekce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class AbstractTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void startDriver() {
        System.setProperty("webdriver.chrome.driver", "C:/chrome_driver/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 5);
    }

    @AfterClass
    public void quitDrivers() {
        driver.quit();
    }
    protected WebDriver getDriver() {
        return driver;
    }
    protected WebDriverWait getWait() {
        return wait;
    }
}
