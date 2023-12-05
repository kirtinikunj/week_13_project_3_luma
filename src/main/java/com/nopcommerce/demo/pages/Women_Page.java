package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

/**
 * 1. verifyTheSortByProductNameFilter
 * * Mouse Hover on Women Menu
 * * Mouse Hover on Tops
 * * Click on Jackets
 * * Select Sort By filter “Product Name”
 * * Verify the products name display in
 * alphabetical order
 * 2. verifyTheSortByPriceFilter
 * * Mouse Hover on Women Menu
 * * Mouse Hover on Tops
 * * Click on Jackets
 * * Select Sort By filter “Price”
 * * Verify the products price display in
 * Low to High
 */
public class Women_Page extends Utility {

    By jacket=By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");
    By sort=By.xpath("//div[@class='page-wrapper']//div[2]//div[3]//select[1]");
    By price =By.xpath("//div[@class='page-wrapper']//div[2]//div[3]//select[1]");
    public void clickOnJacket(){
        clickOnElement(jacket);
    }

    public void selectFilter(){
        selectByValueFromDropDown(sort,"name");
    }

    public void selectFilterPrice(){
        selectByValueFromDropDown(price,"price");
    }

}
