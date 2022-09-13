package com.qa.stepdef;

import com.qa.core.BaseTest;
import com.qa.pages.FebrileInfant_29_60DaysTest;
import com.qa.pages.Menu_22_28DaysPageTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Menu_22_28DaysStepDef {
    @When("^I click on 22 - 28 Days button$")
    public void iClickOn22to28DaysButton() {
        new Menu_22_28DaysPageTest().ClickOn22to28DaysButton();
    }

    @Then("^I should on Page Evaluation for Infants 22-28 Days Old with \"([^\"]*)\" title$")
    public void iShouldOnPageEvaluationForInfantsDaysOldWithTitle(String title) throws InterruptedException {
        Assert.assertEquals(new BaseTest().getTitle(title),title);
    }

    @When("^I click on Low Risk Recommendations tab$")
    public void iClickOnLowRiskRecommendationsTab() {
        new Menu_22_28DaysPageTest().ClickOnLowRiskRecommendationsTab();
    }

    @Then("^I should on Page HSV Low Risk Recommendations with \"([^\"]*)\" title$")
    public void iShouldOnPageHSVLowRiskRecommendationsWithTitle(String title) throws InterruptedException {
        Assert.assertEquals(new BaseTest().getTitle(title),title);
    }

    @When("^I click on Bacterial Infection Assessment tab$")
    public void iClickOnBacterialInfectionAssessmentTab() {
        new Menu_22_28DaysPageTest().ClickOnBacterialInfectionAssessmentTab();
    }

    @When("^I click on Disposition Recommendations High Risk Bacterial tab$")
    public void iClickOnDispositionRecommendationsHighRiskBacterialTab() {
        new Menu_22_28DaysPageTest().ClickOnDispositionRecommendationsHighRiskBacterialTab();
    }

    @When("^I click on Disposition Recommendations Low Risk Bacterial tab$")
    public void iClickOnDispositionRecommendationsLowRiskBacterialTab() {
        new Menu_22_28DaysPageTest().ClickOnDispositionRecommendationsLowRiskBacterialTab();
    }
}
