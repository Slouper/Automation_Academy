package jko.lekce2.cv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class SpaghettiTest {

    private ChromeDriver driver;
    private WebDriverWait wait;

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.get("https://www.seznam.cz");
        wait = new WebDriverWait(driver, 15);
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
    public void bingSearch() {
        WebElement searchInput = driver.findElementByXPath("//*[@name='q']");
        searchInput.sendKeys("Selenium Webdriver");
        WebElement submitButton = driver.findElementByXPath("//button[@type='submit' and contains(@class, 'search')]");
        submitButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Vyhledat']")));
        System.out.println();
    }
}
