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


public class FebrileInfantPageTest extends BasePage {
    @Rule
    public TestWatcher watcher = Factory.createWatcher();
    TestUtils utils = new TestUtils();

    GlobalParams params = new GlobalParams();

    @AndroidFindBy (xpath = "//android.widget.TextView[@content-desc=\"go_back_btn\"]")
    @iOSXCUITFindBy (xpath = "(//XCUIElementTypeOther[@name=\"BACK\"])[2]")
    private MobileElement backBtn;
    @AndroidFindBy (xpath = "//android.widget.TextView[@content-desc=\"RestartGuideline\"]")
    @iOSXCUITFindBy (xpath = "(//XCUIElementTypeOther[@name=\"Restart Guideline\"])[2]")
    private MobileElement restartGuidelineButton;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"module_logo_txt\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"module_logo_txt\"]")
    private MobileElement tabPageTitle;

    public void clickOnButton(String title){
        if(title.equals("Restart Guideline")) {
            restartGuidelineButton.click();
        }else{
            if(params.getPlatformName().equals("iOS")){
                getIosOtherElement(title).click();
            }else{
                click(andScrollToElementUsingUiScrollable("text",title));
            }
        }
    }
    public void getBack(){
        click(backBtn);
    }
    public String getTabTitle(){
        waitForVisibility(tabPageTitle);
        return tabPageTitle.getText();
    }



}
