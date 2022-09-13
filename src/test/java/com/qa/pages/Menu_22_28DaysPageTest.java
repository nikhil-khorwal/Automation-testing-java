package com.qa.pages;

import com.qa.core.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Menu_22_28DaysPageTest extends BasePage {

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"22 - 28 Days\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"22-28Days\"]")
    MobileElement day22to28;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Low Risk Recommendations\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Low Risk Recommendations\"]")
    MobileElement lowRiskRecommendationsTab;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Bacterial Infection Assesment\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Bacterial Infection Assesment\"]")
    MobileElement bacterialInfectionAssessmentTab;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Disposition Recommendations (High Risk Bacterial)\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Disposition Recommendations (High Risk Bacterial)\"]")
    MobileElement dispositionRecommendationsHighRiskBacterialTab;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Disposition Recommendations (Low Risk Bacterial)\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Disposition Recommendations (Low Risk Bacterial)\"]")
    MobileElement dispositionRecommendationsLowRiskBacterialTab;

    public void ClickOn22to28DaysButton() {
        click(day22to28);
    }

    public void ClickOnLowRiskRecommendationsTab() {
        click(lowRiskRecommendationsTab);
    }

    public void ClickOnBacterialInfectionAssessmentTab() {
        click(bacterialInfectionAssessmentTab);
    }

    public void ClickOnDispositionRecommendationsHighRiskBacterialTab() {
        click(dispositionRecommendationsHighRiskBacterialTab);
    }

    public void ClickOnDispositionRecommendationsLowRiskBacterialTab() {
        click(dispositionRecommendationsLowRiskBacterialTab);
    }
}
