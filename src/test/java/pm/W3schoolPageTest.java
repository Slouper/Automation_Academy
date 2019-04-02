package pm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class W3schoolPageTest extends AbstractTest {


    @Test
    public void goingFromHomePageToTagTrackToCheckVidibilityOfExample() {
       new W3schoolsHomePage(getDriver()).clickOnHtmlTagReference()
               .clickOnPodelanaKukina()
               .moveToTagTrack()
               .clickOnTagTrack();
    }
}
