package lma.redimehwtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.util.Random;


public abstract class RedmineObjectTestAbstract {
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

    protected int random() {
        Random rand = new Random();
        return rand.nextInt(1000);
    }

    protected WebDriver getDriver() {
        return driver;
    }

}