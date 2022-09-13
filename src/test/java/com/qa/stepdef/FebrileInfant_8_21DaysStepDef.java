package com.qa.stepdef;

import com.qa.core.BaseTest;
import com.qa.pages.FebrileInfant_8_21DaysTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FebrileInfant_8_21DaysStepDef {

    @When("^I click on 8 - 21 Days button$")
    public void iClickOn8to21DaysButton() {
        new FebrileInfant_8_21DaysTest().clickOn8To21DaysBtn();
    }
    @Then("^I should on Page Disclaimer with \"([^\"]*)\" title$")
    public void iShouldOnPageDisclaimerWithTitle(String title) throws InterruptedException {
        Assert.assertEquals(new BaseTest().getTitle(title),title);
    }

    @When("^I click on Diagnostic Tests button$")
    public void iClickOnDiagnosticTestsButton() {
        new FebrileInfant_8_21DaysTest().clickOnDiagnosticTestsBtn();
    }
    @Then("^I should on Page Diagnostic Tests with \"([^\"]*)\" title$")
    public void iShouldOnPageDiagnosticTestsWithTitle(String title) throws InterruptedException {
        Assert.assertEquals(new BaseTest().getTitle(title),title);
    }

    @When("^I click on Proceed to HSV Risk Assessment button$")
    public void iClickOnProceedToHSVRiskAssessmentButton() {
        new FebrileInfant_8_21DaysTest().clickOnProceedToHSVRiskAssessmentBtn();
    }
    @Then("^I should on Page HSV Checklist and Assessment with \"([^\"]*)\" title$")
    public void iShouldOnPageHSVChecklistAndAssessmentWithTitle(String title) throws InterruptedException {
        Assert.assertEquals(new BaseTest().getTitle(title),title);
    }

    @When("^I check Maternal history of HSV lesions or fever from 48 hours before delivery to 48 hours after delivery$")
    public void iCheckMaternalHistoryOfHSVLesionsOrFeverFromHoursBeforeDeliveryToHoursAfterDelivery() throws InterruptedException {
        new FebrileInfant_8_21DaysTest().clickOnCheckBox1();
    }
    @When("^I click on HSV Low Risk Recommendations button$")
    public void iClickOnHSVLowRiskRecommendationsButton() {
        new FebrileInfant_8_21DaysTest().clickOnHSVLowRiskRecommendationsBtn();
    }
    @Then("^I should on Page Urinalysis Questions with \"([^\"]*)\" title$")
    public void iShouldOnPageUrinalysisQuestionsWithTitle(String title) throws InterruptedException {
        Assert.assertEquals(new BaseTest().getAppbarTitle(title),title);
    }
    @When("^I click on HSV High Risk Recommendations button$")
    public void iClickOnHSVHighRiskRecommendationsButton() throws InterruptedException {
        new FebrileInfant_8_21DaysTest().clickOnHSVHighRiskRecommendationsBtn();
    }

    @When("^I click on Urinalysis Results Assessment button$")
    public void iClickOnUrinalysisResultsAssessmentButton() {
        new FebrileInfant_8_21DaysTest().clickOnUrinalysisResultsAssessmentBtn();
    }
    @Then("^I should on Page Urinalysis Questions HIGH RISK with \"([^\"]*)\" title$")
    public void iShouldOnPageUrinalysisQuestionsHIGHRISKWithTitle(String title) throws InterruptedException {
        Assert.assertEquals(new BaseTest().getAppbarTitle(title),title);
    }

    @When("^I click on yes button$")
    public void iClickOnYesButton() throws Exception {
        new FebrileInfant_8_21DaysTest().clickOnYesBtn();
    }
    @When("^I click on no button$")
    public void iClickOnNoButton() throws Exception {
        new FebrileInfant_8_21DaysTest().clickOnNoBtn();
    }
    @Then("^I should see content for \"([^\"]*)\"$")
    public void iShouldSeeContentFor(String content) throws InterruptedException {
        Assert.assertEquals(new BaseTest().getTitle(content),content);
    }

    @When("^I click on Proceed to Hospital Admission Recommendations button$")
    public void iClickOnProceedToHospitalAdmissionRecommendationsButton() {
        new FebrileInfant_8_21DaysTest().clickOnProceedToHospitalAdmissionRecommendationsBtn();
    }
    @Then("^I should on Page Admission Recommendations with \"([^\"]*)\" title$")
    public void iShouldOnPageAdmissionRecommendationsWithTitle(String title) throws InterruptedException {
        Assert.assertEquals(new BaseTest().getTitle(title),title);
    }

    @When("^I click on Restart Guideline button$")
    public void iClickOnRestartGuidelineButton() {
        new FebrileInfant_8_21DaysTest().clickOnRestartGuidelineBtn();
    }



    @When("^I click on Disclaimer tab$")
    public void iClickOnDisclaimerTab() {
        new FebrileInfant_8_21DaysTest().clickOnDisclaimerTab();
    }
    @When("^I click on HSV Risk Assessment tab$")
    public void iClickOnHSVRiskAssessmentTab() {
        new FebrileInfant_8_21DaysTest().clickOnHSVRiskAssessmentTab();
    }
    @When("^I click on High-Risk Recommendations tab$")
    public void iClickOnHighRiskRecommendationsTab() {
        new FebrileInfant_8_21DaysTest().clickOnHighRiskRecommendationsTab();
    }
    @Then("^I should on Page High Risk Recommendations with \"([^\"]*)\" title$")
    public void iShouldOnPageHighRiskRecommendationsWithTitle(String title) throws InterruptedException {
        Assert.assertEquals(new BaseTest().getTitle(title),title);
    }
    @When("^I click on Urinalysis Questions tab$")
    public void iClickOnUrinalysisQuestionsTab() {
        new FebrileInfant_8_21DaysTest().clickOnUrinalysisQuestionsTab();
    }
    @When("^I click on Admission Recommendations tab$")
    public void iClickOnAdmissionRecommendationsTab() {
        new FebrileInfant_8_21DaysTest().clickOnAdmissionRecommendationsTab();
    }


}
