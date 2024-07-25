package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BlogPage extends Utility {
    private static final Logger log = LogManager.getLogger(BlogPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Blog')]")
    WebElement blogTab;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome to the Virgin Games Blog')]")
    WebElement welcomeText;

    public void clickOnBlog(){
        clickOnElement(blogTab);
        log.info("Clicking on blog link : "+ blogTab.toString());
    }

    public String verifyWelcomeText(){
        String message = getTextFromElement(welcomeText);
        log.info("Get welcome text : " + welcomeText.getText());
        return message;

    }
}
