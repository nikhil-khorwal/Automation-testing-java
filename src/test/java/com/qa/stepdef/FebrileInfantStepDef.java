package com.qa.stepdef;

import com.qa.pages.FebrileInfantPageTest;
import com.qa.pages.HomePageTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FebrileInfantStepDef {
    @When("^I click on \"([^\"]*)\" button$")
    public void iClickOnButtonWithTitle(String title) {
        new FebrileInfantPageTest().clickOnButton(title);
    }
    @When("^I click back$")
    public void iClickBack() {
        new FebrileInfantPageTest().getBack();
    }
    @Then("^I should go back with page \"([^\"]*)\"$")
    public void iShouldGoBackWithPage(String title) {
        Assert.assertEquals(new FebrileInfantPageTest().getTabTitle(),title);
    }
}
