package Marek;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pageObjects.W3HomePage;

public class TestTest extends TestAbstract{
    private static final Logger log = LoggerFactory.getLogger(TestTest.class);

    @Test
    public void TestW3School() {
        log.debug("Test 'TestPageObject' started");
        getDriver().get("https://www.w3schools.com/");

        new W3HomePage(getDriver())
                .clickOnReference()
                .clickOnHTMLTag();
    }
}


