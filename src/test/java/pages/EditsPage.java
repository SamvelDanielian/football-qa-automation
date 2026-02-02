package pages;

import org.openqa.selenium.By;

public class EditsPage extends BasePage {

    private By editsHeaderText = By.className("edits-hero-title");

    public boolean isEditsPageOpened() {
        wait.waitForVisibility(editsHeaderText);
        return webDriver.findElement(editsHeaderText).isDisplayed();
    }
}