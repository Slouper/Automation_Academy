package jko.lecture5.hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class NewteoursTest {

    private ChromeDriver driver;

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com/mercuryregister.php");
    }

    @AfterTest
    public void AfterTest() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

    @Test
    public void newToursTest() {
        driver.findElementByXPath("//*[@name='firstName']").sendKeys("Pepa");
        driver.findElementByXPath("//*[@name='lastName']").sendKeys("Zdepa");
        driver.findElementByXPath("//*[@name='phone']").sendKeys("42069");
        driver.findElementByXPath("//*[@name='userName']").sendKeys("xXx360QuickScoperMLG@seznam.cz");
        driver.findElementByXPath("//*[@name='address1']").sendKeys("Horni Dolni 15");
        driver.findElementByXPath("//*[@name='address2']").sendKeys("Praha, Klecany");
        driver.findElementByXPath("//*[@name='city']").sendKeys("Praha");
        driver.findElementByXPath("//*[@name='state']").sendKeys("Czechia");
        driver.findElementByXPath("//*[@name='postalCode']").sendKeys("100 00");
        driver.findElementByXPath("//*[@name='postalCode']").sendKeys("100 00");
        driver.findElementByXPath("//*[@name='email']").sendKeys("360QuickScoperMLG");
        driver.findElementByXPath("//*[@name='password']").sendKeys("123456789");
        driver.findElementByXPath("//*[@name='confirmPassword']").sendKeys("123456789");
    }
}
