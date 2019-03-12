package lma;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Test
public class UkolTestLekce2 {
    private FirefoxDriver driver;

    @BeforeMethod
    public void getFirefoxDriver() {
        System.setProperty("webdriver.gecko.driver","C:/firefox_driver/geckodriver.exe");

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        System.out.println("WebDriver started ....");
    }

    @Test
    public void cssProductcaster_Test() {

        System.out.println("Test 'cssProductcaster_Test' started");

        driver.get("https://css.productcaster.com/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/header/button")).click();

        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/header/nav/div[2]/button")).click();

        driver.findElement(By.xpath("//*[@id=\"countrypicker-header-item-0\"]")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.xpath("//*[@id=\"__next\"]/form/input")).sendKeys("Game");

        driver.findElement(By.xpath("//*[@id=\"__next\"]/form/button")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[3]/div[3]/div[1]/div[1]")));

    }

    @Test
    public void cssProductcaster_Test2() {

        System.out.println("Test 'cssProductcaster_Test2' started");

        driver.get("https://css.productcaster.com/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/header/button")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/header/nav/div[1]/button")).click();

    }

    @AfterMethod
    public void endDriver() {
        System.out.println("Waiting 3 seconds before test end.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}