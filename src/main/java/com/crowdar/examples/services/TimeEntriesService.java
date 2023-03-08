package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.constants.TimeEntryConstants;
import org.testng.Assert;

import java.time.LocalDate;

public class TimeEntriesService {
    public static void isViewLoaded(){
        MobileActionManager.waitVisibility(HomeConstants.ADD_TIME_ENTRY_BUTTON_LOCATOR);
        MobileActionManager.click(HomeConstants.ADD_TIME_ENTRY_BUTTON_LOCATOR);
        MobileActionManager.waitVisibility(TimeEntryConstants.TITLE_TEXT_LOCATOR);
    }
    public static void addHour(int hour){
        if(hour < 13 && hour > -1) {
            for (int i = 0; i < hour; i++) {
                MobileActionManager.click(TimeEntryConstants.HOUR_DOWN_BUTTON);
            }
        }else if(hour > 12 && hour < 24){
            hour = 60 - hour;
            for (int i = 0; i < hour; i++) {
                MobileActionManager.click(TimeEntryConstants.HOUR_UP_BUTTON);
            }
        }
    }

    public static void addMinute(int minute){
        if(minute < 31 && minute > -1) {
            for (int i = 0; i < minute; i++) {
                MobileActionManager.click(TimeEntryConstants.MINUTE_DOWN_BUTTON);
            }
        }else if(minute > 30 && minute < 60){
            minute = 60 - minute;
            for (int i = 0; i < minute; i++) {
                MobileActionManager.click(TimeEntryConstants.MINUTE_UP_BUTTON);
            }
        }
    }
    public static void addDate(String day,String month,String year){
        MobileActionManager.click(TimeEntryConstants.TIME_ENTRY_SELECT_DATE);
        MobileActionManager.waitVisibility(TimeEntryConstants.CALENDAR_TEXT_LOCATOR);
        seleccionarMes(month);
        MobileActionManager.click("ACCESSIBILITY_ID:".concat(concatDate(day,month,year)));
        MobileActionManager.click(TimeEntryConstants.SAVE_DATE_BUTTON);
    }

    public static void confirmEntry(){
        MobileActionManager.click(TimeEntryConstants.SAVE_ENTRY_BUTTON_LOCATOR);
    }

    public static void addDescription(String description){
        MobileActionManager.setInput(TimeEntryConstants.DESCRIPTION_INPUT, description);
    }

