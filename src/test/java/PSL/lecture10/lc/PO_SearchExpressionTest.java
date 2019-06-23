package PSL.lecture10.lc;

import org.testng.annotations.Test;

import PSL.lecture10.lc.base.AbstractTest;
import PSL.lecture10.lc.pageobject.HboHomePage;

@Test
public class PO_SearchExpressionTest extends AbstractTest {

    @Test(description = "Tenhle test dela toto")
    public void listAllShowsOnChannel() {
        new HboHomePage(getDriver())
                .clickOnScheduleButton()
                .showShows(0);

        // Zde by mel byt nejaky assert. Na konci kazdeho testu by melo byt nejake vyhodnoceni.
    }
}
