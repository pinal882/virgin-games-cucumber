package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class OnlineSlotsPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Play Online Slots at Virgin Games']")
    WebElement playOnlineSlotsAtVirginGamesText;

    public String verifyPlayOnlineSlotsAtVirginGamesText(){
        return getTextFromElement(playOnlineSlotsAtVirginGamesText);
    }
}
