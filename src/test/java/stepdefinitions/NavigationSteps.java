package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.*;

import static org.junit.Assert.assertTrue;

public class NavigationSteps {

    HomePage homePage = new HomePage();
    NewsPage newsPage = new NewsPage();
    MatchesPage matchesPage = new MatchesPage();
    TrainingsPage trainingsPage = new TrainingsPage();
    GaviPage gaviPage = new GaviPage();
    EditsPage editsPage = new EditsPage();

    @Given("user is on the home page")
    public void userIsOnHomePage() {
        homePage.openHomePage();
    }

    @Then("user navigates to News page")
    public void userNavigatesToNewsPage() {
        homePage.clickNews();
        assertTrue("News page is not opened!", newsPage.isNewsPageOpened());
    }

    @Then("user navigates to Matches page")
    public void userNavigatesToMatchesPage() {
        homePage.clickMatches();
        assertTrue("Matches page is not opened!", matchesPage.isMatchesPageOpened());
    }

    @Then("user navigates to Trainings page")
    public void userNavigatesToTrainingsPage() {
        homePage.clickTrainings();
        assertTrue("Trainings page is not opened!", trainingsPage.isTrainingsPageOpened());
    }

    @Then("user navigates to Gavi page")
    public void userNavigatesToGaviPage() {
        homePage.clickGavi();
        assertTrue("Gavi page is not opened!", gaviPage.isGaviPageOpened());
    }

    @Then("user navigates to Edits page")
    public void userNavigatesToEditsPage() {
        homePage.clickEdits();
        assertTrue("Edits page is not opened", editsPage.isEditsPageOpened());
    }    
}