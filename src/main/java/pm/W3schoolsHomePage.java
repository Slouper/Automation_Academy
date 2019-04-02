package pm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class W3schoolsHomePage extends AbstractPage{

    @FindBy(how = How.XPATH, using = "//*[@id=\"navbtn_references\"]")
    private WebElement references;

    @FindBy(how = How.LINK_TEXT, using = "HTML Tag Reference")
    private WebElement htmlTagReference;

    public W3schoolsHomePage(WebDriver driver) {
        super(driver);
        wait.until(ExpectedConditions.visibilityOf(references));
    }

    public HtmlTagReferencesPage clickOnHtmlTagReference() {
        references.click();
        htmlTagReference.click();
        return new HtmlTagReferencesPage(getDriver());

    }

}
