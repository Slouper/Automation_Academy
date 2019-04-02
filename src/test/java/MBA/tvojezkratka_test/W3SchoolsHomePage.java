package MBA.tvojezkratka_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.w3c.dom.html.HTMLAnchorElement;

public class W3SchoolsHomePage extends AbstractPage {

    @FindBy(how = How.XPATH, using = "//*[@id=\"navbtn_references\"]")
    private WebElement referenceAnchor;


    WebDriver driver;

    public W3SchoolsHomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public static W3SchoolsHomePage clickOnreferenceAnchor() {
        referenceAnchor.click();
        return null;
    }

}
