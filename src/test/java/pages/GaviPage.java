package pages;

import org.openqa.selenium.By;

public class GaviPage extends BasePage {

    private By gaviHeaderText = By.className("gavi-hero-title");

    public boolean isGaviPageOpened() {
        wait.waitForVisibility(gaviHeaderText);
        return webDriver.findElement(gaviHeaderText).isDisplayed();
    }
}