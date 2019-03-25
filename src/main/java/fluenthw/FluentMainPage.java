package fluenthw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FluentMainPage extends FluentAbstract{

    @FindBy(how = How.XPATH, using = "//div[@id='top-menu']//a[@class='help']")
    private WebElement fluentHelpButton;

    public FluentMainPage(WebDriver driver) {
        super(driver);
    }

    public FluentHelpPage fluentHelpButton() {
        fluentHelpButton.click();
        return new FluentHelpPage(getDriver());
    }

}
