package sloup.C_bestpractice_lecture_6.lecture.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SeznamResultPage extends AbstractPage {

    @FindBy(how = How.XPATH, using = "//*[@data-dot='title']")
    private WebElement firstResultLink;

    public SeznamResultPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnResultLink() {
        firstResultLink.click();
    }
}
