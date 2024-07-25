package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class OnlineSlotPage extends Utility {
    private static final Logger log = LogManager.getLogger(OnlineSlotPage.class.getName());

    public OnlineSlotPage() {
        PageFactory.initElements(driver, this);
    }

    public String getTheCurrentUrl() {
        log.info("Getting Online slot link  : " + driver.getCurrentUrl());
        return driver.getCurrentUrl();

    }
}
