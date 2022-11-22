package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import org.testng.Assert;
public class HomeService {

    public static void isViewLoaded() {
        MobileActionManager.waitVisibility(HomeConstants.SETTINGS_BUTTON_LOCATOR);
        Assert.assertTrue(MobileActionManager.isVisible(HomeConstants.TIME_ENTRY_LIST_LOCATOR), HomeConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }
}
