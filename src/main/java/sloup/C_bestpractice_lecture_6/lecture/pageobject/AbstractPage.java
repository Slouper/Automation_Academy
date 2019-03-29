package sloup.C_bestpractice_lecture_6.lecture.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {

    public AbstractPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    protected void sikovnaFinta() {
        pomocnaMetodaProFinticku();
    }

    private void pomocnaMetodaProFinticku() {
    }
}
