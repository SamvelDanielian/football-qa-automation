package pages;

import org.openqa.selenium.By;

public class NewsPage extends BasePage {

    private By newsHeaderText = By.className("news-hero-title");

    public boolean isNewsPageOpened() {
        wait.waitForVisibility(newsHeaderText);
        return webDriver.findElement(newsHeaderText).isDisplayed();
    }
}