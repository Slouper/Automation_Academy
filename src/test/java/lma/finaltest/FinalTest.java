package lma.finaltest;

import lma.finalobject.HomePage;
import org.testng.annotations.Test;

@Test
public class FinalTest extends FinalTestAbstract {

    @Test
    public void FinalTest1() {
        getDriver().get("https://www.w3schools.com/");

        new HomePage(getDriver())
                .referenceButtonClick()
                .htmlTagreRerenceClick()
                .cookieButton()
                .tagTrack()
                .firstExample();

        System.out.println("Example");
    }
}
