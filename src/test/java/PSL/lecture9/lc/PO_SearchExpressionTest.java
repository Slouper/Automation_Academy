package PSL.lecture9.lc;

import org.testng.Assert;
import org.testng.annotations.Test;

import PSL.lecture8.lc.SeznamHomePage;
import PSL.lecture9.lc.base.AbstractTest;

@Test
public class PO_SearchExpressionTest extends AbstractTest {

    @Test(description = "Tenhle test dela toto")
    public void shouldBeExpressionFound() {
        String articleTitle = null;
        articleTitle = new SeznamHomePage()
                .enterSearchedExpression("Selenium webdriver")
                .clickOnSearchButton()
                .clickOnFirstResultLink()
                .getArticleTitleValue();

        Assert.assertEquals(articleTitle, "What is Selenium?");
    }
}
