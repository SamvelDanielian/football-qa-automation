package pages;

import org.openqa.selenium.WebDriver;
import utils.DriverFactory;
import utils.WaitUtils;

public class BasePage {

    protected WebDriver webDriver;
    protected WaitUtils wait;

    public BasePage() {
        this.webDriver = DriverFactory.getDriver();
        this.wait = new WaitUtils(webDriver);
    }
}