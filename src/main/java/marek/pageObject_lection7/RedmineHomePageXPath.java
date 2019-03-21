package marek.pageObject_lection7;

import marek.pageObject.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class RedmineHomePageXPath extends AbstractPage {


    @FindBy(how = How.XPATH, using = "//a[@class='login']")
    private WebElement loginAnchor;

    public RedmineHomePageXPath(WebDriver driver) {super(driver);}

    public void SearchLoginAnchor() {loginAnchor.click();}

}
