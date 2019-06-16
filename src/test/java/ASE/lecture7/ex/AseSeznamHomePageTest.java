package ASE.lecture7.ex;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


@Test
public class AseSeznamHomePageTest {
    private ChromeDriver driver;


    public void shouldBeExpressionFound() {

//        Ase_SeznamHomePage seznamHomePage = new Ase_SeznamHomePage(driver);
//        String articleTitle = seznamHomePage
//NEBO         String articleTitle = new Ase_SeznamHomePage(driver)

        String articleTitle = new Ase_SeznamHomePage(driver)
                .enterSearchExpression("Selenium webdriver")
                .clickOnSearchButton()
                .clickOnFirstResultLink()
                .getArticleTitleValue();

        Assert.assertEquals(articleTitle, "What is Selenium?");


//        Ase_NewResultPage resultPage = new Ase_NewResultPage(driver);
//        resultPage.clickOnFirstResultLink();

    }


    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
//        System.setProperty("webdriver.gecko.driver", "c:\\Users\\alina.sedymova\\IdeaProjects\\Drivers\\geckodriver.exe");
//        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
        driver.get("https://www.seznam.cz");
//        wait = new WebDriverWait(driver, 15);
    }

    @AfterTest
    public void afterTest() {
        //exception handling (bad practise)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
