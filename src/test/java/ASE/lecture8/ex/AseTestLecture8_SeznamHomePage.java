package ASE.lecture8.ex;

import ASE.lecture8.ex.base.AseAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;


@Test
public class AseTestLecture8_SeznamHomePage extends AseAbstractTest {

    @Test(description = "Co dela tento test")
    public void shouldBeExpressionFound() {
        String articleTitle = new SeznamHomePage(getDriver())
                .enterSearchExpression("Selenium webdriver")
                .clickOnSearchButton()
                .clickOnFirstResultLink()
                .getArticleTitleValue();

        Assert.assertEquals(articleTitle, "What is Selenium?");

    }

}
