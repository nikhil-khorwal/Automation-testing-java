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

public class MakeCallTest extends BasePage {
    @Rule
    public TestWatcher watcher = Factory.createWatcher();
    TestUtils utils = new TestUtils();

    GlobalParams params = new GlobalParams();
    @AndroidFindBy (xpath = "//android.widget.TextView[@content-desc=\"screen_header_text\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"screen_header_text\"]")
    private MobileElement appBarTitleTxt;

    @AndroidFindBy (xpath = "//android.widget.TextView[@text=\"Healthcare Provider\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Healthcare Provider Call 1-800-GO-MERCY Transfer Center\"]")
    private MobileElement provider1;

    @AndroidFindBy (xpath = "//android.widget.TextView[@text=\"EMS Provider\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"EMS Provider Call Children's Mercy Emergency Dept\"]")
    private MobileElement provider2;

    @AndroidFindBy (xpath = "//android.widget.TextView[@text='Cancel']")
    @iOSXCUITFindBy (xpath = "//XCUIElementTypeOther[@name=\"Cancel\"]")
    private MobileElement cancelBtn;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Febrile Infant Decision Support\"])[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther")
    private MobileElement callBtn;

    public void clickCancel(){
        cancelBtn.click();
    }

    public void clickOnCallButton(){
        if(params.getPlatformName()=="iOS"){
            click(callBtn);
        }else{
            getMobileImageElementByClassName(1).click();
        }

    }

    public void callToProvider(String provider) throws InterruptedException {
        if(provider.equals("Healthcare Provider")){
            click(provider1);
        }else{
            click(provider2);
        }
        for (int i = 0; i < 2; i++) {
            waitForSecond(2);
            back();
            back();
            back();
        }
    }

    public String getAppbarTitle(){
        return getText(appBarTitleTxt, "title");
    }


}
