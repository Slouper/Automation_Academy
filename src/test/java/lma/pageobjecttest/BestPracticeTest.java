package lma.pageobjecttest;

import lma.pageobject.SeznamHomePage;
import lma.pageobject.SeznamResultPage;
import org.testng.annotations.Test;


@Test
public class BestPracticeTest extends AbstractTest {


    @Test
    public void bestPracticeTest() {
        getDriver().get("https://www.seznam.cz/");

        SeznamHomePage seznamHomePage = new SeznamHomePage(getDriver());
        seznamHomePage.searchExpression("Selenium Webdriver");

//        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        SeznamResultPage seznamResultPage = new SeznamResultPage(getDriver());
        seznamResultPage.clickOnResultLink();

    }

}
