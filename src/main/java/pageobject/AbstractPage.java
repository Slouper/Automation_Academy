package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {

    // Dedeni do

    public AbstractPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

//    // zavolat v dalsich
//    public void sikovnaFinta() {
//
//    }
}
