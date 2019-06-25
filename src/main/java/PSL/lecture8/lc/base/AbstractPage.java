package PSL.lecture8.lc.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import sloup.C_bestpractice_lecture_6.preparation.DriverFactory;

public abstract class AbstractPage {

    protected abstract boolean isOpen();

    public AbstractPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public WebDriver getDriver() {
        return DriverFactory.getDriver();
    }
}
