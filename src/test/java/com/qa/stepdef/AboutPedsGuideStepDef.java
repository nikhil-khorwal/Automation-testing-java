package com.qa.stepdef;

import com.qa.pages.AboutPedsGuidePageTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AboutPedsGuideStepDef {

    @When("^I click on i will do this later button$")
    public void iClickOnIWillDoThisLaterButton() throws Exception {
        new AboutPedsGuidePageTest().pressIWillDoThisLaterBtn();
    }
    @Then("^I should be on home page with title\"([^\"]*)\"$")
    public void iShouldBeOnHomePageWithTitle (String title) {
        Assert.assertEquals(new AboutPedsGuidePageTest().getAppbar(),title);
    }

}

