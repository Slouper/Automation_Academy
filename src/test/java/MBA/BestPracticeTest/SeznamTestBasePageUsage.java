package MBA.BestPracticeTest;

import org.testng.annotations.Test;
import sloup.C_bestpractice_lecture_6.preparation.BaseTest;
import sloup.C_bestpractice_lecture_6.preparation.SeznamHomePage;

@Test
public class SeznamTestBasePageUsage extends BaseTest {

    @Test
    public void basicTest() {
        new SeznamHomePage().searchExpressionOnSeznamHomePage("Selenium WebDriver");
    }

    @Test
    public void basicTest2() {
        // Use explicit type definition <SeznamHomePage> when no return type of the metod is determined
        this.<SeznamHomePage>createPage()
                .searchExpressionOnSeznamHomePage("Selenium WebDriver")
                .clickOnResultOnResultPage();
    }

    @Test
    public void testX() {
        new SeznamHomePage().searchExpressionOnSeznamHomePage("ssss");
    }
}
