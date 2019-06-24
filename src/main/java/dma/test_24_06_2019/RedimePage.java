package dma.test_24_06_2019;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class RedimePage {
    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//a[@class='login']")
    private WebElement searchLogin;

    public RedimePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public RedimePage searchLogin ()  {
        searchLogin.click();
        return this;
        }
}
