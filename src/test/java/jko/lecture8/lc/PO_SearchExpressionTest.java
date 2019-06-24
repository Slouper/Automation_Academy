package jko.lecture8.lc;

import jko.lecture8.lc.base.AbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class PO_SearchExpressionTest extends AbstractTest {


    @Test
    public void shouldBeExpressionFound() {
        String articleTitle = new SeznamHomePage(getDriver())
                .enterSearchedExpression("Selenium webdriver")
                .clickOnSearchButton()
                .clickOnFirstResultLink()
                .getArticleTitleValue();

        Assert.assertEquals(articleTitle, "What is Selenium?");
    }


}
