package lma.spaghettitest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.openqa.selenium.interactions.Actions;

@Test
public class UkolTestLekce4 {
    public ChromeDriver driver;

    @BeforeMethod
    public void getChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "C:/chrome_driver/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("http://newtours.demoaut.com/mercurywelcome.php");
    }
    @Test
    public void UkolLekce4() {
        Actions action = new Actions(driver);
        action
                .click(driver.findElement(By.linkText("REGISTER")))
                .perform();

        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='REGISTER']")));

        driver.findElement(By.name("firstName")).sendKeys("Krestni");
        driver.findElement(By.name("lastName")).sendKeys("Prijmeni");
        driver.findElement(By.name("phone")).sendKeys("123456789");
        driver.findElement(By.id("userName")).sendKeys("aaa@bbb.com");
        driver.findElement(By.name("address1")).sendKeys("U javy 123");
        driver.findElement(By.name("city")).sendKeys("Java");
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select/option[71]")).click();
        driver.findElement(By.id("email")).sendKeys("java123");
        driver.findElement(By.name("password")).sendKeys("Java");
        driver.findElement(By.name("confirmPassword")).sendKeys("Java");

        action
                .sendKeys(Keys.ENTER)
                .perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=' sign-in ']")));
    }


    @AfterMethod
    public void endDriver() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}