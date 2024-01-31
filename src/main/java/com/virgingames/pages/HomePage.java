package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Necessary cookies only']")
    WebElement cookies;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Join Now']")
    WebElement joinNowTab;
   // @CacheLookup
   // @FindBy(linkText = "Online Slots")
   // WebElement onlineslotsTab;
    @CacheLookup
    @FindBy(xpath = "//li[@class='StyledNavigationMenuListItem-sc-v46bks-2 hRASAg']/a/span")
    List<WebElement> topMenu;


    public String getTitle() {
        return driver.getTitle();
    }

    public void clickOnNecessaryCookiesOnly() {
        clickOnElement(cookies);
    }

    public void clickOnJoinNowTab() {
        clickOnElement(joinNowTab);
    }

   // public void clickOnOnlineSlotsTab() {
     //   clickOnElement(onlineslotsTab);
   // }

    public void selectTopMenu(String tab) {
        for (WebElement menu : topMenu) {
            if (menu.getText().equals(tab)) {
                clickOnElement(menu);
                break;
            }

        }
    }
}
