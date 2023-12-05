package com.nopcommerce.demo.test_suite;

import com.nopcommerce.demo.pages.Home_Page;
import com.nopcommerce.demo.pages.Women_Page;
import com.nopcommerce.demo.test_base.Base_Test;
import org.junit.Test;

public class Women_Test extends Base_Test {

    Home_Page homePage=new Home_Page();
    Women_Page womenPage=new Women_Page();

    @Test
    public void verifyTheSortByProductNameFilter(){
        homePage.mouseHoverOnWomenMenu();
        homePage.mouseHoverOnTops();
        womenPage.clickOnJacket();
        womenPage.selectFilter();
    }

    @Test
    public void  verifyTheSortByPriceFilter(){
        homePage.mouseHoverOnWomenMenu();
        homePage.mouseHoverOnTops();
        womenPage.clickOnJacket();
        womenPage.selectFilterPrice();
    }
}
