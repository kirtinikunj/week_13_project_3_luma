package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

/**
 * 1. userShouldAddProductSuccessFullyTo
 * ShoppinCart()
 * * Mouse Hover on Men Menu
 * * Mouse Hover on Bottoms
 * * Click on Pants
 * * Mouse Hover on product name
 * ‘Cronus Yoga Pant’ and click on size
 * 32.
 * * Mouse Hover on product name
 * ‘Cronus Yoga Pant’ and click on colour
 * Black.
 * * Mouse Hover on product name
 * ‘Cronus Yoga Pant’ and click on
 * ‘Add To Cart’ Button.
 * * Verify the text
 * ‘You added Cronus Yoga Pant to your shopping cart.’
 * * Click on ‘shopping cart’ Link into
 * message
 * * Verify the text ‘Shopping Cart.’
 * * Verify the product name ‘Cronus Yoga Pant’
 * * Verify the product size ‘32’
 * * Verify the product colour ‘Black’
 */
public class Men_Page extends Utility {

    By pants=By.cssSelector("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    By product=By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By size =By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']");
    By colour=By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']");
    By cart=By.cssSelector("//li[1]//div[1]//div[1]//div[3]//div[1]//div[1]//form[1]//button[1]//span[1]");
    By text=By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");

    public void clickOnPants(){
        clickOnElement(pants);
    }

    public void mouseHoverOnProductAndCLickOnSize(){
        mouseHoverToElement(product);
        clickOnElement(size);
    }

    public void mouseHoverOnProductAndCLickOnColour(){
        mouseHoverToElement(product);
        clickOnElement(colour);
    }

    public void mouseHoverOnProductAndCLickOnAddToCart(){
        mouseHoverToElement(product);
        clickOnElement(cart);
    }

}
