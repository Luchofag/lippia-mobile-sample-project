package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.driver.DriverManager;
import com.crowdar.examples.constants.HomeConstants;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class HomeService {
    public static void isViewLoaded() {
        MobileActionManager.waitVisibility(HomeConstants.TIME_ENTRIES_TEXT);
        MobileActionManager.getElement(HomeConstants.TIME_ENTRIES_TEXT);
        Assert.assertTrue(MobileActionManager.isEnabled(HomeConstants.TIME_ENTRIES_TEXT), HomeConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }
    
}
