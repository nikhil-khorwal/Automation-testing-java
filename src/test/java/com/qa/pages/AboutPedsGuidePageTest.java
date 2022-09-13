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

public class AboutPedsGuidePageTest extends BasePage {
    @Rule
    public TestWatcher watcher = Factory.createWatcher();


    GlobalParams params = new GlobalParams();
    TestUtils utils = new TestUtils();

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='About PedsGuide']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"About PedsGuide\"]")
    private MobileElement titleTxt;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"I'lldothislater\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"I'll do this later\"]")
    private MobileElement iWillDoItLaterBtn;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"screen_header_text\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"screen_header_text\"]")
    private MobileElement appBarTitle;


    public String getTitle(){
        return getText(titleTxt, "title");
    }
    public void pressIWillDoThisLaterBtn() throws Exception {
        if(params.getPlatformName().equals("iOS"))
        {
            iOSScrollToElementUsingMobileScroll(iWillDoItLaterBtn);
            click(iWillDoItLaterBtn);

        }else{
            click(scrollToElement(iWillDoItLaterBtn,"up"));
        }
    }

    public String getAppbar(){

        return appBarTitle.getText();
    }

}
