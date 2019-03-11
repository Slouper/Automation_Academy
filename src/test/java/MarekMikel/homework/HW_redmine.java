package MarekMikel.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;

public class HW_redmine {
    private static final Logger log = LoggerFactory.getLogger(FirstHW.class);
    private ChromeDriver driver;
    WebDriverWait wait;
    public static final String user = "Marek" + (int)(Math.random() * 5000 + 1);
    public static final String email = "" + (int)(Math.random() * 5000 + 1);

    @Test
    public void TestRegister() {
        log.debug("Test 'TestMethods' started");
        driver.get("http://www.redmine.org/login");
        driver.findElement(By.xpath("//*[@class='register']")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2")));

        driver.findElement(By.xpath("//*[@id='user_login']")).sendKeys(user);
        System.out.println(user);
        System.out.println(email);
        driver.findElement(By.xpath("//*[@id='user_password']")).sendKeys("pejsek");
        driver.findElement(By.xpath("//*[@id='user_password_confirmation']")).sendKeys("pejsek");

        driver.findElement(By.xpath("//*[@id='user_firstname']")).sendKeys("Marek");
        driver.findElement(By.xpath("//*[@id='user_lastname']")).sendKeys("Marek");
        driver.findElement(By.xpath("//*[@id='user_mail']")).sendKeys("marek@marek" + email + ".cz");
        driver.findElement(By.xpath("//*[@id='user_custom_field_values_3']")).sendKeys("Praha");
        driver.findElement(By.xpath("//*[@name='commit']")).click();

        assertEquals("Účet byl úspěšně vytvořen. Pro aktivaci účtu klikněte na odkaz v emailu, který vám byl zaslán.",
                driver.findElement(By.xpath("//*[contains(text(),'Účet byl úspěšně vytvořen')]")).getText());

        driver.findElement(By.xpath("//*[@id='username']")).sendKeys(user);
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("pejsek");
        driver.findElement(By.xpath("//*[@name='login']")).click();


        assertEquals("Neaktivovali jste si dosud Váš účet. Pro opětovné zaslání aktivačního emailu klikněte na tento odkaz, prosím." , driver.findElement(By.xpath("//*[@id='flash_error']")).getText());
    }

    @BeforeClass
    public void getChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "C:/chrome_driver/chromedriver.exe");

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 2);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        log.debug("WebDriver started ....");
    }

    @AfterMethod
    private void CloseDriver() {
        try {
            log.debug("Waiting 2 seconds before test end.");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}


