package mdma.x_path_lekce7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RedmineHomePage extends AbstractPage {

    @FindBy(how = How.XPATH, using = "//a[@class='login']")
    private WebElement loginAnchor;

    public RedmineHomePage(WebDriver driver) { super(driver); }

    @Override
    public void isOpen() {

    }

    public void clickOnLoginAnchor () {
        loginAnchor.click();
    }
}
