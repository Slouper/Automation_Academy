package sloup.C_bestpractice_lecture_6.preparation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SeznamSearchResultsPage extends BasePage {

    @FindBy(how = How.CSS, using = "a.Result-title-link")
    private WebElement linkOnResultPage;

    @Override
    public void checkPageIsOpen() {
        isElementPresent(linkOnResultPage);
    }

    public void clickOnResultOnResultPage() {
        linkOnResultPage.click();
    }
}
