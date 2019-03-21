package MarekMikel.lekce;
import marek.pageObject.SeznamHomePage;
import marek.pageObject.SeznamResultPage;
import org.openqa.selenium.WebDriver;
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
