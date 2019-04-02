package MBAsource.Xpathyclassic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RedmineHomePage extends AbstractPageXpath {

    @FindBy(how = How.NAME, using = "q")
    private WebElement searchInput;

    public RedmineHomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnLoginAnchor() {
        searchInput.click();
    }
}
