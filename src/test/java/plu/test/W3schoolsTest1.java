package plu.test;


import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import plu.test.pageobject.HtmlElementReferencesPage;
import plu.test.pageobject.TrackExamplePage;
import plu.test.pageobject.W3schoolsHomePage;

public class W3schoolsTest1 extends AbstractPage{

    @Test
    public void w3schoolsTest(){

       // new W3schoolsHomePage(getDriver())
           //     .clickReferencesBtn()
           //     .clickHtmlTagReferences()
           //     .clickTrackElement();


        getDriver().get("https://www.w3schools.com/");
        W3schoolsHomePage w3schoolsHomePage = new W3schoolsHomePage(getDriver());

        w3schoolsHomePage.isOpen();

        w3schoolsHomePage.clickReferencesBtn();

        w3schoolsHomePage.clickHtmlTagReferences();

        HtmlElementReferencesPage htmlElementReferencesPage = new HtmlElementReferencesPage(getDriver());

        htmlElementReferencesPage.isOpen();
        htmlElementReferencesPage.clickTrackElement();

        TrackExamplePage trackExamplePage = new TrackExamplePage(getDriver());
        trackExamplePage.isOpen();
        trackExamplePage.getExampleText();

    }
}
