package PSL.lecture4.cv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import sloup.C_bestpractice_lecture_6.preparation.DriverFactory;

@Test
public class SeznamHomePageTest {
    private ChromeDriver driver;

    @BeforeTest
    public void beforTest() {
        driver = new ChromeDriver();
        driver.get("https://www.seznam.cz");

        WebDriver driver2 = DriverFactory.getDriverFromPool();
    }

    @AfterTest
    public void afterTest() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }

    @Test

    public void shouldBeSearchExpressionFoundOnSeznam() {

        // WebElement searchInput = driver.findElementByName("q");
        WebElement searchInput = driver.findElementByXPath("//input[@name='q']");
        searchInput.sendKeys("Selenium Webdriver");

        //        1)
        searchInput.submit();

        //        2)
        //        WebElement searchButton = driver.findElementByXPath("//button[@type='submit' and contains(@class, 'search')]");
        //        searchButton.click();

        WebDriverWait wait = new WebDriverWait(driver, 15);
        WebElement searchButtonGlass = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Vyhledat']")));

        System.out.println(searchButtonGlass.getAttribute("title"));


    }
}
