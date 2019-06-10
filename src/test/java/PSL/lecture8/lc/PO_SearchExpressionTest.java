package PSL.lecture8.lc;

import org.testng.Assert;
import org.testng.annotations.Test;

import PSL.lecture8.lc.base.AbstractTest;

@Test
public class PO_SearchExpressionTest extends AbstractTest {

    @Test(description = "Tenhle test dela toto")
    public void shouldBeExpressionFound() {
        String articleTitle = new SeznamHomePage(getDriver())
                .enterSearchedExpression("Selenium webdriver")
                .clickOnSearchButton()
                .clickOnFirstResultLink()
                .getArticleTitleValue();

        Assert.assertEquals(articleTitle, "What is Selenium?");
    }
}
