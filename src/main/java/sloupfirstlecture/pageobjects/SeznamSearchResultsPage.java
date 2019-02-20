package sloupfirstlecture.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author petr.sloup
 */
public class SeznamSearchResultsPage {
    private WebDriverWait wait;

    @FindBy(how = How.CSS, using = "a.Result-title-link")
    private WebElement linkOnResultPage;

    public SeznamSearchResultsPage(WebDriver driver) {
        wait = new WebDriverWait(driver, 15);
        PageFactory.initElements(driver, this);
    }

    public void clickOnResultOnResultPage() {
        wait.until(ExpectedConditions.visibilityOf(linkOnResultPage));
        linkOnResultPage.click();
    }
}
