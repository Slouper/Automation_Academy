package dma.test_24_06_2019;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@Test
public class RedimeTest {
    private ChromeDriver driver;

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://www.redmine.org");

    }
    @AfterTest
    public void afterTest() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

    @Test
    public void redimeTestInProgress () {

        String searchUserName = new RedimeTest(driver)
                .searchLogin()
                .clickUserName()
                .clcikPassword
    }
}
