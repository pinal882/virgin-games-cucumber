package com.virgingames.steps;

import com.virgingames.pages.HomePage;
import com.virgingames.pages.OnlineSlotsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class OnlineSlotsSteps {
    @Then("I verify the text {string}")
    public void iVerifyTheTextPlayOnlineSlotsAtVirginGames(String text){

        Assert.assertEquals(new OnlineSlotsPage().verifyPlayOnlineSlotsAtVirginGamesText(),text);
    }

    @When("I click on {string} tab")
    public void iClickOnOnlineSlotsTab(String menu) throws InterruptedException {

        new HomePage().selectTopMenu(menu);
        Thread.sleep(2000);
    }
}
