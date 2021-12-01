package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    public static final By CART_BUTTON = By.xpath("//a[@class='shopping_cart_link']");
    public static final By CART_TITLE = By.xpath("//span[@class='title']");
    public static final By CONTINUESHOPPING_BUTTON = By.xpath("//button[@id='continue-shopping']");
    public static final By ITEM_TITLE_IN_CART = By.xpath("//div[@class='inventory_item_name']");
    public static final By NAME_ITEM_FROM_CART = By.xpath("//a[div[@class=\"inventory_item_name\"]]/div");


    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void openCartPage() {

        driver.get("https://www.saucedemo.com/cart.html");
    }

    public void removeFromCart() {
        driver.findElement(By.xpath("//button[@class='btn btn_secondary btn_small cart_button']")).click();
    }

    public void compareOfProductName() {

    }

    public void clickToCart() {
        driver.findElement(CART_BUTTON).click();


    }

    public String getCartTitle() {
        return driver.findElement(CART_TITLE).getText();

    }

    public void clickToContinueShopping() {
        driver.findElement(CONTINUESHOPPING_BUTTON).click();
    }

    public String itemTitleInCart() {
        return driver.findElement(ITEM_TITLE_IN_CART).getText();

    }

    public String nameItemFromCart() {
        return driver.findElement(NAME_ITEM_FROM_CART).getText();

    }


}
