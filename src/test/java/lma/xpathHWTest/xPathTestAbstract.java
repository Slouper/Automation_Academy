package lma.xpathHWTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class xPathTestAbstract {

    private WebDriver driver;

    @BeforeClass
    public void getChromeDriver() {

        System.setProperty("webdriver.chrome.driver", "C:/chrome_driver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterClass
    public void endDriver() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }

    protected WebDriver getDriver() {
        return driver;
    }
}
