package PMA.homework.firefox;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class test {

    private static final Logger log = LoggerFactory.getLogger(test.class);
    private WebDriver driver;


    @BeforeMethod
    public void startDriver() {
        System.setProperty("webdriver.gecko.driver", "C:\\gecko_driver\\geckodriver.exe");
        //System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }


    @Test
    public void openSiteGoogleAndTypeIntoSearchBarSearchWithClick() {
        log.debug("Test 'openSiteGoogleAndTypeIntoSearchBar' started");

        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys("hulahu"/* + Keys.ENTER*/);
        driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div/div[3]/center/input[1]")).click();
        //driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")).click();
    }

    @Test
    public void openSiteGoogleAndTypeIntoSearchBarSearchWithEnter() {
        log.debug("Test 'openSiteGoogleAndTypeIntoSearchBar' started");

        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys("boom" + Keys.ENTER);
    }
@AfterMethod
    public void afterTest() {
        try {
            log.debug("Waiting 5 seconds before test end.");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();

    }

}
