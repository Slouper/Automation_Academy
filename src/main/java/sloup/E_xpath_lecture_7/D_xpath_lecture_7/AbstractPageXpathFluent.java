package sloup.E_xpath_lecture_7.D_xpath_lecture_7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPageXpathFluent {


    public AbstractPageXpathFluent(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
