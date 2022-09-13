package com.qa.stepdef;

import com.qa.pages.FebrileInfantPageTest;
import com.qa.pages.InfantAppearsIllPageTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class InfantAppearsIllStepDef {
    @When("^I should see page with \"([^\"]*)\" title$")
    public void iShouldSeePageWithTitle(String title) throws InterruptedException {
        Assert.assertEquals(new InfantAppearsIllPageTest().getTitle(title),title);
    }
    @When("^I click on Infant appears ill menu icon$")
    public void iClickOnInfantAppearsIllMenuIcon() throws InterruptedException {
        new InfantAppearsIllPageTest().clickOnMenuIcon();
    }
    @When("^I see dialog with title \"([^\"]*)\"$")
    public void iSeeDialogWithTitleFebrileInfantAppearsIll(String title) throws InterruptedException {
        Assert.assertEquals(new InfantAppearsIllPageTest().checkDialogTitle(title),title);
    }
    @When("^I click on Disclaimers tab")
    public void iClickOnDisclaimersTab() {
        new InfantAppearsIllPageTest().clickOnDisclaimersTab();
    }
    @When("^I click on Diagnostic Tests tab")
    public void iClickOnDiagnosticTestsTab() {
        new InfantAppearsIllPageTest().clickOnDiagnosticTestsTab();
    }
    @When("^I click on Antibiotic Options after Admission tab")
    public void iClickOnAntibioticOptionsAfterAdmissionTab() {
        new InfantAppearsIllPageTest().clickOnAntibioticOptionsAfterAdmissionTab();
    }
    @When("^I click on return to beginning tab")
    public void iClickOnReturnToBeginningTab() {
        new InfantAppearsIllPageTest().clickOnReturnToBeginningTab();
    }

}
