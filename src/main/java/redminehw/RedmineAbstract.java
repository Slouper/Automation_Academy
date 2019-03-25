package redminehw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public abstract class RedmineAbstract {

    public RedmineAbstract(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }



}