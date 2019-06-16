package ASE.lecture7.hw;

import ASE.lecture7.hw.base.AbstractTest;
import ASE.lecture7.hw.pageObjects.NewtoursHomePage;
import org.testng.annotations.Test;


@Test
public class RegisterToNewtoursTest extends AbstractTest {

    @Test(description = "Vyplnit všechny inputy pro registraci")
    public void registrationTest() {
        new NewtoursHomePage(getDriver())
                .clickOnRegisterLink()
                .enterFirstName("Sasha")
                .enterLastName("Pushkin")
                .enterPhone("777888999")
                .enterUserName("chuva@sro.ru")
                .enterAddress("Pushkinskaya str. 1")
                .enterCity("Pushkinskiye Gory")
                .enterState("Pskov region, Russia")
                .enterPostalCode("181370")
                .enterCountry("RUSSIA")
                .enterEmail("EvženOněgin")
                .enterPassword("Evžen*Onegin")
                .confirmPassword("Evžen*Onegin");
    }

}
