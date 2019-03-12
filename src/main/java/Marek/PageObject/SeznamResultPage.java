package Marek.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SeznamResultPage extends AbstractPage{

    @FindBy(how = How.XPATH, using = "//*[@data-dot='title']")
    private WebElement firstResultLink;

    public SeznamResultPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnResultLink() {
    firstResultLink.click();
    }
}
