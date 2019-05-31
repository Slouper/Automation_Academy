package ASE.lecture2.cv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class AseTestLekce2 {
    private ChromeDriver driver;

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.get("https://www.seznam.cz");
    }

    @AfterTest
    public void afterTest() {
        driver.quit();

//        exception handling (bad practise)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void SearchIntoBing() {

//        1) WebElement searchInput
        WebElement searchInput = driver.findElement(By.xpath("//input[@name='q']"));
        searchInput.sendKeys("Selenium Webdriver");

//        2) submit = like enter, click for searching
//        WebElement searchButton = driver.findElementByXPath("//form//button[contains(text(),'Vyhledat')]");
//        searchButton.click(); NEBO
        searchInput.submit();

//        3) wait for element
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Vyhledat']")));

//        4) variable searchButtonMagnifier
        WebElement searchButtonMagnifier = driver.findElementByXPath("//button[@title='Vyhledat']");

//        5) display in the console, sout => System.out.println();
        System.out.println(searchButtonMagnifier.getAttribute("title"));


    }

}

