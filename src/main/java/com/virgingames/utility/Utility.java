package com.virgingames.utility;

import com.virgingames.browserfactory.ManageBrowser;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class Utility extends ManageBrowser {

    /**
     * Take screenshot in Byte Format
     */

    public static byte[] getScreenShot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
    /**
     * This method will click on element
     */

    public void clickOnElement(WebElement element) {
        element.click();
    }
    /**
     * This method will get text from element
     */

    public String getTextFromElement(WebElement element) {
        return element.getText();
    }
}
