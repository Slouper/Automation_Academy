package MarekMikel.lekce;
import Marek.PageObject.SeznamHomePage;
import Marek.PageObject.SeznamResultPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


@Test
public class TestPageObjects extends TestAbstract {
    private WebDriver driver;

    public void TestPageObjects() {
        getDriver().get("https://www.seznam.cz");

       SeznamHomePage seznamHomePage = new SeznamHomePage(getDriver());
       seznamHomePage.searchExpression("Selenium");

       SeznamResultPage seznamResultPage = new SeznamResultPage(getDriver());
       seznamResultPage.clickOnResultLink();
    }
}
