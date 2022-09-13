package com.qa.stepdef;

import com.qa.core.BaseTest;
import com.qa.pages.FebrileInfant_29_60DaysTest;
import com.qa.pages.FebrileInfant_8_21DaysTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FebrileInfant_29_60DaysStepDef {
    @When("^I click on 29 - 60 Days button$")
    public void iClickOn29to60DaysButton() {
        new FebrileInfant_29_60DaysTest().clickOn29to60DaysButton();
    }

    @Then("^I should on Page Urinary Tract Infection with \"([^\"]*)\" title$")
    public void iShouldOnPageUrinaryTractInfectionWithTitle(String title) throws InterruptedException {
        Assert.assertEquals(new BaseTest().getTitle(title),title);
    }

    @Then("^I should on Page Bacterial Infection Assessment with \"([^\"]*)\" title$")
    public void iShouldOnPageBacterialInfectionAssessmentWithTitle(String title) throws InterruptedException {
        Assert.assertEquals(new BaseTest().getTitle(title),title);
    }

    @When("^I check Historical or Documented Fever$")
    public void iCheckHistoricalOrDocumentedFeverCF() {
        new FebrileInfant_29_60DaysTest().clickOnHistoricalOrDocumentedFeverCF();
    }

    @And("^I click on Proceed to High-Risk Bacterial Infection Recommendations button$")
    public void iClickOnProceedToHighRiskBacterialInfectionRecommendationsButton() {
        new FebrileInfant_29_60DaysTest().clickOnProceedToHighRiskBacterialInfectionRecommendationsButton();
    }

    @Then("^I should on Page Disposition Recommendations with \"([^\"]*)\" title$")
    public void iShouldOnPageDispositionRecommendationsWithTitle(String title) throws InterruptedException {
        Assert.assertEquals(new BaseTest().getTitle(title),title);
    }

    @When("^I see question \"([^\"]*)\"$")
    public void iSeeQuestion(String title) throws InterruptedException {
        Assert.assertEquals(new BaseTest().getTitle(title),title);
    }

    @When("^I click on next button$")
    public void iClickOnNextButton() {
        new FebrileInfant_29_60DaysTest().clickOnNextButton();
    }

    @When("^I click on question1 yes button$")
    public void iClickOnQuestion1YesButton() throws Exception {
        new FebrileInfant_29_60DaysTest().clickOnYesBtn(1);
    }
    @When("^I click on question2 yes button$")
    public void iClickOnQuestion2YesButton() throws Exception {
        new FebrileInfant_29_60DaysTest().clickOnYesBtn(2);
    }
    @When("^I click on question3 yes button$")
    public void iClickOnQuestion3YesButton() throws Exception {
        new FebrileInfant_29_60DaysTest().clickOnYesBtn(3);
    }
    @When("^I click on question4 yes button$")
    public void iClickOnQuestion4YesButton() throws Exception {
        new FebrileInfant_29_60DaysTest().clickOnYesBtn(4);
    }

    @When("I click on no1 button")
    public void iClickOnNo1Button() throws Exception {
        new FebrileInfant_29_60DaysTest().clickOnNoBtn(1);
    }
    @When("I click on no2 button")
    public void iClickOnNo2Button() throws Exception {
        new FebrileInfant_29_60DaysTest().clickOnNoBtn(2);
    }

    @And("^I click on Proceed to High-Risk Recommendations button$")
    public void iClickOnProceedToHighRiskRecommendationsButton() {
        new FebrileInfant_29_60DaysTest().ClickOnProceedToHighRiskRecommendationsButton();
    }

    @When("^I click on High Risk Recommendations tab$")
    public void iClickOnHighRiskRecommendationsTab() {
        new FebrileInfant_29_60DaysTest().ClickOnHighRiskRecommendationsTab();
    }

    @Then("^I should on Page High Risk HSV Recommendations with \"([^\"]*)\" title$")
    public void iShouldOnPageHighRiskHSVRecommendationsWithTitle(String title) throws InterruptedException {
        Assert.assertEquals(new BaseTest().getTitle(title),title);

    }

    @When("^I click on High Risk Admission Recommendations tab$")
    public void iClickOnHighRiskAdmissionRecommendationsTab() {
        new FebrileInfant_29_60DaysTest().ClickOnHighRiskAdmissionRecommendationsTab();
    }

    @When("^I click on Bacterial Infection Risk Assessment tab$")
    public void iClickOnBacterialInfectionRiskAssessmentTab() {
        new FebrileInfant_29_60DaysTest().ClickOnBacterialInfectionRiskAssessmentTab();
    }

    @When("^I click on Discharge Checklist tab$")
    public void iClickOnDischargeChecklistTab() throws Exception {
        new FebrileInfant_29_60DaysTest().ClickOnDischargeChecklistTab();
    }

    @Then("^I should on Page Discharge Checklist \"([^\"]*)\" title$")
    public void iShouldOnPageDischargeChecklistTitle(String title) throws InterruptedException {
        Assert.assertEquals(new BaseTest().getTitle(title),title);
    }


    @And("^I click on Proceed to Discharge Checklist button$")
    public void iClickOnProceedToDischargeChecklistButton() {
        new FebrileInfant_29_60DaysTest().ClickOnProceedToDischargeChecklistButton();
    }

    @When("^I check Are the parents comfortable with monitoring their child at home$")
    public void iCheckAreTheParentsComfortableWithMonitoringTheirChildAtHome() throws InterruptedException {
        new FebrileInfant_29_60DaysTest().clickOnCheckBox1();
    }
}
