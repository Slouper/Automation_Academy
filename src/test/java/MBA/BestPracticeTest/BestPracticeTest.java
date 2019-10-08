package MBA.BestPracticeTest;

import org.testng.annotations.Test;
import sloup.C_bestpractice_lecture_6.lecture.AbstractTest;
import sloup.C_bestpractice_lecture_6.lecture.pageobject.SeznamHomePage;
import sloup.C_bestpractice_lecture_6.lecture.pageobject.SeznamResultPage;

@Test
public class BestPracticeTest extends AbstractTest {

    @Test
    public void bestPracticeTest() {
        getDriver().get("https://www.seznam.cz");

        SeznamHomePage seznamHomePage = new SeznamHomePage(getDriver());
        seznamHomePage.searchExpression("Selenium Webdriver");

        SeznamResultPage seznamResultPage = new SeznamResultPage(getDriver());
        seznamResultPage.clickOnResultLink();
    }
}
