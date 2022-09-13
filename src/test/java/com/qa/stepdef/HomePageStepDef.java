package com.qa.stepdef;

import com.qa.pages.AboutPedsGuidePageTest;
import com.qa.pages.HomePageTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomePageStepDef {

    @When("^I click on Febrile Infant$")
    public void iClickOnFebrileInfant() throws Exception {
        new HomePageTest().clickOnFebrileInfant();
    }
    @Then("^I should be on febrile infant page with title\"([^\"]*)\"$")
    public void iShouldBeOnFebrileInfantPageWithTitle(String title) {
        Assert.assertEquals(new HomePageTest().getTitle(),title);
    }
}
