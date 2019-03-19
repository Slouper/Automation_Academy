package lma.RedimeHWTest;

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

    protected WebDriver getDriver() {
        return driver;
    }

//    Random rand = new Random();
//    int n = rand.nextInt(100);
//
//    protected Random random() {
//        return rand;
//    }

//    Javajava.util.Random@f0e995e
//    Javajava.util.Random@6d304f9d

}