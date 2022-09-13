package com.qa.pages;

import com.microsoft.appcenter.appium.Factory;
import com.qa.core.BasePage;
import com.qa.utils.DriverManager;
import com.qa.utils.GlobalParams;
import com.qa.utils.TestUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Rule;
import org.junit.rules.TestWatcher;
import org.openqa.selenium.WebElement;

public class InfantAppearsIllPageTest extends BasePage {
    @Rule
    public TestWatcher watcher = Factory.createWatcher();
    TestUtils utils = new TestUtils();

    AppiumDriver driver = new DriverManager().getDriver();
    GlobalParams params = new GlobalParams();


    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"BACK\"])[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther")
    private MobileElement menuIcon;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Disclaimers\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Disclaimers\"]")
    private MobileElement disclaimerMenuTab;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Diagnostic Tests\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Diagnostic Tests\"])[3]")
    private MobileElement diagnosticTestsMenuTab;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Antibiotic Options after Admission\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Horizontal scroll bar, 1 page\"])[3]")
    private MobileElement antibioticOptionsAfterAdmissionMenuTab;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Return to Beginning\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Return to Beginning\"])[2]")
    private MobileElement returnToBeginningMenuTab;

    public void clickOnMenuIcon() throws InterruptedException {
        if(params.getPlatformName().equals("iOS")){
            menuIcon.click();
        }else{
            waitForSecond(1);
            getMobileImageElementByClassName(3).click();
        }
    }
    public void clickOnDisclaimersTab() {
        disclaimerMenuTab.click();
    }

    public String checkDialogTitle(String title) throws InterruptedException {
        waitForSecond(2);
        if(params.getPlatformName().equals("iOS")){
            return getIosTextElement(title).getText();
        }else{
            return getAndroidTextElement(title).getText();
        }
    }

    public void clickOnDiagnosticTestsTab() {
        click(diagnosticTestsMenuTab);
    }

    public void clickOnAntibioticOptionsAfterAdmissionTab() {
        click(antibioticOptionsAfterAdmissionMenuTab);
    }

    public void clickOnReturnToBeginningTab() {
        waitForVisibility(returnToBeginningMenuTab);
        click(returnToBeginningMenuTab);
    }

    public String getTitle(String title) throws InterruptedException {
        waitForSecond(2);
        if (params.getPlatformName().equals("iOS")) {
            WebElement text = getIosTextElement(title);
            return text.getText();
        } else {
            return getAndroidTextElement(title).getText();
        }
    }



}
