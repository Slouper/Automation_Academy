package MBA.tvojezkratka_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class W3SchoolsReferenceListPage extends AbstractPage {

    @FindBy(how = How.XPATH, using = "//*[@id=\"htmltags\"]/table/tbody/tr[114]/td[1]/a")
    private WebElement HTMLAnchor;

    @FindBy(how = How.XPATH, using = "//*[@id=\"nav_references\"]/div/div[1]/a[1]")
    private WebElement TagAnchor;

    WebDriver driver;

    public W3SchoolsReferenceListPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public W3SchoolsHomePage clickOnHTMLAnchor() {
        HTMLAnchor.click();
        return null;

        public W3SchoolsReferenceListPage clickOnTagAnchor() {
            TagAnchor.click();
            return null;
        }
    }
}
