package PSL.lecture10.lc.pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import PSL.lecture10.lc.base.AbstractPage;

public class HboSchedulePage extends AbstractPage {

    @FindBy(how = How.XPATH, using = "//div[@class='channel']")
    private List<WebElement> channelsList;

    private String showXptah = "//a[contains(@href,'/movie/')]";

    @Override
    protected boolean isOpen() {
        return !channelsList.isEmpty();
    }

    public HboSchedulePage(WebDriver driver) {
        super(driver);
    }

    public void showShows(int channelIndex) {
        List<WebElement> showList = channelsList.get(channelIndex).findElements(By.xpath(showXptah));
        showList.forEach(webElement -> System.out.println(webElement.getText()));
    }
}
