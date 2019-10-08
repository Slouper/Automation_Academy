package MBAsource.Xpathyclassic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPageXpath {

    public AbstractPageXpath(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
