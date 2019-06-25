//package dma.Lekce9.du.cv;
//
////import dma.Lekce7.cv.SeznamHomePage;
//import dma.Lekce8.cv.base.AbstractTest;
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import sloup.A_B_pageobject.SeznamHomePage;
//
//@Test
//public class dma_searchExpressionTest extends AbstractTest {
//
//    public dma_searchExpressionTest(WebDriver driver) {
//        super(driver);
//    }
//
//     @Test
//    public void shouldBeExpressionFound() {
//
//        String articleTitle = new SeznamHomePage(getDriver())
//                .enterSearchedExpression("Selenium driver")
//                .clickSearchButton()
//                .clickOnFirstResultsLink()
//                .getArtitcleTitleValue();
//
//        Assert.assertEquals(articleTitle, "What is Selenium?");
//    }
//
//    @Override
//    protected boolean isOpen() {
//        return false;
//    }
//}