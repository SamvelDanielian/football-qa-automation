package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;

import static org.junit.Assert.assertTrue;

public class HomepageSteps {
    HomePage homePage = new HomePage();

    @Given("user opens home page successfully")
    public void userOpensHomePageSuccessfully() {
        homePage.openHomePage();
    }

    @Then("home page should display Welcome text")
    public void homePageShouldDisplayWelcomeText() {
        assertTrue("Welcome text is not visible", 
                    homePage.isWelcomeTextDisplayed());
    }
    
}
