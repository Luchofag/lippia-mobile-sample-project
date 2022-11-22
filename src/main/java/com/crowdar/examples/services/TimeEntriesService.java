package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.constants.TimeEntryConstants;

public class TimeEntriesService {
    public static void isViewLoaded(){
        MobileActionManager.waitVisibility(HomeConstants.ADD_TIME_ENTRY_BUTTON_LOCATOR);
        MobileActionManager.click(HomeConstants.ADD_TIME_ENTRY_BUTTON_LOCATOR);
        MobileActionManager.waitVisibility(TimeEntryConstants.TITLE_TEXT_LOCATOR);
    }
    public static void addHour(int hour){
        for (int i = 0; i < hour ; i++) {
            MobileActionManager.click(TimeEntryConstants.HOUR_BUTTON_LOCATOR);
        }
    }

    public static void addMinute(int minute){
        for (int i = 0; i < minute ; i++) {
            MobileActionManager.click(TimeEntryConstants.MINUTE_BUTTON_LOCATOR);
        }
    }
    public static void addDate(){
        MobileActionManager.click(HomeConstants.ADD_TIME_ENTRY_BUTTON_LOCATOR);
        MobileActionManager.click(TimeEntryConstants.CALENDAR_BUTTON_LOCATOR);
        MobileActionManager.waitVisibility(TimeEntryConstants.CALENDAR_TEXT_LOCATOR);
        MobileActionManager.click(TimeEntryConstants.NEXT_MONTH_BTN_LOCATOR);
        MobileActionManager.click(TimeEntryConstants.DATE_BUTTON_LOCATOR);
        MobileActionManager.click(TimeEntryConstants.SAVE_DATE_BUTTON_LOCATOR);
    }

    public static void confirmEntry(){
        MobileActionManager.click(TimeEntryConstants.SAVE_ENTRY_BUTTON_LOCATOR);
    }
}
