package pageObjectsTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TrackPage extends AbstractPage {

    public TrackPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"main\"]/div[3]/div")
    private WebElement firstExample;

    public TrackPage printExample(){

        String exampleText = firstExample.getText();
        System.out.println(exampleText);
        return this;
    }

}
