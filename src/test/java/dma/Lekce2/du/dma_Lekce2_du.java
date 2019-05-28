package dma.Lekce2.du;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


@Test
public class dma_Lekce2_du {

    private FirefoxDriver driver = new FirefoxDriver();
    private WebDriver wd;
    private WebDriverWait wait = new WebDriverWait(wd, 15);

    @BeforeTest
    public void beforeTest () {
        wd.get("https://www.seznam.cz");
    }

    @AfterTest
    public void afterTest () {
        driver.quit();

        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void chromeSearch() {
        //1.najít proměnnou -> vyhledávání
        WebElement searchInput = driver.findElement(By.xpath("//input[name='q']"));
        searchInput.sendKeys ("Selenium Webdriver");

        //2.Tlačítko Vyhledat
        // submit = like enter, click for searching
        //        WebElement searchButton = driver.findElementByXPath("//form//button[contains(text(),'Vyhledat')]");
        //        searchButton.click()
        searchInput.submit();

        //3.zadání čekací doby
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='vyhledat']")));

        WebElement searchButtonVyhledat = driver.findElementByXPath("//button[@title='vyhledat']");

        //5.zobrazení soup
        System.out.println(searchButtonVyhledat.getAttribute("type"));
    }
}