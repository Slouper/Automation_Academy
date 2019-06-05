package skrabets.lecture7.hw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class HomePageMercury {
  private WebDriver wd;

  @FindBy(how = How.XPATH, using = "//a[text()='REGISTER']")
  private WebElement registerLink;

  public HomePageMercury(WebDriver wd){
    this.wd = wd;
    PageFactory.initElements(wd, this);
  }

  public RegisterPage clickOnRegister(){
    registerLink.click();
    return new RegisterPage(wd);
  }

}
