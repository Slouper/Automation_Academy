package lma.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SeznamResultPage extends AbstractPage {

    @FindBy(how = How.XPATH, using = "//*[@class='Result-title-link']")
    private WebElement firstResultLink;

    public SeznamResultPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnResultLink() {
        firstResultLink.click();
    }
}