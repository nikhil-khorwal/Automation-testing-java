package com.qa.pages;

import com.qa.core.BasePage;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import com.microsoft.appcenter.appium.Factory;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Rule;
import org.junit.rules.TestWatcher;

public class DisclaimerPageTest extends BasePage {
    @Rule
    public TestWatcher watcher = Factory.createWatcher();
    TestUtils utils = new TestUtils();


    @AndroidFindBy (xpath = "//android.widget.TextView[@text='Disclaimer']")
    @iOSXCUITFindBy (xpath ="//XCUIElementTypeStaticText[@name=\"Disclaimer\"]" )
    private MobileElement titleTxt;
    @AndroidFindBy (xpath = "//android.widget.TextView[@text='Accept']")
    @iOSXCUITFindBy (xpath = "(//XCUIElementTypeOther[@name=\"Accept\"])[2]")
    private MobileElement acceptBtn;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='About PedsGuide']")
    @iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"About PedsGuide\"]")
    private MobileElement nextTitleTxt;


    public String getTitle(){
        return getText(titleTxt, "title");
    }
    public void pressAcceptBtn() {
        click(acceptBtn, "press accept button");
    }
    public String checkNextPageTitle(String title) {
        return getText(nextTitleTxt,title);
    }


}
