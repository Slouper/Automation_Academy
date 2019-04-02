package test;

import org.testng.annotations.Test;
import pageObjectsTest.HomePage;
import pageObjectsTest.HtmlTagPage;
import pageObjectsTest.ReferencesPage;
import pageObjectsTest.TrackPage;

@Test
public class W3schoolsTest extends AbstractTest {

    @Test
    public void W3schoolsTest() {

        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnReferences();

        ReferencesPage referencesPage = new ReferencesPage(getDriver());
        referencesPage.clickOnHtmlTagReference();

        HtmlTagPage htmlTagPage = new HtmlTagPage(getDriver());
        htmlTagPage.clickOnTrackTag(getDriver());

        TrackPage trackPage = new TrackPage(getDriver());
        trackPage.printExample();


    }
}
