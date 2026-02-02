package pages;

import org.openqa.selenium.By;

public class TrainingsPage extends BasePage {

    private By trainingsWelcomeText = By.className("training-welcome");

    public boolean isTrainingsPageOpened() {
        wait.waitForVisibility(trainingsWelcomeText);
        return webDriver.findElement(trainingsWelcomeText).isDisplayed();
    }
}