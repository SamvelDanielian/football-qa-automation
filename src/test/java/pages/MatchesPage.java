package pages;

import org.openqa.selenium.By;

public class MatchesPage extends BasePage {

    private By matchesHeaderText = By.className("main-title");

    public boolean isMatchesPageOpened() {
        wait.waitForVisibility(matchesHeaderText);
        return webDriver.findElement(matchesHeaderText).isDisplayed();
    }
}