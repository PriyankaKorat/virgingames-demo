package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Allow all cookies')]")
    WebElement allowCookies;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Online Slots')]")
    WebElement onlineSlots;

    public void clickOnAllowCookies(){
        clickOnElement(allowCookies);
        log.info("Clicking on allow cookies : " + allowCookies.toString());
    }

    public void clickOnOnlineSlots(){
        clickOnElement(onlineSlots);
        log.info("Clicking on online slot : " + onlineSlots.toString());
    }



}
