package lma.fluenthwtest;

import lma.fluenthw.FluentHomePage;
import org.testng.annotations.Test;

@Test
public class FluentTest extends FluentTestAbstract {

    @Test
    public void FluentTest(){
        getDriver().get("http://www.redmine.org/");

        new FluentHomePage(getDriver())
                .fluentLoginButton()
                .fluentUsernameLogin("pepe5565")
                .fluentUsernamePassword("PXPkehadBWX97Y9")
                .fluentClickLoginButton()
                .fluentHelpButton()
                .fluentTimeReport();
//                .fluentTimeReportCheck();
    }
}
