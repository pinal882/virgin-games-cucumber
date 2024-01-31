package com.virgingames.steps;

import com.virgingames.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.testng.Assert;

public class HomePageSteps {
    @Given("I am on home page")
    public void iAmOnHomePage() {
    }

    @And("I verify I am on home page")
    public void iVerifyIAmOnHomePage() {
        String expectedTitle = "Virgin Games | Play Online Betting Games With Real Money";
        Assert.assertEquals(new HomePage().getTitle(),expectedTitle);
    }
    @And("I accept Necessary cookies only")
    public void iAcceptNecessaryCookiesOnly() {
        new HomePage().clickOnNecessaryCookiesOnly();

    }

    @And("I click on join now tab")
    public void iClickOnJoinNowTab() {
        new HomePage().clickOnJoinNowTab();

    }

}