    public static void seleccionarMes(String mes){
        int mesActual = LocalDate.now().getMonthValue();
        int mesSeleccionado = 0;
        switch (mes){
            case "January":
                mesSeleccionado = 1;
                if(mesSeleccionado < mesActual){
                    for (int i = mesActual;i > mesSeleccionado; i--){
                        MobileActionManager.click(TimeEntryConstants.PREV_MONTH_BTN);
                    }
                }
                if(mesSeleccionado > mesActual){
                    for (int i = mesActual;i < mesSeleccionado; i++){
                        MobileActionManager.click(TimeEntryConstants.NEXT_MONTH_BTN);
                    }
                }
                break;
            case "February":
                mesSeleccionado = 2;
                if(mesSeleccionado < mesActual){
                    for (int i = mesActual;i > mesSeleccionado; i--){
                        MobileActionManager.click(TimeEntryConstants.PREV_MONTH_BTN);
                    }
                }
                if (mesSeleccionado > mesActual) {
                    for (int i = mesActual;i < mesSeleccionado; i++){
                        MobileActionManager.click(TimeEntryConstants.NEXT_MONTH_BTN);
                    }
                }
                break;
            case "March":
                mesSeleccionado = 3;
                if(mesSeleccionado < mesActual){
                    for (int i = mesActual;i > mesSeleccionado; i--){
                        MobileActionManager.click(TimeEntryConstants.PREV_MONTH_BTN);
                    }
                }
                if (mesSeleccionado > mesActual) {
                    for (int i = mesActual;i < mesSeleccionado; i++){
                        MobileActionManager.click(TimeEntryConstants.NEXT_MONTH_BTN);
                    }
                }
                break;
            case "April":
                mesSeleccionado = 4;
                if(mesSeleccionado < mesActual){
                    for (int i = mesActual;i > mesSeleccionado; i--){
                        MobileActionManager.click(TimeEntryConstants.PREV_MONTH_BTN);
                    }
                }
                if (mesSeleccionado > mesActual) {
                    for (int i = mesActual;i < mesSeleccionado; i++){
                        MobileActionManager.click(TimeEntryConstants.NEXT_MONTH_BTN);
                    }
                }
                break;
            case "May":
                mesSeleccionado = 5;
                if(mesSeleccionado < mesActual){
                    for (int i = mesActual;i > mesSeleccionado; i--){
                        MobileActionManager.click(TimeEntryConstants.PREV_MONTH_BTN);
                    }
                }
                if (mesSeleccionado > mesActual) {
                    for (int i = mesActual;i < mesSeleccionado; i++){
                        MobileActionManager.click(TimeEntryConstants.NEXT_MONTH_BTN);
                    }
                }
                break;
            case "June":
                mesSeleccionado = 6;
                if(mesSeleccionado < mesActual){
                    for (int i = mesActual;i > mesSeleccionado; i--){
                        MobileActionManager.click(TimeEntryConstants.PREV_MONTH_BTN);
                    }
                }
                if (mesSeleccionado > mesActual) {
                    for (int i = mesActual;i < mesSeleccionado; i++){
                        MobileActionManager.click(TimeEntryConstants.NEXT_MONTH_BTN);
                    }
                }
                break;
            case "July":
                mesSeleccionado = 7;
                if(mesSeleccionado < mesActual){
                    for (int i = mesActual;i > mesSeleccionado; i--){
                        MobileActionManager.click(TimeEntryConstants.PREV_MONTH_BTN);
                    }
                }
                if (mesSeleccionado > mesActual) {
                    for (int i = mesActual;i < mesSeleccionado; i++){
                        MobileActionManager.click(TimeEntryConstants.NEXT_MONTH_BTN);
                    }
                }
                break;
            case "August":
                mesSeleccionado = 8;
                if(mesSeleccionado < mesActual){
                    for (int i = mesActual;i > mesSeleccionado; i--){
                        MobileActionManager.click(TimeEntryConstants.PREV_MONTH_BTN);
                    }
                }
                if (mesSeleccionado > mesActual) {
                    for (int i = mesActual;i < mesSeleccionado; i++){
                        MobileActionManager.click(TimeEntryConstants.NEXT_MONTH_BTN);
                    }
                }
                break;
            case "September":
                mesSeleccionado = 9;
                if(mesSeleccionado < mesActual){
                    for (int i = mesActual;i > mesSeleccionado; i--){
                        MobileActionManager.click(TimeEntryConstants.PREV_MONTH_BTN);
                    }
                }
                if (mesSeleccionado > mesActual) {
                    for (int i = mesActual;i < mesSeleccionado; i++){
                        MobileActionManager.click(TimeEntryConstants.NEXT_MONTH_BTN);
                    }
                }
                break;
            case "October":
                mesSeleccionado = 10;
                if(mesSeleccionado < mesActual){
                    for (int i = mesActual;i > mesSeleccionado; i--){
                        MobileActionManager.click(TimeEntryConstants.PREV_MONTH_BTN);
                    }
                }
                if (mesSeleccionado > mesActual) {
                    for (int i = mesActual;i < mesSeleccionado; i++){
                        MobileActionManager.click(TimeEntryConstants.NEXT_MONTH_BTN);
                    }
                }
                break;
            case "November":
                mesSeleccionado = 11;
                if(mesSeleccionado < mesActual){
                    for (int i = mesActual;i > mesSeleccionado; i--){
                        MobileActionManager.click(TimeEntryConstants.PREV_MONTH_BTN);
                    }
                }
                if (mesSeleccionado > mesActual) {
                    for (int i = mesActual;i < mesSeleccionado; i++){
                        MobileActionManager.click(TimeEntryConstants.NEXT_MONTH_BTN);
                    }
                }
                break;
            case "December":
                mesSeleccionado = 12;
                if(mesSeleccionado < mesActual){
                    for (int i = mesActual;i > mesSeleccionado; i--){
                        MobileActionManager.click(TimeEntryConstants.PREV_MONTH_BTN);
                    }
                }
                if (mesSeleccionado > mesActual) {
                    for (int i = mesActual;i < mesSeleccionado; i++){
                        MobileActionManager.click(TimeEntryConstants.NEXT_MONTH_BTN);
                    }
                }
                break;
            default:
        }
    }
    public static String concatDate(String day, String month, String year){
        String date = day+" "+month+" "+year;
        return date;
    }

    public static void lastEntryDetails(){
        MobileActionManager.click(TimeEntryConstants.PROJECT_SECTION);
        MobileActionManager.waitVisibility(TimeEntryConstants.FINAL_PROJECT);
        MobileActionManager.click(TimeEntryConstants.FINAL_PROJECT);
    }
    public static void discardChanges(){
        MobileActionManager.waitVisibility(TimeEntryConstants.TOOLBAR_DISCARD_BUTTON);
        MobileActionManager.click(TimeEntryConstants.TOOLBAR_DISCARD_BUTTON);
        MobileActionManager.waitVisibility(TimeEntryConstants.DISCARD_BUTTON);
        MobileActionManager.click(TimeEntryConstants.DISCARD_BUTTON);
        MobileActionManager.click(TimeEntryConstants.RETURN_BUTTON);
    }

    public static void changeToDarkmode(){
        MobileActionManager.waitVisibility(TimeEntryConstants.OPEN_DRAWER_BUTTON);
        MobileActionManager.click(TimeEntryConstants.OPEN_DRAWER_BUTTON);
        MobileActionManager.click(TimeEntryConstants.SETTING_BUTTON);
        MobileActionManager.click(TimeEntryConstants.SET_DARK_MODE_BUTTON);
        MobileActionManager.click(TimeEntryConstants.OPEN_DRAWER_BUTTON);
        MobileActionManager.click(TimeEntryConstants.TIME_TRACKER_BUTTON);
    }

    public static void logOut(){
        MobileActionManager.click(TimeEntryConstants.OPEN_DRAWER_BUTTON);
        MobileActionManager.click(TimeEntryConstants.LOGOUT_BUTTON);
        MobileActionManager.waitVisibility(TimeEntryConstants.CONFIRM_LOGOUT_BUTTON);
        MobileActionManager.click(TimeEntryConstants.CONFIRM_LOGOUT_BUTTON);
    }

    public static void verifyLogout(){
        Assert.assertTrue(MobileActionManager.waitVisibility(TimeEntryConstants.SIGNUP_LOGO).isDisplayed());
    }
}
