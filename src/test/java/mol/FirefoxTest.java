package mol;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

@Test
public class FirefoxTest {

    private static final Logger log = LoggerFactory.getLogger(FirefoxTest.class);

    private FirefoxDriver driver;


    @Test
    public void openMallHomePage() {
        log.debug("Test 'openMallHomePage' started");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://www.mall.cz/");
        //Otvorí dané URL

        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div/div[3]/button")).click();
        //Odsúhlasí ochranu súkromia tlačítkom - Rozumím

        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[1]/div/ul[1]/li[7]/div/div/a")).click();
        //Z menu vyberie - Chovatelské potřeby

        js.executeScript("window.scrollBy(0,500)", "");
        //JavaScript na scroll down

        driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div/ul/li[6]/a")).click();
        //Klikne na položku - Ptáci

        driver.findElementByXPath("//*[@id='content']/div/section[2]/div/ul/li[3]/a").click();
        //Klikne na položku - Krmivo pro ptáky

        driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/best-seller-products/div/div/ol/li[1]/a/div[1]/h3")).click();
        //Klikne na položku prvý best seller

        driver.findElement(By.xpath("//*[@id='add-to-cart']/div/span[1]")).click();
        //Pridá položku do košíka

        driver.findElement(By.xpath("//*[@id='nav-customer']/ul/li[4]/a/div[1]/b")).click();
        //Zobrazí obsah košíka

    }

        @BeforeClass
    private void getGeckoDriverService() {
        System.setProperty("webdriver.gecko.driver", "C:/gecko_driver/geckodriver.exe");

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        log.debug("WebDriver started ....");

    }

    @AfterClass
    private void quitDriver() {
        try {
            log.debug("Waiting 5 seconds before test end.");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }


}
