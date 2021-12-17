package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class CartPageTest extends BaseTest {


    @Test
    public void openCart() {
        loginPage.openPage();
        loginPage.login("standard_user", "secret_sauce");
        inventoryPage.addToCart("Sauce Labs Onesie");
        cartPage.clickToCart();
        Assert.assertEquals(cartPage.getCartTitle(), "YOUR CART", "Cart page did't open");
    }

    @Test
    public void addItemFromCart() {
        loginPage.openPage();
        loginPage.login("standard_user", "secret_sauce");
        inventoryPage.addToCart("Sauce Labs Onesie");
        cartPage.clickToCart();
        Assert.assertEquals(cartPage.itemTitleInCart(), "Sauce Labs Onesie", "Product not added");

    }

    @Test
    public void removeItemFromCart() {
        loginPage.openPage();
        loginPage.login("standard_user", "secret_sauce");
        inventoryPage.addToCart("Sauce Labs Onesie");
        cartPage.clickToCart();
        cartPage.removeFromCart();

    }

    @Test
    public void backToContunieShopping() {
        loginPage.openPage();
        loginPage.login("standard_user", "secret_sauce");
        inventoryPage.addToCart("Sauce Labs Onesie");
        cartPage.clickToCart();
        cartPage.clickToContinueShopping();
        inventoryPage.getInventoryTitle();
        Assert.assertEquals(inventoryPage.getInventoryTitle(), "PRODUCTS", "Inventory page did't open");

    }

    @Test
    public void conformityNameOfProduct() {
        loginPage.openPage();
        loginPage.login("standard_user", "secret_sauce");
        inventoryPage.addToCart("Sauce Labs Onesie");
        cartPage.clickToCart();
        Assert.assertEquals(cartPage.nameItemFromCart(), "Sauce Labs Onesie",
                "The name of the product did't match");

    }

}
