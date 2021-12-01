package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ItemInformationTest extends BaseTest {

//        WebElement usernameInput = driver.findElement(By.id("user-name"));
//        WebElement passwordInput = driver.findElement(By.name(""));
//        WebElement loginButton = driver.findElement(By.className(""));
//        WebElement addToCartButton = driver.findElement(By.tagName(""));
//        WebElement inventoryItemNameLabel = driver.findElement(By.linkText(""));
//        WebElement inventoryLabel = driver.findElement(By.partialLinkText(""));
//        WebElement burgerButton = driver.findElement(By.xpath("//button[@id=\"react-burger-menu-btn\"]"));
//        WebElement titleNameForBackpack = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
//        WebElement titleLogo = driver.findElement(By.xpath("//div[contains(@class,'logo')]"));
//        WebElement titleNameForBikeLight = driver.findElement(By.xpath("//div[contains(text(),'Bike Light')]"));
//        WebElement titleFilterOption = driver.findElement(By.xpath("//span[@class='active_option']//ancestor::span"));
//        WebElement firstButtonInLeftMenu = driver.findElement(By.xpath(" //nav[@class='bm-item-list']//descendant::a[1]"));
//        WebElement logoLinkedin = driver.findElement(By.xpath(" //li[@class= 'social_facebook']//following::li"));
//        WebElement navigateMenuList = driver.findElement(By.xpath("//a[@id='about_sidebar_link']//parent::nav"));
//        WebElement logoTwitter = driver.findElement(By.xpath("//li[@class= 'social_facebook']//preceding::li"));
//        WebElement itemPriceByCss = driver.findElement(By.cssSelector(".inventory_item_price"));
//        WebElement logoLinkedInByCss = driver.findElement(By.cssSelector(".footer .social_linkedin"));
//        WebElement activeOptionByCss = driver.findElement(By.cssSelector(".select_container .active_option"));
//        WebElement menuButtonByCss = driver.findElement(By.cssSelector("#react-burger-menu-btn"));
//        WebElement footerByCss = driver.findElement(By.cssSelector("footer"));
//        WebElement usersInfoByCss = driver.findElement(By.cssSelector("div.login_credentials"));
//        WebElement addToCartButtonForTshirtByCss = driver.findElement(By.cssSelector("button[data-test='add-to-cart-sauce-labs-bolt-t-shirt']"));
//        WebElement imgBackpackByCss = driver.findElement(By.cssSelector("img[alt~='Backpack']"));
//        WebElement logoutButtonInMenuByCss = driver.findElement(By.cssSelector("a[id ^= 'logo']"));
//        WebElement logoHeaderByCss = driver.findElement(By.cssSelector("div[class $= 'ogo']"));
//        WebElement imgBackpackByCss = driver.findElement(By.cssSelector("img[alt *= 'kpa']"))
// test


    @Test
    public void checkTheContentsOfSeveralTableCells() {

        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@name='login-button']")).click();

        String nameFromList = driver.findElement(By.xpath("//div[contains(text(),'Backpack')]")).getText();
        String priceFromList = driver.findElement(By.xpath("//div[@class='inventory_item_price']")).getText();
        driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']")).click();

        driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
        String nameFromCart = driver.findElement(By.xpath("//div[@class='inventory_item_name']")).getText();
        String priceFromCart = driver.findElement(By.xpath("//div[@class='inventory_item_price']")).getText();

        Assert.assertEquals(nameFromList, nameFromCart, "Product name does not match");
        Assert.assertEquals(priceFromList, priceFromCart, "Product price does not match");

    }

}
