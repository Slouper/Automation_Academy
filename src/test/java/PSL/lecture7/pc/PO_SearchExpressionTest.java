package PSL.lecture7.pc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class PO_SearchExpressionTest {
    private ChromeDriver driver;

    @Test
    public void shouldBeExpressionFound() {
        String articleTitle = new SeznamHomePage(driver)
                .enterSearchedExpression("Selenium webdriver")
                .clickOnSearchButton()
                .clickOnFirstResultLink()
                .getArticleTitleValue();

        Assert.assertEquals(articleTitle, "What is Selenium?");
    }

    @BeforeTest
    public void beforTest() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.seznam.cz");
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
}
