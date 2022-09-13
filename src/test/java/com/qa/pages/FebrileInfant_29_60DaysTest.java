package com.qa.pages;
import com.qa.core.BasePage;
import com.qa.utils.DriverManager;
import com.qa.utils.GlobalParams;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class FebrileInfant_29_60DaysTest extends BasePage {

    AppiumDriver driver = new DriverManager().getDriver();
    GlobalParams params = new GlobalParams();

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"29-60Days\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"29 - 60 Days\"]")
    MobileElement day29to60Btn;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"ProceedtoHigh-RiskBacterialInfectionRecommendations\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Proceed to High-Risk Bacterial Infection Recommendations\"])[2]")
    MobileElement proceedToHighRiskBacterialInfectionRecommendationsBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Next\"]\n")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Next\"])[2]")
    MobileElement nextBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"ProceedtoHigh-RiskRecommendations\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"ProceedtoHigh-RiskRecommendations\"]")
    MobileElement proceedToHighRiskRecommendationsButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"High Risk Recommendations\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"High Risk Recommendations\"]")
    MobileElement highRiskRecommendationsTab;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"High Risk Admission Recommendations\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"High Risk Admission Recommendations\"]")
    MobileElement highRiskAdmissionRecommendationsTab;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Bacterial Infection Risk Assessment\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Bacterial Infection Risk Assessment\"]")
    MobileElement bacterialInfectionRiskAssessmentTab;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Discharge Checklist\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Discharge Checklist\"]")
    MobileElement dischargeChecklistTab;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Are the parents comfortable with monitoring their child at home?\"]/XCUIElementTypeOther")
    MobileElement checkBox1;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"ProceedtoDischargeChecklist\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Discharge Checklist\"])[2]")
    MobileElement proceedToDischargeChecklistBtn;





    public void clickOn29to60DaysButton() {
        click(day29to60Btn);
    }

    public void clickOnHistoricalOrDocumentedFeverCF() {
        getMobileImageElementByClassName(4).click();
    }

    public void clickOnProceedToHighRiskBacterialInfectionRecommendationsButton() {
        click(proceedToHighRiskBacterialInfectionRecommendationsBtn);
    }

    public void clickOnNextButton() {
        click(nextBtn);
    }

    public void clickOnYesBtn(int i) throws Exception {
        if(params.getPlatformName().equals("Android")){
            waitForSecond(1);
            String xPath = "(//*[@text=\"Yes\"])["+i+"]";
            System.out.println(xPath);
            WebElement yesBtn = driver.findElement(scrollToElement(By.xpath(xPath),"up"));
            yesBtn.click();
        }else{
            waitForSecond(1);
            String xPath = "(//*[@name=\"Yes\"])["+i+"]";
            System.out.println(xPath);
            WebElement yesBtn = driver.findElement(scrollToElement(By.xpath(xPath),"up"));
            yesBtn.click();
        }
    }

    public void clickOnNoBtn(int i) throws Exception {
        if(params.getPlatformName().equals("Android")){
            waitForSecond(1);
            String xPath = "(//*[@text=\"No\"])["+i+"]";
            System.out.println(xPath);
            WebElement yesBtn = driver.findElement(scrollToElement(By.xpath(xPath),"up"));
            yesBtn.click();
        }else{
            waitForSecond(1);
            String xPath = "(//*[@name=\"No\"])["+i+"]";
            System.out.println(xPath);
            WebElement yesBtn = driver.findElement(scrollToElement(By.xpath(xPath),"up"));
            yesBtn.click();
        }
    }

    public void ClickOnProceedToHighRiskRecommendationsButton() {
        click(proceedToHighRiskRecommendationsButton);
    }

    public void ClickOnHighRiskRecommendationsTab() {
        click(highRiskRecommendationsTab);
    }

    public void ClickOnHighRiskAdmissionRecommendationsTab() {
        click(highRiskAdmissionRecommendationsTab);
    }

    public void ClickOnBacterialInfectionRiskAssessmentTab() {
        click(bacterialInfectionRiskAssessmentTab);
    }

    public void ClickOnDischargeChecklistTab() throws Exception {
        scrollToElement(dischargeChecklistTab,"up").click();

    }

    public void clickOnCheckBox1() throws InterruptedException {
        if(params.getPlatformName().equals("iOS")){
            click(checkBox1);
        }else{
            getMobileImageElementByClassName(4).click();
        }

    }

    public void ClickOnProceedToDischargeChecklistButton() {
        click(proceedToDischargeChecklistBtn);
    }
}
