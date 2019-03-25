package fluenthw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FluentHomePage extends FluentAbstract{

    @FindBy(how = How.CLASS_NAME, using = "login")
    private WebElement fluentLoginButton;

    public FluentHomePage(WebDriver driver){
        super(driver);
    }
    public FluentLoginPage fluentLoginButton(){
        fluentLoginButton.click();
        return new FluentLoginPage(getDriver());
    }

}
