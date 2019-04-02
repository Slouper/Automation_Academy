package MBA.tvojezkratka_test;


import org.testng.annotations.Test;

public class XpathTest extends AbstractTest {

    @Test
    public void BestPracticesW3() {

        getDriver().get("https://www.w3schools.com");

        W3SchoolsHomePage w3SchoolsHomePage = new W3SchoolsHomePage(getDriver())
        W3SchoolsHomePage.clickOnreferenceAnchor()
                .clickOnHTMLAnchor()
                .clickOnTagAnchor();


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}