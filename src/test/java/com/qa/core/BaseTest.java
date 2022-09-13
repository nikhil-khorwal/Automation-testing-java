package com.qa.core;

import com.qa.utils.DriverManager;
import com.qa.utils.GlobalParams;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BaseTest extends  BasePage{
    AppiumDriver driver = new DriverManager().getDriver();
    GlobalParams params = new GlobalParams();

    public String getTitle(String title) throws InterruptedException {
        waitForSecond(2);
        if (params.getPlatformName().equals("iOS")) {
            WebElement text = getIosTextElement(title);
            return text.getText();
        } else {
            return getAndroidTextElement(title).getText();
        }
    }

    public String getAppbarTitle(String title) throws InterruptedException {
        waitForSecond(2);
        if (params.getPlatformName().equals("iOS")) {
            String xPath = "//XCUIElementTypeStaticText[@name=\"screen_header_text\"]";
            return driver.findElement(By.xpath(xPath)).getText();
        } else {
            String xPath = "//android.widget.TextView[@content-desc=\"screen_header_text\"]";
            return driver.findElement(By.xpath(xPath)).getText();
        }
    }
}
