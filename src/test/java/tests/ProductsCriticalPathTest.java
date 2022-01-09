package tests;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class ProductsCriticalPathTest extends BaseTest {

    @Test
    public void productShouldBeAddedIntoCart() {
        loginPage.openPage();
        loginPage.login("standard_user", "secret_sauce");


        inventoryPage.addToCart("Sauce Labs Onesie");
        inventoryPage.open();


        //TODO validate name and price


    }

}
