package mdma.x_path_lekce7;

import mdma.pageobject.monika.test.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeznamResultPage extends AbstractPage {

    @FindBy(how = How.XPATH, using = "//*[@data-dot='title']")
    private WebElement firstResultLink;

    @FindBy(how = How.ID, using = "svgtitle")
    private WebElement searchButton;

    public SeznamResultPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void isOpen() {
        new WebDriverWait(getDriver(), 20).until(ExpectedConditions -> searchButton.findElements(By.xpath("/*")).size() > 0);
    }

    public void clickOnResultLink() {
        firstResultLink.click();
    }
}

