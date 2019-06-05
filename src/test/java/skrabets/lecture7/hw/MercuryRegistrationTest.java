package skrabets.lecture7.hw;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MercuryRegistrationTest {
  private ChromeDriver chrome;

  @BeforeTest
  public void beforeTest(){
    chrome = new ChromeDriver();
    chrome.get("http://newtours.demoaut.com/");
  }

  @Test
  public void testRegistration(){
    new HomePageMercury(chrome)
            .clickOnRegister()
            .inputFristName("test")
            .inputLastName("test")
            .inputPhone("1234")
            .inputEmail("test@test.com")
            .inputAddress1("address")
            .inputAddress2("address22")
            .inputCity("city")
            .inputState("state")
            .inputPostalCode("postalcode").selectCountry("BELARUS ")
            .inputUserName("test")
            .inputPasword("1234")
            .confirmPasword("1234");
  }

  @AfterTest
  public void afterTest(){
    chrome.quit();
  }
}
