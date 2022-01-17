package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.base.BaseTest;
import utils.AllureUtils;

public class CartPageTest extends BaseTest {


    @Test (description = "Open cart page")
    public void openCart() {
        loginPage.openPage();
        loginPage.login("standard_user", "secret_sauce");
        inventoryPage.addToCart("Sauce Labs Onesie");
        cartPage.clickToCart();
        Assert.assertEquals(cartPage.getCartTitle(), "YOUR CART", "Cart page did't open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test (description = "Add item into cart")
    public void addItemToCart() {
        loginPage.openPage();
        loginPage.login("standard_user", "secret_sauce");
        inventoryPage.addToCart("Sauce Labs Onesie");
        cartPage.clickToCart();
        Assert.assertEquals(cartPage.itemTitleInCart(), "Sauce Labs Onesie", "Product not added");
        AllureUtils.takeScreenshot(driver);
    }

    @Test (description = "Remove item from cart")
    public void removeItemFromCart() {
        loginPage.openPage();
        loginPage.login("standard_user", "secret_sauce");
        inventoryPage.addToCart("Sauce Labs Onesie");
        cartPage.clickToCart();
        cartPage.removeFromCart();
        Assert.assertTrue(cartPage.removedCartItemLine(),"Cart has not been emptied");
        AllureUtils.takeScreenshot(driver);

    }

    @Test (description = "Match product information from inventory page with product cart information")
    public void conformityNameOfProduct() {
        loginPage.openPage();
        loginPage.login("standard_user", "secret_sauce");
        inventoryPage.addToCart("Sauce Labs Onesie");
        cartPage.clickToCart();
        Assert.assertEquals(cartPage.nameItemFromCart(), "Sauce Labs Onesie","The name of the product did't match");
        AllureUtils.takeScreenshot(driver);
    }

    @Test (description = "Match product information from inventory page with product cart information")
    public void conformityAnotherNameOfProduct() {
        loginPage.openPage();
        loginPage.login("standard_user", "secret_sauce");
        inventoryPage.addToCart("Sauce Labs Backpack");
        cartPage.clickToCart();
        Assert.assertEquals(cartPage.nameItemFromCart(), "Sauce Labs Backpack","The name of the product did't match");
        AllureUtils.takeScreenshot(driver);
    }

}
