package plu.test.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;
import plu.pageobject.BasePage;

public class TrackExamplePage extends BasePage {

    @FindBy(how = How.XPATH, using = "//div[@class='w3-example']")
    private WebElement exampleText;


    public TrackExamplePage(WebDriver driver) {
        super(driver);
    }

    public void getExampleText(){
        System.out.println(exampleText.getText());
    }

   public void isOpen() {
        new WebDriverWait(getDriver(), 20).until(ExpectedConditions -> exampleText.isDisplayed());
    }
}
