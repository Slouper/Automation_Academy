package ASE.lecture7.ex;

import com.sun.org.apache.xpath.internal.operations.Equals;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import sun.util.resources.es.CurrencyNames_es_BO;

import java.util.concurrent.TimeUnit;


@Test
public class AseTestLecture7_SeznamHomePage {
    private ChromeDriver driver;


    public void shouldBeExpressionFound() {

//        AseLecture7_SeznamHomePage seznamHomePage = new AseLecture7_SeznamHomePage(driver);
//        String articleTitle = seznamHomePage
//NEBO         String articleTitle = new AseLecture7_SeznamHomePage(driver)

        String articleTitle = new AseLecture7_SeznamHomePage(driver)
                .enterSearchExpression("Selenium webdriver")
                .clickOnSearchButton()
                .clickOnFirstResultLink()
                .getArticleTitleValue();

        Assert.assertEquals(articleTitle, "What is Selenium?");

//        AseLecture7_NewResultPage resultPage = new AseLecture7_NewResultPage(driver);
//        resultPage.clickOnFirstResultLink();

    }


    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
//        System.setProperty("webdriver.gecko.driver", "c:\\Users\\alina.sedymova\\IdeaProjects\\Drivers\\geckodriver.exe");
//        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
        driver.get("https://www.seznam.cz");
//        wait = new WebDriverWait(driver, 15);
    }

    @AfterTest
    public void afterTest() {
//        exception handling (bad practise)
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        driver.quit();
    }
}
