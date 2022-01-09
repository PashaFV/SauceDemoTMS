package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tests.base.BaseTest;
import tests.base.Retry;
import utils.AllureUtils;

public class LoginPageTest extends BaseTest {


    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][]{
                {"", "secret_sauce", "Epic sadface: Username is required"},
                {"standard_user", "", "Epic sadface: Password is required"},
                {"usertest", "12345", "Epic sadface: Username and password do not match any user in this service"},
                {"locked_out_user", "secret_sauce", "Epic sadface: Sorry, this user has been locked out."},

        };
    }

    @Test(dataProvider = "loginData", description = "Login with invalid users data")
    public void negativeLoginTest(String userName, String password, String errorMessage) {
        loginPage.openPage();
        loginPage.login(userName, password);
        Assert.assertEquals(loginPage.getErrorMessage(), errorMessage, "Сообщение об ошибке не появилось");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Login with valid user data")
    public void positiveLogin() {
        loginPage.openPage();
        loginPage.login("standard_user", "secret_sauce");
        Assert.assertTrue(inventoryPage.inventoryTitleDisplayed(), "Переход в каталог не осуществлён");
        AllureUtils.takeScreenshot(driver);
    }

}
