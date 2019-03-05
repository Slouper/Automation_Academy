package sloup.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeznamSearchResultsPage {
    private WebDriverWait wait;
    private WebDriver driver;

    @FindBy(how = How.CSS, using = "a.Result-title-link")
    private WebElement linkOnResultPage;

    public SeznamSearchResultsPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
        PageFactory.initElements(driver, this);
    }

    public void clickOnResultOnResultPage() {
        wait.until(ExpectedConditions.visibilityOf(linkOnResultPage));
        linkOnResultPage.click();
    }
}
