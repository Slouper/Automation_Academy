package jko.lecture7.hw;


import jko.lecture7.hw.base.AbstractTest;
import org.testng.annotations.Test;

@Test
public class NewToursRegTest extends AbstractTest {

    @Test
    public void registrationTest() {
        NewToursReg registration = null;

        registration = new NewToursReg(getDriver())
                .fillFirstName("Pepa")
                .fillLastName("Zdepa")
                .fillPhone("42069")
                .fillUserName("xXx360QuickScoperMLG@seznam.cz")
                .fillAddress1("Horni Dolni 15")
                .fillAddress2("Praha, Klecany")
                .fillCity("Praha")
                .fillState("Czechia")
                .fillPostalCode("100 00")
                .fillEmail("360QuickScoperMLG")
                .fillPassword("123456789")
                .fillConfirmPassword("123456789");
    }
}
