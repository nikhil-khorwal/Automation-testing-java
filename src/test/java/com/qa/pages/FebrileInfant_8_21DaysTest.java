package com.qa.pages;

import com.microsoft.appcenter.appium.Factory;
import com.qa.core.BasePage;
import com.qa.utils.GlobalParams;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Rule;
import org.junit.rules.TestWatcher;


public class FebrileInfant_8_21DaysTest extends BasePage {
    @Rule
    public TestWatcher watcher = Factory.createWatcher();
    TestUtils utils = new TestUtils();

    GlobalParams params = new GlobalParams();

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"8-21Days\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"8 - 21 Days\"]")
    private MobileElement day8_21Btn;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"DiagnosticTests\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Diagnostic Tests\"])[2]")
    private MobileElement diagnosticTestsBtn;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"ProceedtoHSVRiskAssessment\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Proceed to HSV Risk Assessment \"])[2]")
    private MobileElement proceedToHSVRiskAssessmentBtn;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Maternal history of HSV lesions or fever from 48 hours before delivery to 48 hours after delivery?\"]/XCUIElementTypeOther")
    private MobileElement checkBox1;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"HSVHighRiskRecommendations\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"HSV High Risk Recommendations\"])[2]")
    private MobileElement HSVHighRiskRecommendationsBtn;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"HSVLowRiskRecommendations\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"HSV Low Risk Recommendations\"])[2]")
    private MobileElement HSVLowRiskRecommendationsBtn;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"UrinalysisResultsAssessment\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Urinalysis Results Assessment\"])[2]")
    private MobileElement urinalysisResultsAssessment;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Yes\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Yes\"]")
    private MobileElement yesBtn;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"No\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"No\"]")
    private MobileElement noBtn;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"ProceedtoHospitalAdmissionRecommendations\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\" Proceed to Hospital Admission Recommendation\"])[2]")
    private MobileElement proceedToHospitalAdmissionRecommendationsBtn;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"RestartGuideline\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Restart Guideline\"])[2]")
    private MobileElement restartGuidelineBtn;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Disclaimer\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Disclaimer\"]")
    private MobileElement disclaimerTab;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"HSV Risk Assessment\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"HSV Risk Assessment\"]")
    private MobileElement HSVRiskAssessmentTab;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"High-Risk Recommendations\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"High-Risk Recommendations\"]")
    private MobileElement highRiskRecommendationsTab;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Urinalysis Questions\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Urinalysis Questions\"]")
    private MobileElement urinalysisQuestionsTab;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Admission Recommendations\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Admission Recommendations\"]")
    private MobileElement admissionRecommendationsTab;

    public void clickOn8To21DaysBtn() {
        click(day8_21Btn);
    }

    public void clickOnDiagnosticTestsBtn() {
        click(diagnosticTestsBtn);
    }

    public void clickOnProceedToHSVRiskAssessmentBtn() {
        click(proceedToHSVRiskAssessmentBtn);
    }

    public void clickOnCheckBox1() throws InterruptedException {
        if(params.getPlatformName().equals("iOS")){
            click(checkBox1);
        }else{
            getMobileImageElementByClassName(4).click();
        }

    }

    public void clickOnHSVHighRiskRecommendationsBtn() throws InterruptedException {

        click(HSVHighRiskRecommendationsBtn);
    }

    public void clickOnUrinalysisResultsAssessmentBtn() {
        click(urinalysisResultsAssessment);
    }

    public void clickOnYesBtn() throws Exception {
        scrollToElement(yesBtn,"").click();
    }

    public void clickOnProceedToHospitalAdmissionRecommendationsBtn() {
        click(proceedToHospitalAdmissionRecommendationsBtn);
    }

    public void clickOnRestartGuidelineBtn() {
        click(restartGuidelineBtn);
    }

    public void clickOnNoBtn() throws Exception {
        scrollToElement(noBtn,"").click();
    }

    public void clickOnHSVLowRiskRecommendationsBtn() {
        click(HSVLowRiskRecommendationsBtn);
    }

    public void clickOnDisclaimerTab() {
        click(disclaimerTab);
    }

    public void clickOnHSVRiskAssessmentTab() {
        click(HSVRiskAssessmentTab);
    }

    public void clickOnHighRiskRecommendationsTab() {
        click(highRiskRecommendationsTab);
    }

    public void clickOnUrinalysisQuestionsTab() {
        click(urinalysisQuestionsTab);
    }

    public void clickOnAdmissionRecommendationsTab() {
        click(admissionRecommendationsTab);
    }
}
