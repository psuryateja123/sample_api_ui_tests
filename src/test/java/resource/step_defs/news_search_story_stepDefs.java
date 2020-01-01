package resource.step_defs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import resource.page_objects.news_search_story_pageObjects;

public class news_search_story_stepDefs {
    @Given("^I am on the gaurdian home page$")
    public void iAmOnTheGaurdianHomePage() {
        news_search_story_pageObjects.gaudian_home_page_navigation();
    }

    @Then("^I select the first story$")
    public void iSelectTheFirstStory() {
        news_search_story_pageObjects.first_article();
    }

    @And("^I search the first story in Google for authenticity$")
    public void iSearchTheFirstStoryInGoogleForAuthenticity() {
        news_search_story_pageObjects.search_in_google();
    }
}
