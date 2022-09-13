package com.qa.stepdef;

import com.qa.pages.FebrileInfantPageTest;
import com.qa.pages.MakeCallTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MakeCallStepDef {

    @When("^I click on call Button$")
    public void iClickOnCallButton() {
        new MakeCallTest().clickOnCallButton();
    }

    @When("^I call to provider \"([^\"]*)\"$")
    public void iCallToProvider(String provider) throws InterruptedException {
        new MakeCallTest().callToProvider(provider);
    }

    @When("^I click cancel button$")
    public void iClickCancelButton()  {
        new MakeCallTest().clickCancel();
    }
    @Then("^I should see home page with title \"([^\"]*)\"$")
    public void iShouldSeeHomePageWithTitle (String title)  {
        Assert.assertEquals(new MakeCallTest().getAppbarTitle(),title);
    }
}
