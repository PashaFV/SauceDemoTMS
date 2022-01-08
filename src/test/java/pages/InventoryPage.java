package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class InventoryPage extends BasePage {

    public static final String ADD_PRODUCT_BUTTON = "//div[div[div[a[div[@class=\"inventory_item_name\"][text()=\"%s\"]]]]]//button";
    public static final By INVENTORY_TITLE = By.xpath("//button[@id='continue-shopping']");

    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    @Step("Open inventory page")
    public void open() {
        driver.get("https://www.saucedemo.com/cart.html");
    }

    @Step("Click add to cart button")
    public void addToCart(String nameProduct) {
        driver.findElement(By.xpath(String.format(ADD_PRODUCT_BUTTON, nameProduct))).click();

    }

    @Step("Get inventory title")
    public String getInventoryTitle() {
        return driver.findElement(INVENTORY_TITLE).getText();

    }

    @Step("Get inventory title")
    public boolean inventoryTitleDisplayed() {
        return driver.findElement(INVENTORY_TITLE).isDisplayed();
    }

}
