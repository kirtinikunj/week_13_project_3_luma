package com.nopcommerce.demo.test_suite;

import com.nopcommerce.demo.pages.Home_Page;
import com.nopcommerce.demo.pages.Men_Page;
import com.nopcommerce.demo.test_base.Base_Test;
import org.junit.Test;

public class Men_Test extends Base_Test {

    Home_Page homePage=new Home_Page();
    Men_Page menPage=new Men_Page();

    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart(){
        homePage.mouseHoverOnMen();
        homePage.mouseHoverOnBottoms();
        menPage.clickOnPants();
        menPage.mouseHoverOnProductAndCLickOnSize();
        menPage.mouseHoverOnProductAndCLickOnColour();
        menPage.mouseHoverOnProductAndCLickOnAddToCart();
    }
}
