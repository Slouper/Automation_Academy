package dma.Lekce9.du.cv.base;

import dma.Lekce8.cv.base.AbstractPage8;
import dma.Lekce8.cv.factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@Test
public abstract class AbstractTest extends AbstractPage8 {
    private WebDriver driver;

    public AbstractTest(WebDriver driver) {
        super(driver);
    }

    @BeforeTest //(Tenhle test dělá tohle)
    public void beforeTest() {
        driver = new DriverFactory().initDriver("ChromeDriver");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://seznam.cz/");
    }


    @AfterTest
    public void afterTest() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();


    }
    public WebDriver getDriver () {
        return driver;

    }
}