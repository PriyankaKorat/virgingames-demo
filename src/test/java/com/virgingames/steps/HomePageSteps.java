package com.virgingames.steps;

import com.virgingames.pages.BlogPage;
import com.virgingames.pages.HomePage;
import com.virgingames.pages.OnlineSlotPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class HomePageSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @And("I click on Allow cookies")
    public void iClickOnAllowCookies() {
    new HomePage().clickOnAllowCookies();
    }

    @And("I click on Online Slots")
    public void iClickOnOnlineSlots() {
        new HomePage().clickOnOnlineSlots();
    }

    @Then("I should be on Online Slots page {string}")
    public void iShouldBeOnOnlineSlotsPage(String URL) {
        Assert.assertEquals(new OnlineSlotPage().getTheCurrentUrl(),URL,"Both URl is not matched");
    }

    @And("I click on Blog")
    public void iClickOnBlog() {
        new BlogPage().clickOnBlog();
    }

    @Then("I should able to see the text {string}")
    public void iShouldAbleToSeeTheText(String welcomeText) {
        Assert.assertEquals(new BlogPage().verifyWelcomeText(),welcomeText,"Text not matched");
    }
}
