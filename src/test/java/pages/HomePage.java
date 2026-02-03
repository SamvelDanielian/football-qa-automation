package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private static final String BASE_URL =
        System.getProperty(
                "baseUrl",
                "http://127.0.0.1:5500/GaviHugeFan/index.html"
        );

    private By welcomeText = By.className("welcome");
    private By newsLink = By.id("nav-news");
    private By matchesLink = By.id("nav-matches");
    private By trainingsLink = By.id("nav-trainings");
    private By gaviLink = By.id("nav-gavi");
    private By editsLink = By.id("nav-edits");

    public void openHomePage() {
        webDriver.get(BASE_URL);
        wait.waitForVisibility(welcomeText);
    }

    public boolean isWelcomeTextDisplayed() {
        return webDriver.findElement(welcomeText).isDisplayed();
    }

    public void clickNews() {
        wait.waitForClickable(newsLink);
        webDriver.findElement(newsLink).click();
    }

    public void clickMatches() {
        wait.waitForClickable(matchesLink);
        webDriver.findElement(matchesLink).click();
    }

    public void clickTrainings() {
        wait.waitForClickable(trainingsLink);
        webDriver.findElement(trainingsLink).click();
    }

    public void clickGavi() {
        wait.waitForClickable(gaviLink);
        webDriver.findElement(gaviLink).click();
    }

    public void clickEdits() {
        wait.waitForClickable(editsLink);
        webDriver.findElement(editsLink).click();
    }

}