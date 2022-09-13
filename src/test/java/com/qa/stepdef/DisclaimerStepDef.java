package com.qa.stepdef;

import com.qa.pages.AboutPedsGuidePageTest;
import com.qa.pages.DisclaimerPageTest;
import com.qa.pages.HomePageTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DisclaimerStepDef {
    @When("^I should see Disclaimer page with title \"([^\"]*)\"$")
    public void iShouldSeeDisclaimerPageWithTitle(String title) {
        Assert.assertEquals(new DisclaimerPageTest().getTitle(), title);
    }
    @When("^I click on accept button$")
    public void iClickOnAcceptButton() {
        new DisclaimerPageTest().pressAcceptBtn();
    }
    @Then("^I should be on aboutPedsGuide page with title \"([^\"]*)\"$")
    public void iShouldBeOnAboutPedsGuidePageWithTitle (String title){
        Assert.assertEquals(new DisclaimerPageTest().checkNextPageTitle(title), title);
    }
}
