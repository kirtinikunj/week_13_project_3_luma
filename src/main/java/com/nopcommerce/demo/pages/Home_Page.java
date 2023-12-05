package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class Home_Page extends Utility {

    By women=By.xpath("//a[@id='ui-id-4']//span[contains(text(),'Women')]");
    By tops =By.xpath("//a[@id='ui-id-9']");
    public void mouseHoverOnWomenMenu(){
        mouseHoverToElement(women);
    }

    public void mouseHoverOnTops() {
        mouseHoverToElement(tops);
    }

    By men=By.xpath("//span[normalize-space()='Men']");
    By bottoms=By.cssSelector("//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]");

    public void mouseHoverOnMen(){
        mouseHoverToElement(men);
    }

    public void mouseHoverOnBottoms(){
        mouseHoverToElement(bottoms);
    }
}
